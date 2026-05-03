# include <SFML/Graphics.hpp>
using namespace sf;

// View from rectangle
sf::View view1(sf::FloatRect(0, 0, 500, 400));

// View from center and size
sf::View view2(sf::Vector2f(250, 200), sf::Vector2f(500, 400));