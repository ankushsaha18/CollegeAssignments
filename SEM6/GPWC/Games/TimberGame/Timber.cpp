#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
	VideoMode vm(1920, 1080);
	RenderWindow window (vm, "Timber!!");
	View view(FloatRect(0,0,1920,1080));
	window.setView(view);
	
	
	// Background
	Texture textureBackground;
	textureBackground.loadFromFile("graphics/background.png");
	Sprite spriteBackground;
	spriteBackground.setTexture(textureBackground);
	spriteBackground.setPosition(0,0);
	
	
	// Tree
	Texture textureTree;
	textureTree.loadFromFile("graphics/tree.png");
	Sprite spriteTree;
	spriteTree.setTexture(textureTree);
	spriteTree.setPosition(810,0);
	
	
	// Clouds
	Texture textureCloud;
	textureCloud.loadFromFile("graphics/cloud.png");
	Sprite spriteCloud1;
	Sprite spriteCloud2;
	Sprite spriteCloud3;
	spriteCloud1.setTexture(textureCloud);
	spriteCloud2.setTexture(textureCloud);
	spriteCloud3.setTexture(textureCloud);
	spriteCloud1.setPosition(10,0);
	spriteCloud2.setPosition(400,0);
	spriteCloud3.setPosition(1700,0);
	bool cloud1Active = false;
	bool cloud2Active = false;
	bool cloud3Active = false;
	float cloud1Speed = 0.0f;
	float cloud2Speed = 0.0f;
	float cloud3Speed = 0.0f;
	
	
	// Bee
	Texture textureBee;
	textureBee.loadFromFile("graphics/bee.png");
	Sprite spriteBee;
	spriteBee.setTexture(textureBee);
	spriteBee.setPosition(0,800);
	bool beeActive = false;
	float beeSpeed = 0.0f;
	
	
	// Player
	Texture texturePlayer;
	texturePlayer.loadFromFile("graphics/player.png");
	Sprite spritePlayer;
	spritePlayer.setTexture(texturePlayer);
	spritePlayer.setPosition(580,720);
	
	
	// Axe
	Texture textureAxe;
	textureAxe.loadFromFile("graphics/axe.png");
	Sprite spriteAxe;
	spriteAxe.setTexture(textureAxe);
	spriteAxe.setPosition(700,830);
	
	
	while(window.isOpen()) {
		Event event;
		while(window.pollEvent(event)) {
			if(event.type == Event::Closed) {
				window.close();
			}
		}
		if(Keyboard::isKeyPressed(Keyboard::Escape)) {
			window.close();
		}
		
		window.clear();
		window.draw(spriteBackground);
		window.draw(spriteBee);
		window.draw(spriteTree);
		window.draw(spriteCloud1);
		window.draw(spriteCloud2);
		window.draw(spriteCloud3);
		window.draw(spritePlayer);
		window.draw(spriteAxe);
		window.display();
	}
	return 0;
}