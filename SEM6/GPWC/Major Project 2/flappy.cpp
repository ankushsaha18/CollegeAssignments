#include <SFML/Graphics.hpp>
#include <vector>
#include <ctime>
#include <cstdlib>
#include <fstream>
#include <iostream>
#include <algorithm>

using namespace sf;
using namespace std;

// ---------------- BIRD ----------------
class Bird {
private:
    Sprite sprite;
    Texture texture;
    float velocity;

public:
    Bird() {
        if (!texture.loadFromFile("Assets/Bird.png"))
        cout << "Error loading Bird\n";
        sprite.setTexture(texture);
        sprite.setScale(0.2f, 0.2f);
        sprite.setPosition(100, 300);
        velocity = 0;
    }

    void update(float delta) {
        velocity += 800 * delta;
        sprite.move(0, velocity * delta);
    }

    void flap() {
        velocity = -300;
    }

    Sprite& getSprite() {
        return sprite;
    }

    void reset() {
        sprite.setPosition(100, 300);
        velocity = 0;
    }
};

// ---------------- PIPE ----------------
class Pipe {
private:
    Sprite topPipe, bottomPipe;
    static Texture texture;

public:
    bool passed;

    Pipe(float x) {
        if (texture.getSize().x == 0) {
            if (!texture.loadFromFile("Assets/Pipes.png"))
                cout << "Error loading Pipes\n";
        }

        topPipe.setTexture(texture);
        bottomPipe.setTexture(texture);

        float gap = 180;
        float height = rand() % 300 + 100;

        topPipe.setPosition(x, height - 400);
        bottomPipe.setPosition(x, height + gap);
        passed = false;
    }

    void update(float delta, float speed) {
        topPipe.move(-speed * delta, 0);
        bottomPipe.move(-speed * delta, 0);
    }

    void draw(RenderWindow &window) {
        window.draw(topPipe);
        window.draw(bottomPipe);
    }

    bool isOffScreen() {
        return topPipe.getPosition().x < -100;
    }

    bool collision(Sprite &bird) {
        return topPipe.getGlobalBounds().intersects(bird.getGlobalBounds()) || bottomPipe.getGlobalBounds().intersects(bird.getGlobalBounds());
    }

    float getX() {
        return topPipe.getPosition().x;
    }
};

Texture Pipe::texture;

// ---------------- MAIN ----------------
int main() {
    srand(time(0));

    RenderWindow window(VideoMode(500, 700), "Flappy Bird");
    window.setFramerateLimit(60);

    Bird bird;
    vector<Pipe> pipes;

    float spawnTimer = 0;
    float spawnDelay = 1.5f;
    float speed = 200;

    int score = 0;
    int highScore = 0;

    ifstream in("score.txt");

    if (in.is_open()) {
        in >> highScore;
        in.close();
    }

    Font font;

    if (!font.loadFromFile("KOMIKAP_.ttf"))
        cout << "Error loading Font\n";

    Text scoreText, highScoreText, gameOverText;

    scoreText.setFont(font);
    highScoreText.setFont(font);
    gameOverText.setFont(font);

    scoreText.setCharacterSize(20);
    highScoreText.setCharacterSize(20);
    gameOverText.setCharacterSize(30);

    scoreText.setPosition(10, 10);
    highScoreText.setPosition(320, 10);
    gameOverText.setPosition(60, 300);

    scoreText.setFillColor(Color::Red);
    highScoreText.setFillColor(Color::Blue);
    gameOverText.setFillColor(Color::Black);

    bool gameOver = false;

    Clock clock;

    while (window.isOpen()) {
        float delta = clock.restart().asSeconds();
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed)
                window.close();
            if (event.type == Event::KeyPressed && event.key.code == Keyboard::Space) {
                if (!gameOver)
                    bird.flap();
            }
        }

        // restart
        if (gameOver && Keyboard::isKeyPressed(Keyboard::R)) {
            pipes.clear();
            bird.reset();
            score = 0;
            gameOver = false;
        }

        // update bird
        if (!gameOver)
            bird.update(delta);

        // spawn pipes
        if (!gameOver) {
            spawnTimer += delta;
            if (spawnTimer > spawnDelay) {
                pipes.push_back(Pipe(500));
                spawnTimer = 0;
            }
        }

        // update pipes
        for (auto &p : pipes)
            p.update(delta, speed);

        // remove pipes
        pipes.erase(remove_if(pipes.begin(), pipes.end(),[](Pipe &p) { return p.isOffScreen(); }), pipes.end());

        // collision
        for (auto &p : pipes) {
            if (p.collision(bird.getSprite()))
                gameOver = true;
        }

        // top and bottom collision
        if (bird.getSprite().getPosition().y < 0 || bird.getSprite().getPosition().y > 650)
            gameOver = true;

        // scoring
        for (auto &p : pipes) {
            if (p.getX() < 100 && !p.passed) {
                score++;
                p.passed = true;
            }
        }

        // save high score
        if (gameOver && score > highScore) {
            highScore = score;
            ofstream out("score.txt");
            out << highScore;
            out.close();
        }

        scoreText.setString("Score: " + to_string(score));
        highScoreText.setString("High Score: " + to_string(highScore));

        if (gameOver)
            gameOverText.setString("GAME OVER !!!\nPRESS R TO RESTART");

        // draw
        window.clear(Color::White);
        window.draw(bird.getSprite());

        for (auto &p : pipes)
            p.draw(window);

        window.draw(scoreText);
        window.draw(highScoreText);

        if (gameOver)
            window.draw(gameOverText);

        window.display();
    }
    return 0;
}