#include <SFML/Graphics.hpp>
#include <iostream>
#include "Player.cpp"
#include "Zombie.cpp"
#include "Bullet.cpp"
#include <sstream>

using namespace sf;

int createBackground(VertexArray &rVA, IntRect arena);
Zombie *createHorde(int numZombies, IntRect arena);

int main() {
	int wave = 0;

	enum class State {
		PAUSED,
		LEVELING_UP,
		GAME_OVER,
		PLAYING,
		NEXTWAVE
	};

	State state = State::GAME_OVER;

	Vector2f resolution;
	resolution.x = 1920;
	resolution.y = 1080;

	RenderWindow window(VideoMode(800, 600), "Zombie Arena", Style::Fullscreen);

	View mainView(FloatRect(0, 0, resolution.x, resolution.y));
	window.setView(mainView);

	int numZombies;
	int numZombiesAlive;

	Zombie *zombies = nullptr;

	Bullet bullets[100];
	int currentBullet = 0;

	int bulletsSpare = 24;
	int bulletsInClip = 6;
	int clipSize = 6;

	float fireRate = 3;

	Time lastPressed;

	Clock clock;
	Time gameTimeTotal;

	Vector2f mouseWorldPosition;
	Vector2i mouseScreenPosition;

	window.setMouseCursorVisible(true);

	Texture textureCrosshair;
	textureCrosshair.loadFromFile("graphics/crosshair.png");

	Sprite spriteCrosshair;
	spriteCrosshair.setTexture(textureCrosshair);
	spriteCrosshair.setOrigin(25, 25);

	Player player;

	IntRect arena;
	arena.height = 500;
	arena.width = 500;

	VertexArray background;

	Texture textureBackground;
	textureBackground.loadFromFile("graphics/background_sheet.png");

	int score = 0;
	int hiScore = 0;

	Sprite spriteGameOver;
	Texture textureGameOver;
	textureGameOver.loadFromFile("graphics/background.png");

	spriteGameOver.setTexture(textureGameOver);
	spriteGameOver.setPosition(0, 0);

	View hudView(FloatRect(0, 0, resolution.x, resolution.y));
	View gameOverView(FloatRect(0, 0, resolution.x, resolution.y));

	Sprite spriteAmmoIcon;
	Texture textureAmmoIcon;
	textureAmmoIcon.loadFromFile("graphics/ammo_icon.png");

	spriteAmmoIcon.setTexture(textureAmmoIcon);
	spriteAmmoIcon.setPosition(20, 980);

	Font font;
	font.loadFromFile("font/zombiecontrol.ttf");

	Text pausedText;
	pausedText.setFont(font);
	pausedText.setCharacterSize(155);
	pausedText.setFillColor(Color::White);
	pausedText.setPosition(400, 400);
	pausedText.setString("Press Enter \nto continue");

	Text gameOverText;
	gameOverText.setFont(font);
	gameOverText.setCharacterSize(125);
	gameOverText.setFillColor(Color::White);
	gameOverText.setString("Press Enter to play");

	FloatRect gameOverTextRect = gameOverText.getLocalBounds();

	gameOverText.setOrigin(gameOverTextRect.width / 2, gameOverTextRect.height / 2);

	gameOverText.setPosition(gameOverView.getSize().x / 2, gameOverView.getSize().y / 2);

	Text levelUpText;
	levelUpText.setFont(font);
	levelUpText.setCharacterSize(80);
	levelUpText.setFillColor(Color::White);
	levelUpText.setPosition(150, 250);

	std::stringstream levelUpStream;

	levelUpStream << "0- Start the normal game" << "\n1- Increased rate of fire"
				  << "\n2- Increased clip size(next reload)" << "\n3- Increased max health"
				  << "\n4- Increased run speed";

	levelUpText.setString(levelUpStream.str());

	Text ammoText;
	ammoText.setFont(font);
	ammoText.setCharacterSize(55);
	ammoText.setFillColor(Color::White);
	ammoText.setPosition(200, 980);

	Text scoreText;
	scoreText.setFont(font);
	scoreText.setCharacterSize(55);
	scoreText.setFillColor(Color::White);
	scoreText.setPosition(20, 0);

	Text hiScoreText;
	hiScoreText.setFont(font);
	hiScoreText.setCharacterSize(55);
	hiScoreText.setFillColor(Color::White);
	hiScoreText.setPosition(1400, 0);

	std::stringstream s;
	s << "Hi Score:" << hiScore;
	hiScoreText.setString(s.str());

	Text zombiesRemainingText;
	zombiesRemainingText.setFont(font);
	zombiesRemainingText.setCharacterSize(55);
	zombiesRemainingText.setFillColor(Color::White);
	zombiesRemainingText.setPosition(1500, 980);
	zombiesRemainingText.setString("Zombies: 100");

	Text waveNumberText;
	waveNumberText.setFont(font);
	waveNumberText.setCharacterSize(55);
	waveNumberText.setFillColor(Color::White);
	waveNumberText.setPosition(1250, 980);
	waveNumberText.setString("Wave: 0");

	RectangleShape healthBar;
	healthBar.setFillColor(Color::Red);
	healthBar.setPosition(450, 980);

	while (window.isOpen()) {
		Event event;

		while (window.pollEvent(event)) {
			if (event.type == Event::KeyPressed) {
				if (event.key.code == Keyboard::Return && state == State::PLAYING) {
					state = State::PAUSED;
				}

				else if (event.key.code == Keyboard::Return && state == State::PAUSED) {
					state = State::PLAYING;
					clock.restart();
				}

				else if (event.key.code == Keyboard::Return && state == State::GAME_OVER) {
					state = State::LEVELING_UP;

					wave = 0;
					currentBullet = 0;

					bulletsSpare = 24;
					bulletsInClip = 6;
					clipSize = 6;

					fireRate = 1;
					score = 0;

					player.resetPlayerStats();
				}

				if (state == State::PLAYING) {
					if (event.key.code == Keyboard::R) {
						if (bulletsSpare >= clipSize) {
							bulletsInClip = clipSize;
							bulletsSpare -= clipSize;
						}

						else if (bulletsSpare > 0) {
							bulletsInClip = bulletsSpare;
							bulletsSpare = 0;
						}
					}
				}

				if (state == State::LEVELING_UP) {
					if (event.key.code == Keyboard::Num0) {
						state = State::NEXTWAVE;
					}

					if (event.key.code == Keyboard::Num1) {
						fireRate++;
						state = State::NEXTWAVE;
					}

					if (event.key.code == Keyboard::Num2) {
						clipSize += clipSize;
						state = State::NEXTWAVE;
					}

					if (event.key.code == Keyboard::Num3) {
						player.upgradeHealth();
						state = State::NEXTWAVE;
					}

					if (event.key.code == Keyboard::Num4) {
						player.upgradeSpeed();
						state = State::NEXTWAVE;
					}
				}
			}
		}

		if (Keyboard::isKeyPressed(Keyboard::Escape)) {
			window.close();
		}

		if (state == State::NEXTWAVE) {
			wave++;

			arena.width = arena.width + (wave - 1) * 100;
			arena.height = arena.height + (wave - 1) * 100;

			arena.left = 0;
			arena.top = 0;

			int tileSize = createBackground(background, arena);

			player.spawn(arena, resolution, tileSize);

			numZombies = wave * 2;

			delete[] zombies;

			zombies = createHorde(numZombies, arena);

			numZombiesAlive = numZombies;

			clock.restart();

			state = State::PLAYING;
		}

		if (state == State::PLAYING) {
			if (Keyboard::isKeyPressed(Keyboard::W)) {
				player.moveUp();
			}
			else {
				player.stopUp();
			}

			if (Keyboard::isKeyPressed(Keyboard::S)) {
				player.moveDown();
			}
			else {
				player.stopDown();
			}

			if (Keyboard::isKeyPressed(Keyboard::A)) {
				player.moveLeft();
			}
			else {
				player.stopLeft();
			}

			if (Keyboard::isKeyPressed(Keyboard::D)) {
				player.moveRight();
			}
			else {
				player.stopRight();
			}

			if (Mouse::isButtonPressed(Mouse::Left)) {
				if (gameTimeTotal.asMilliseconds() - lastPressed.asMilliseconds() > 1000 / fireRate && bulletsInClip > 0) {
					bullets[currentBullet].shoot(player.getCenter().x, player.getCenter().y, mouseWorldPosition.x, mouseWorldPosition.y);

					currentBullet++;

					if (currentBullet > 99) {
						currentBullet = 0;
					}

					lastPressed = gameTimeTotal;
					bulletsInClip--;
				}
			}
		}

		if (state == State::PLAYING) {
			Time dt = clock.restart();

			gameTimeTotal += dt;

			float dtAsSeconds = dt.asSeconds();

			mouseScreenPosition = Mouse::getPosition();

			mouseWorldPosition = window.mapPixelToCoords(Mouse::getPosition(), mainView);

			spriteCrosshair.setPosition(mouseWorldPosition);

			player.update(dtAsSeconds, Mouse::getPosition());

			Vector2f playerPosition(player.getCenter());

			mainView.setCenter(player.getCenter());

			for (int i = 0; i < numZombies; i++) {
				zombies[i].update(dtAsSeconds, playerPosition);
			}

			for (int i = 0; i < 100; i++) {
				if (bullets[i].isInFlight()) {
					bullets[i].update(dtAsSeconds);
				}
			}

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < numZombies; j++) {
					if (bullets[i].isInFlight() && zombies[j].isAlive()) {
						if (bullets[i].getPosition().intersects( zombies[j].getPosition())) {
							bullets[i].stop();

							if (zombies[j].hit()) {
								score += 10;

								if (score >= hiScore) {
									hiScore = score;
								}

								numZombiesAlive--;

								if (numZombiesAlive == 0) {
									state = State::NEXTWAVE;
								}
							}
						}
					}
				}
			}

			for (int i = 0; i < numZombies; i++) {
				if (player.getPosition().intersects(zombies[i].getPosition()) && zombies[i].isAlive()) {
					if (player.hit(gameTimeTotal)) {
						// More hereLater
					}

					if (player.getHealth() <= 0) {
						state = State::GAME_OVER;
					}
				}
			}

			healthBar.setSize(Vector2f(player.getHealth() * 3, 70));

			std::stringstream ssAmmo;
			std::stringstream ssScore;
			std::stringstream ssHiScore;
			std::stringstream ssWave;
			std::stringstream ssZombiesAlive;

			ssAmmo << bulletsInClip << "/" << bulletsSpare;
			ammoText.setString(ssAmmo.str());

			ssScore << "Score:" << score;
			scoreText.setString(ssScore.str());

			ssHiScore << "Hi Score:" << hiScore;
			hiScoreText.setString(ssHiScore.str());

			ssWave << "Wave:" << wave;
			waveNumberText.setString(ssWave.str());

			ssZombiesAlive << "Zombies:" << numZombiesAlive;
			zombiesRemainingText.setString(ssZombiesAlive.str());
		}

		window.clear();

		window.setMouseCursorVisible(false);

		if (state == State::PLAYING) {
			window.setView(mainView);

			window.draw(background, &textureBackground);

			for (int i = 0; i < 100; i++) {
				if (bullets[i].isInFlight()) {
					window.draw(bullets[i].getShape());
				}
			}

			window.draw(player.getSprite());

			for (int i = 0; i < numZombies; i++) {
				window.draw(zombies[i].getSprite());
			}

			window.draw(spriteCrosshair);

			window.setView(hudView);

			window.draw(healthBar);
			window.draw(spriteAmmoIcon);
			window.draw(ammoText);
			window.draw(scoreText);
			window.draw(hiScoreText);
			window.draw(waveNumberText);
			window.draw(zombiesRemainingText);
		}

		if (state == State::LEVELING_UP) {
			window.setView(gameOverView);
			window.draw(spriteGameOver);
			window.draw(levelUpText);
		}

		if (state == State::PAUSED) {
			window.setView(gameOverView);
			window.draw(pausedText);
		}

		if (state == State::GAME_OVER) {
			window.setView(gameOverView);
			window.draw(spriteGameOver);
			window.draw(gameOverText);
		}

		window.display();
	}

	return 0;
}

