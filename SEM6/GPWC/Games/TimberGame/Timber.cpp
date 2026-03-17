#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
	VideoMode vm(1920, 1080);
	RenderWindow window(vm, "Timber!!");
	View view(FloatRect(0, 0, 1920, 1080));
	window.setView(view);

	// Background
	Texture textureBackground;
	textureBackground.loadFromFile("graphics/background.png");
	Sprite spriteBackground;
	spriteBackground.setTexture(textureBackground);
	spriteBackground.setPosition(0, 0);

	// Tree
	Texture textureTree;
	textureTree.loadFromFile("graphics/tree.png");
	Sprite spriteTree;
	spriteTree.setTexture(textureTree);
	spriteTree.setPosition(810, 0);

	// Clouds
	Texture textureCloud;
	textureCloud.loadFromFile("graphics/cloud.png");
	Sprite spriteCloud1;
	Sprite spriteCloud2;
	Sprite spriteCloud3;
	spriteCloud1.setTexture(textureCloud);
	spriteCloud2.setTexture(textureCloud);
	spriteCloud3.setTexture(textureCloud);
	spriteCloud1.setPosition(0, 0);
	spriteCloud2.setPosition(250, 0);
	spriteCloud3.setPosition(500, 0);
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
	spriteBee.setPosition(0, 800);
	bool beeActive = false;
	float beeSpeed = 0.0f;

	// Player
	Texture texturePlayer;
	texturePlayer.loadFromFile("graphics/player.png");
	Sprite spritePlayer;
	spritePlayer.setTexture(texturePlayer);
	spritePlayer.setPosition(580, 720);

	// Axe
	Texture textureAxe;
	textureAxe.loadFromFile("graphics/axe.png");
	Sprite spriteAxe;
	spriteAxe.setTexture(textureAxe);
	spriteAxe.setPosition(700, 830);

	// clock object
	Clock clock;

	while (window.isOpen()) {
		Event event;
		while (window.pollEvent(event)) {
			if (event.type == Event::Closed) {
				window.close();
			}
		}
		if (Keyboard::isKeyPressed(Keyboard::Escape)) {
			window.close();
		}

		// Measure time
		Time dt = clock.restart();

		// ===== BEE =====
		if (!beeActive) {
			srand((int)time(0));
			beeSpeed = (rand() % 200) + 200;

			srand((int)time(0) * 10);
			float height = (rand() % 500) + 500;

			spriteBee.setPosition(2000, height);
			beeActive = true;
		}
		else {
			spriteBee.setPosition(
				spriteBee.getPosition().x - (beeSpeed * dt.asSeconds()),
				spriteBee.getPosition().y);

			if (spriteBee.getPosition().x < -100) {
				beeActive = false;
			}
		}

		// ===== CLOUD 1 =====
		if (!cloud1Active) {
			srand((int)time(0) * 10);
			cloud1Speed = (rand() % 200);

			float height = (rand() % 150);
			spriteCloud1.setPosition(-200, height);

			cloud1Active = true;
		}
		else {
			spriteCloud1.setPosition(
				spriteCloud1.getPosition().x + (cloud1Speed * dt.asSeconds()),
				spriteCloud1.getPosition().y);

			if (spriteCloud1.getPosition().x > 1920)
			{
				cloud1Active = false;
			}
		}

		// ===== CLOUD 2 =====
		if (!cloud2Active) {
			srand((int)time(0) * 20);
			cloud2Speed = (rand() % 200);

			float height = (rand() % 300) - 150;
			spriteCloud2.setPosition(-200, height);

			cloud2Active = true;
		}
		else {
			spriteCloud2.setPosition(
				spriteCloud2.getPosition().x + (cloud2Speed * dt.asSeconds()),
				spriteCloud2.getPosition().y);

			if (spriteCloud2.getPosition().x > 1920) {
				cloud2Active = false;
			}
		}

		// ===== CLOUD 3 =====
		if (!cloud3Active) {
			srand((int)time(0) * 30);
			cloud3Speed = (rand() % 200);

			float height = (rand() % 450) - 150;
			spriteCloud3.setPosition(-200, height);

			cloud3Active = true;
		}
		else {
			spriteCloud3.setPosition(
				spriteCloud3.getPosition().x + (cloud3Speed * dt.asSeconds()),
				spriteCloud3.getPosition().y);

			if (spriteCloud3.getPosition().x > 1920)
			{
				cloud3Active = false;
			}
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