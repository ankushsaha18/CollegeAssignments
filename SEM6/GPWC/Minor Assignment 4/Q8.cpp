#include <SFML/Graphics.hpp>

class SelfBat {
private:
    sf::RectangleShape bat;

public:
    SelfBat(float x, float y) {
        bat.setSize(sf::Vector2f(100,5));
        bat.setPosition(x,y);
    }
};