int createBackground(VertexArray &rVA, IntRect arena) {
	// Anything we do to rVA we are actually doing to background (in the main function)
	// How big is each tile/texture
	const int TILE_SIZE = 50;
	const int TILE_TYPES = 3;
	const int VERTS_IN_QUAD = 4;

	int worldWidth = arena.width / TILE_SIZE;
	int worldHeight = arena.height / TILE_SIZE;

	// What type of primitive are we using?
	rVA.setPrimitiveType(Quads);

	// Set the size of the vertex array
	rVA.resize(worldWidth * worldHeight * VERTS_IN_QUAD);

	// Start at the beginning of the vertex array
	int currentVertex = 0;
	for (int w = 0; w < worldWidth; w++) {
		for (int h = 0; h < worldHeight; h++) {

		// Position each vertex in the current quad
		rVA[currentVertex + 0].position = Vector2f(w * TILE_SIZE, h * TILE_SIZE);
		rVA[currentVertex + 1].position = Vector2f((w * TILE_SIZE) + TILE_SIZE, h * TILE_SIZE);
		rVA[currentVertex + 2].position = Vector2f((w * TILE_SIZE) + TILE_SIZE, (h * TILE_SIZE) + TILE_SIZE);
		rVA[currentVertex + 3].position = Vector2f((w * TILE_SIZE), (h * TILE_SIZE) + TILE_SIZE);

		// Define the position in the Texture to draw for current quad
		// Either mud, stone, grass or wall
		if (h == 0 || h == worldHeight - 1 || w == 0 || w == worldWidth - 1) {
				
			// Use the wall texture
			rVA[currentVertex + 0].texCoords = Vector2f(0, 0 + TILE_TYPES * TILE_SIZE);
			rVA[currentVertex + 1].texCoords = Vector2f(TILE_SIZE, 0 + TILE_TYPES * TILE_SIZE);
			rVA[currentVertex + 2].texCoords = Vector2f(TILE_SIZE, TILE_SIZE + TILE_TYPES * TILE_SIZE);
			rVA[currentVertex + 3].texCoords = Vector2f(0, TILE_SIZE + TILE_TYPES * TILE_SIZE);
		}
		else {
			// Use a random floor texture
			srand((int)time(0) + h * w - h);
			int mOrG = (rand() % TILE_TYPES);
			int verticalOffset = mOrG * TILE_SIZE;
			rVA[currentVertex + 0].texCoords = Vector2f(0, 0 + verticalOffset);
			rVA[currentVertex + 1].texCoords = Vector2f(TILE_SIZE, 0 + verticalOffset);
			rVA[currentVertex + 2].texCoords = Vector2f(TILE_SIZE, TILE_SIZE + verticalOffset);
			rVA[currentVertex + 3].texCoords = Vector2f(0, TILE_SIZE + verticalOffset);
		}

		// Position ready for the next for vertices
		currentVertex = currentVertex + VERTS_IN_QUAD;
		}
	}
	return TILE_SIZE;
}

Zombie *createHorde(int numZombies, IntRect arena) {
	Zombie *zombies = new Zombie[numZombies];

	int maxX = arena.width - 20;
	int minX = arena.left + 20;
	int maxY = arena.height - 20;
	int minY = arena.top + 20;

	for (int i = 0; i < numZombies; i++) {
		srand((int)time(0) * i);
		int side = (rand() % 4);
		float x, y;

		switch (side) {
			case 0:
				x = minX;
				y = (rand() % maxY) + minY;
				break;
			case 1:
				x = maxX;
				y = (rand() % maxY) + minY;
				break;
			case 2:
				y = minY;
				x = (rand() % maxX) + minX;
				break;
			case 3:
				y = maxY;
				x = (rand() % maxX) + minX;
				break;
		}
		srand((int)time(0) * i * 2);
		int type = (rand() % 3);
		zombies[i].spawn(x, y, type, i);
	}
	return zombies;
}