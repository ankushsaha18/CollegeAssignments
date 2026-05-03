#include <SFML/Graphics.hpp>
#include <iostream>

using namespace sf;
using namespace std;
enum class GameState {
    GAME_OVER,
    LEVELING_UP,
    PLAYING,
    PAUSED
};

int main() {
    RenderWindow window(VideoMode(800, 600), "Zombie Arena");

    GameState state = GameState::GAME_OVER;

    while (window.isOpen()) {
        Event event;   
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed) {
                window.close();
            }

            if (event.type == Event::KeyPressed) {
                if (state == GameState::GAME_OVER && event.key.code == Keyboard::Return) {
                    state = GameState::LEVELING_UP;
                    cout << "LEVELING UP" << endl;
                }

                else if (state == GameState::LEVELING_UP && event.key.code == Keyboard::Num1) {
                    state = GameState::PLAYING;
                    cout << "PLAYING" << endl;
                }

                else if (state == GameState::PLAYING && event.key.code == Keyboard::Return) {
                    state = GameState::PAUSED;
                    cout << "PAUSED" << endl;
                }

                else if (state == GameState::PAUSED && event.key.code == Keyboard::Return) {
                    state = GameState::PLAYING;
                    cout << "PLAYING (RESUMED)" << endl;
                }
            }
        }
        window.clear();
        window.display();
    }

    return 0;
}