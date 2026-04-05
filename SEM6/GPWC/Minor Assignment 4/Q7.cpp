#include <SFML/Graphics.hpp>
using namespace sf;

class RectShape {
private:
    RectangleShape rect;

public:
    RectShape() {
        rect.setSize(Vector2f(10, 10));
        rect.setPosition(100, 100);
        rect.setFillColor(Color::White);
    }

    RectangleShape getShape() {
        return rect;
    }
};

int main() {
    RenderWindow window(VideoMode(1920,1080), "Rectangle");

    RectShape obj;

    while(window.isOpen()) {
        window.clear();
        window.draw(obj.getShape());
        window.display();
    }
}