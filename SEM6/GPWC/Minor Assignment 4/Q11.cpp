// void Bat::moveLeft() {
//     movingLeft = true;
// }

// void Bat::moveRight() {
//     movingRight = true;
// }

// void Bat::stopLeft() {
//     movingLeft = false;
// }

// void Bat::stopRight() {
//     movingRight = false;
// }

// void Bat::update(Time dt) {

//     if(movingLeft && position.x > 0) {
//         position.x -= batSpeed * dt.asSeconds();
//     }

//     if(movingRight && position.x < 1920 - shape.getSize().x) {
//         position.x += batSpeed * dt.asSeconds();
//     }

//     shape.setPosition(position);
// }