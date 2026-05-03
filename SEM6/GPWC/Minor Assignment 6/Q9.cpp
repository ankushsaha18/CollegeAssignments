#include <SFML/Graphics.hpp>
#include <cstdlib>
using namespace sf;

class Zombie {
private:
    Texture m_Texture;
    Sprite m_Sprite;
    Vector2f m_Position;

    float m_Speed;
    bool m_Alive;

public:
    Zombie() {
        m_Texture.loadFromFile("zombie.png");
        m_Sprite.setTexture(m_Texture);

        m_Sprite.setOrigin(25, 25);

        m_Alive = false;
        m_Speed = 0;
    }

    void spawn(float startX, float startY, int type, int seed) {
        m_Position.x = startX;
        m_Position.y = startY;

        switch(type) {
            case 0: 
                m_Speed = 40;
                m_Sprite.setScale(1.5f, 1.5f);
                break;

            case 1:
                m_Speed = 70;
                m_Sprite.setScale(1.0f, 1.0f);
                break;

            case 2: 
                m_Speed = 110;
                m_Sprite.setScale(0.7f, 0.7f);
                break;
        }

        srand(seed);
        float angle = rand() % 360;
        m_Sprite.setRotation(angle);

        m_Sprite.setPosition(m_Position);

        m_Alive = true;
    }

    Sprite getSprite() {
        return m_Sprite;
    }
};

// Function call

// Zombie z1, z2, z3;

// z1.spawn(400, 0, 0, 10);     // top wall (Bloater)
// z2.spawn(0, 300, 1, 20);     // left wall (Chaser)
// z3.spawn(800, 300, 2, 30);   // right wall (Crawler)

// window.draw(z1.getSprite());
// window.draw(z2.getSprite());
// window.draw(z3.getSprite());