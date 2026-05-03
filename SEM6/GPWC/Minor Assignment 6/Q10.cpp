#include <SFML/Graphics.hpp>
# include "Q9.cpp"
using namespace sf;

int main() {
    RenderWindow window(VideoMode(800, 600), "Zombie Arena");
    Zombie zombies[3];

    zombies[0].spawn(400, 0, 0, 10);    // top wall (Bloater)
    zombies[1].spawn(0, 300, 1, 20);    // left wall (Chaser)
    zombies[2].spawn(800, 300, 2, 30);  // right wall (Crawler)

    window.draw(zombies[0].getSprite());
    window.draw(zombies[1].getSprite());
    window.draw(zombies[2].getSprite());

    return 0;
}