#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
    RenderWindow window(VideoMode(960, 540), "SFML Window");
    Texture texture;
    texture.loadFromFile("soa.jpeg");

    Sprite sprite;
    sprite.setTexture(texture);

    sprite.setScale(0.5f, 0.5f);
    sprite.setPosition(0, 270);

    while(window.isOpen())
    {
        sprite.move(0.2f, 0);

        window.clear();
        window.draw(sprite);
        window.display();
    }
    return 0;
}