#include <SFML/Graphics.hpp>
using namespace sf;

int main() {
    RenderWindow window(VideoMode(960, 540), "Timber Game");
    while (window.isOpen())
{
    Event event;

    while (window.pollEvent(event))
    {
        if (event.type == Event::Closed)
            window.close();
    }

    if (Keyboard::isKeyPressed(Keyboard::Escape))
    {
        window.close();
    }

    window.clear();
    window.display();
}
    return 0;
}