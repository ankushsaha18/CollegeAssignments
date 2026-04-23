#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
    RenderWindow window(VideoMode(960, 540), "SFML Window");
    Texture texture;
    texture.loadFromFile("soa.jpeg");

    Sprite sprite;
    sprite.setTexture(texture);

    sprite.setScale(0.5f, 0.5f);
    float y = (540 - sprite.getGlobalBounds().height) / 2;
    float x = 0;
    sprite.setPosition(x, y);
    Clock clock;

    while (window.isOpen())
    {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                window.close();
        }

        Time dt = clock.restart();
        x += 100 * dt.asSeconds();   
        sprite.setPosition(x, y);

        window.clear();
        window.draw(sprite);
        window.display();
    }
    return 0;
}