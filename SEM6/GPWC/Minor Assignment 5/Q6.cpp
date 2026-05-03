# include <SFML/Graphics.hpp>
using namespace sf;

int main(){
    sf::VertexArray tiles(sf::Quads, 3 * 4);

    // Mud-1
    tiles[0].position = sf::Vector2f(0, 0);
    tiles[1].position = sf::Vector2f(50, 0);
    tiles[2].position = sf::Vector2f(50, 50);
    tiles[3].position = sf::Vector2f(0, 50);

    tiles[0].texCoords = sf::Vector2f(0, 0);
    tiles[1].texCoords = sf::Vector2f(50, 0);
    tiles[2].texCoords = sf::Vector2f(50, 50);
    tiles[3].texCoords = sf::Vector2f(0, 50);


    // Grass
    tiles[4].position = sf::Vector2f(50, 0);
    tiles[5].position = sf::Vector2f(100, 0);
    tiles[6].position = sf::Vector2f(100, 50);
    tiles[7].position = sf::Vector2f(50, 50);

    tiles[4].texCoords = sf::Vector2f(0, 50);
    tiles[5].texCoords = sf::Vector2f(50, 50);
    tiles[6].texCoords = sf::Vector2f(50, 100);
    tiles[7].texCoords = sf::Vector2f(0, 100);


    // Mud-2
    tiles[8].position = sf::Vector2f(100, 0);
    tiles[9].position = sf::Vector2f(150, 0);
    tiles[10].position = sf::Vector2f(150, 50);
    tiles[11].position = sf::Vector2f(100, 50);

    tiles[8].texCoords = sf::Vector2f(0, 100);
    tiles[9].texCoords = sf::Vector2f(50, 100);
    tiles[10].texCoords = sf::Vector2f(50, 150);
    tiles[11].texCoords = sf::Vector2f(0, 150);

}