# include <SFML/Graphics.hpp>
using namespace sf;

class Player{
    private:
        Texture m_Texture;
        Sprite m_Sprite;

        public:
        Player();
        };

        Player::Player(){

        m_Texture.loadFromFile("player.png");
        m_Sprite.setTexture(m_Texture);

        m_Sprite.setOrigin(25,25);

        m_Sprite.setPosition(120,234);
};