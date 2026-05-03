#include <SFML/Graphics.hpp>
using namespace sf;

void displayBackground(VertexArray& rVA, IntRect arena)
{
    const int TILE_SIZE = 50;

    int width = arena.width / TILE_SIZE;
    int height = arena.height / TILE_SIZE;

    rVA.setPrimitiveType(Quads);
    rVA.resize(width * height * 4);

    int currentVertex = 0;

    for(int w = 0; w < width; w++)
    {
        for(int h = 0; h < height; h++)
        {
            Vertex* quad = &rVA[currentVertex];

            // Tile position
            quad[0].position = Vector2f(w*TILE_SIZE, h*TILE_SIZE);
            quad[1].position = Vector2f((w+1)*TILE_SIZE, h*TILE_SIZE);
            quad[2].position = Vector2f((w+1)*TILE_SIZE, (h+1)*TILE_SIZE);
            quad[3].position = Vector2f(w*TILE_SIZE, (h+1)*TILE_SIZE);

            // Border = wall
            if(w == 0 || h == 0 || w == width-1 || h == height-1)
            {
                quad[0].texCoords = Vector2f(0,150);
                quad[1].texCoords = Vector2f(50,150);
                quad[2].texCoords = Vector2f(50,200);
                quad[3].texCoords = Vector2f(0,200);
            }

            // Cross strip (middle row OR middle column)
            else if(w == width/2 || h == height/2)
            {
                quad[0].texCoords = Vector2f(0,50);
                quad[1].texCoords = Vector2f(50,50);
                quad[2].texCoords = Vector2f(50,100);
                quad[3].texCoords = Vector2f(0,100);
            }

            // Remaining inner area = mud-1
            else
            {
                quad[0].texCoords = Vector2f(0,0);
                quad[1].texCoords = Vector2f(50,0);
                quad[2].texCoords = Vector2f(50,50);
                quad[3].texCoords = Vector2f(0,50);
            }

            currentVertex += 4;
        }
    }
}