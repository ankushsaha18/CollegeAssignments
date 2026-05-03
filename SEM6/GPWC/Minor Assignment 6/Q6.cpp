# include <SFML/Graphics.hpp>
using namespace sf;

class Player{

    private:

        Texture m_Texture;
        Sprite m_Sprite;
        Vector2f m_Position;

    public:

        Player();
        void spawn(Vector2f resolution){
            m_Texture.loadFromFile("player.png");
            m_Sprite.setTexture(m_Texture);
            m_Position.x = resolution.x / 2;
            m_Position.y = resolution.y / 2;

            m_Sprite.setPosition(m_Position);
        }

        Sprite getSprite(){
            return m_Sprite;
        }

};