#include <SFML/Graphics.hpp>
using namespace sf;

class Player
{
private:
    Texture m_Texture;
    Sprite m_Sprite;
    Vector2f m_Position;

public:
    Player()
    {
        m_Texture.loadFromFile("player.png");
        m_Sprite.setTexture(m_Texture);

        m_Sprite.setOrigin(25, 25);
    }

    void spawn(float startX, float startY)
    {
        m_Position.x = startX;
        m_Position.y = startY;

        m_Sprite.setPosition(m_Position);
    }

    Sprite getSprite()
    {
        return m_Sprite;
    }
};

// Spawn 5 players at different locations
    
    // Player player[5];

    // player[0].spawn(50, 50);        // top-left
    // player[1].spawn(750, 50);       // top-right
    // player[2].spawn(50, 550);       // bottom-left
    // player[3].spawn(750, 550);      // bottom-right
    // player[4].spawn(400, 300);      // center

    // for(int i = 0; i < 5; i++) {
    //     window.draw(player[i].getSprite());
    // }