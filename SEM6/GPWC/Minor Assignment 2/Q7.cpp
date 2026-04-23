#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
    RenderWindow window(VideoMode(960, 540), "SFML Window");
    Texture texture;
    texture.loadFromFile("soa.jpeg");

    Sprite sprite;
    sprite.setTexture(texture);

    sprite.setScale(0.5f, 0.5f);
    sprite.setPosition((960 - sprite.getGlobalBounds().width) / 2, 0);

    while(window.isOpen())
    {
        sprite.move(0, 0.2f);

        window.clear();
        window.draw(sprite);
        window.display();
    }
    return 0;
}

/*
    clang++ -std=c++17 main.cpp \
    -I/opt/homebrew/opt/sfml@2/include \
    -L/opt/homebrew/opt/sfml@2/lib \
    -lsfml-graphics -lsfml-window -lsfml-system -lsfml-audio \
    -o app

    ./app
*/