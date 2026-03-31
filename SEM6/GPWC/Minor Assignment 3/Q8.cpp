// Check collision between player and branch

// if (playerSprite.getGlobalBounds().intersects(branchSprite.getGlobalBounds())) {
//     paused = true;
//     gameOver = true;

//     // Set up the game over message
//     sf::Text messageText;
//     messageText.setFont(font);
//     messageText.setString("Player Expired-Game End");
//     messageText.setCharacterSize(75);
//     messageText.setFillColor(sf::Color::Red);

//     // Center on screen
//     sf::FloatRect textBounds = messageText.getLocalBounds();
//     messageText.setOrigin(textBounds.width / 2, textBounds.height / 2);
//     messageText.setPosition(1920 / 2, 1080 / 2);

//     window.draw(messageText);
//     window.display();
// }