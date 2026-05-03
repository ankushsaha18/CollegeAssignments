# include <SFML/Graphics.hpp>
using namespace sf;

void displayBackground(sf::VertexArray& rVA, sf::IntRect arena)
{
    const int TILE_SIZE = 50;

    int width = arena.width / TILE_SIZE;
    int height = arena.height / TILE_SIZE;

    rVA.setPrimitiveType(sf::Quads);
    rVA.resize(width * height * 4);

    int currentVertex = 0;

    for(int w=0; w<width; w++)
    {
        for(int h=0; h<height; h++)
        {
            sf::Vertex* quad = &rVA[currentVertex];

            quad[0].position = sf::Vector2f(w*TILE_SIZE, h*TILE_SIZE);
            quad[1].position = sf::Vector2f((w+1)*TILE_SIZE, h*TILE_SIZE);
            quad[2].position = sf::Vector2f((w+1)*TILE_SIZE,(h+1)*TILE_SIZE);
            quad[3].position = sf::Vector2f(w*TILE_SIZE,(h+1)*TILE_SIZE);

            quad[0].texCoords = sf::Vector2f(0,50);
            quad[1].texCoords = sf::Vector2f(50,50);
            quad[2].texCoords = sf::Vector2f(50,100);
            quad[3].texCoords = sf::Vector2f(0,100);

            currentVertex += 4;
        }
    }
}