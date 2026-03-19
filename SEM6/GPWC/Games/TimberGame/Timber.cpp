#include <SFML/Graphics.hpp>
#include <sstream>
using namespace sf;


void updateBranches(int seed);
const int NUM_BRANCHES = 6;
Sprite branches[NUM_BRANCHES];

enum class side {LEFT,RIGHT,NONE};

side branchPosition[NUM_BRANCHES];

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
	spriteCloud2.setPosition(0, 250);
	spriteCloud3.setPosition(0, 500);
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
	
	// Timbebar
	RectangleShape timeBar;
	float timeBarStartWidth = 400;
	float timeBarHeight = 80;
	timeBar.setSize(Vector2f(timeBarStartWidth,timeBarHeight));
	timeBar.setFillColor(Color::Red);
	timeBar.setPosition(1920/2.0f - timeBarStartWidth/2.0f,950);
	
	Time gameTimeTotal;
	float timeRemaining = 6.0f;
	float timeBarWidthPerSecond = timeBarStartWidth/timeRemaining;
	
	// prepare 6 branches
	Texture textureBranch;
	textureBranch.loadFromFile("graphics/branch.png");
	
	// pause variable
	bool paused = true;
	
	// score variable
	int score = 0;
	
	// Text objects
	Text messageText;
	Text scoreText;
	
	// Font object
	Font font;
	font.loadFromFile("font/KOMIKAP_.ttf");
	messageText.setFont(font);
	scoreText.setFont(font);
	messageText.setString("Press Enter to Start!");
	scoreText.setString("Score = 0");
	messageText.setCharacterSize(75);
	scoreText.setCharacterSize(100);
	messageText.setFillColor(Color::White);
	scoreText.setFillColor(Color::White);
	FloatRect textRect = messageText.getLocalBounds();
	messageText.setOrigin(textRect.left + textRect.width/2.0f,textRect.top + textRect.height/2.0f);
	messageText.setPosition(1920/2.0f,1080/2.0f);
	scoreText.setPosition(20,20);
	
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
		if (Keyboard::isKeyPressed(Keyboard::Return)){
			paused = false;
			
			// reset for new game
			score = 0;
			timeRemaining = 6;
		}
		if(!paused){
			// Measure time
			Time dt = clock.restart();
            timeRemaining -= dt.asSeconds();
            timeBar.setSize(Vector2f(timeBarWidthPerSecond*timeRemaining,timeBarHeight)); // set height and width of a rectangle
            if(timeRemaining  <= 0) {
            	paused = true;
            	messageText.setString("Out of time !!");
            	FloatRect textRect = messageText.getLocalBounds();
				messageText.setOrigin(textRect.left + textRect.width/2.0f,textRect.top + textRect.height/2.0f);
				messageText.setPosition(1920/2.0f,1080/2.0f);
				scoreText.setPosition(20,20);
            }
            
			// Bee Movement
			if(!beeActive){
				srand((int)time(0));//access the the current time
				beeSpeed=(rand()%200)+200;//0-399
				srand((int)time(0)*10);
				float height=(rand()%500)+500;//to set the height 0-999
				spriteBee.setPosition(2000,height); 
				beeActive=true;
			}else{
				//move bee
				spriteBee.setPosition(spriteBee.getPosition().x - (beeSpeed*dt.asSeconds()),spriteBee.getPosition().y);
			
				//to make bee to left again			
				if(spriteBee.getPosition().x<-100){
					beeActive=false;
				}
		
			}

			// Cloud1 Movement
			if (!cloud1Active) {
				srand((int)time(0) * 10);
				cloud1Speed = (rand() % 200)+100; // 100 to 299
				srand((int)time(0)*10);
				float height = (rand() % 150);
				spriteCloud1.setPosition(-300, height);

				cloud1Active = true;
			}
			else {
				spriteCloud1.setPosition(
					spriteCloud1.getPosition().x + (cloud1Speed * dt.asSeconds()),
					spriteCloud1.getPosition().y);

				if (spriteCloud1.getPosition().x > 1920) {
					cloud1Active = false;
					}
			}

			// Cloud2 Movement
			if (!cloud2Active) {
				srand((int)time(0) * 20);
				cloud2Speed = (rand() % 200)+200; // 200 to 399
				srand((int)time(0)*20);
				float height = (rand() % 300)-150;
				spriteCloud2.setPosition(-300, height);

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

			// Cloud3 Movement
			if (!cloud3Active) {
				srand((int)time(0) * 30);
				cloud3Speed = (rand() % 200)+100; // 200 to 399
				srand((int)time(0)*30);
				float height = (rand() % 450)-150;
				spriteCloud3.setPosition(-300, height);

				cloud3Active = true;
			}
			else {
				spriteCloud3.setPosition(
					spriteCloud3.getPosition().x + (cloud3Speed * dt.asSeconds()),
					spriteCloud3.getPosition().y);

				if (spriteCloud3.getPosition().x > 1920) {
					cloud3Active = false;
				}
			}
			
			// score update
			std::stringstream ss;
			ss << "Score = " << score;
			scoreText.setString(ss.str());
		}

		window.clear();
		window.draw(spriteBackground);
		window.draw(spriteCloud1);
		window.draw(spriteCloud2);
		window.draw(spriteCloud3);
		window.draw(spriteTree);
		window.draw(spriteBee);
		window.draw(spritePlayer);
		window.draw(spriteAxe);
		window.draw(scoreText);
		if(paused){
			window.draw(messageText);
		}
		window.draw(timeBar);
		window.display();
	}
	return 0;
}