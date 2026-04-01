#include <SFML/Graphics.hpp>
#include <SFML/Audio.hpp>
#include "Bat.h"
#include "Ball.h"
#include <sstream>
using namespace sf;

int main(){
	VideoMode vm(1920,1080);
	RenderWindow window(vm,"Pong");
	View view(FloatRect(0, 0, 1920, 1080));
	window.setView(view);
	int score = 0;
	int life = 3;
	Bat bat(1920/2,1080-20);
	Ball ball(1920/2,0);
	bool collision = false;
	bool paused = true; // start paused
	bool ballLost = false;
	
	Text hud;
	Text messageText;
	
	// prepare sound
	SoundBuffer overBuffer;
	overBuffer.loadFromFile("faaa.mp3");
	Sound over;
	over.setBuffer(overBuffer);
	
	Font font;
	if (!font.loadFromFile("KOMIKAP_.ttf")) {
		return -1;
	}
	
	hud.setFont(font);
	hud.setCharacterSize(75);
	hud.setFillColor(Color::White);
	hud.setPosition(20,20);
	
	// setup message text
	messageText.setFont(font);
	messageText.setCharacterSize(75);
	messageText.setFillColor(Color::White);
	messageText.setString("Press Enter to Start");
	FloatRect textRect = messageText.getLocalBounds();
	messageText.setOrigin(textRect.left + textRect.width/2.0f,
						  textRect.top + textRect.height/2.0f);
	messageText.setPosition(1920/2.0f,1080/2.0f);
	
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
		
		// unpause / restart
		if (paused && Keyboard::isKeyPressed(Keyboard::Enter)) {
			paused = false;
			score = 0;
			life = 3;
			ball = Ball(1920/2,0);
		}
		
		if(!paused){
				// Handle Player Input
			if(Keyboard::isKeyPressed(Keyboard::Left)){
				bat.moveLeft();
			}else{
				bat.stopLeft();
			}
			
			if(Keyboard::isKeyPressed(Keyboard::Right)){
				bat.moveRight();
			}else{
				bat.stopRight();
			}
			
			
			// Update the bat, ball and HUD
			
			Time dt = clock.restart();
			bat.update(dt);
			ball.update(dt);
			std::stringstream ss;
			ss << "score:" << score << " Lives:" << life;
			hud.setString(ss.str());
			
			
			// Hit bottom
			if(ball.getPosition().top > 1080 && !ballLost){
				ballLost = true;
				ball.reboundBottom();
				life--;
				if(life < 1){
					score = 0;
					life = 3;
					paused = true;
					ballLost = false;
					messageText.setString("KHEL KHATAM BETA !!");
					FloatRect textRect = messageText.getLocalBounds();
					messageText.setOrigin(textRect.left + textRect.width/2.0f,
										textRect.top + textRect.height/2.0f);
					messageText.setPosition(1920/2.0f, 1080/2.0f);
					hud.setPosition(20,20);
					over.play();
				}
			}

			// Reset ballLost when ball is back in play (top of screen area)
			if(ball.getPosition().top < 1080){
				ballLost = false;
			}
			
			// Hit top
			if(ball.getPosition().top < 0){
				ball.reboundBatOrTop();
				collision = false;
			}
			
			// Hitting sides
			if(ball.getPosition().left < 0 || 
			   ball.getPosition().left + ball.getPosition().width > 1920){
				ball.reboundSides();
			}
			
			// reset collision when not touching bat
			if (!ball.getPosition().intersects(bat.getPosition())) {
				collision = false;
			}
			
			// Hitting bat
			if(ball.getPosition().intersects(bat.getPosition()) && collision == false){
				ball.reboundBatOrTop();
				score++;
				collision = true;
			}
		}
		
		// Draw all
		window.clear();
		if(paused){
			window.draw(messageText);
			window.draw(hud);
		}else{
			window.draw(hud);
			window.draw(bat.getShape());
			window.draw(ball.getShape());
		}
		window.display();
	}
	
	return 0;
}