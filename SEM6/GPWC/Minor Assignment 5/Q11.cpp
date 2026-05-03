// bool gameState = true;

// sf::Texture playerTex, bloaterTex;
// playerTex.loadFromFile("player.png");
// bloaterTex.loadFromFile("bloater.png");

// sf::Sprite sprite;

// sprite.setTexture(playerTex);

// while(window.isOpen())
// {
//     sf::Event event;

//     while(window.pollEvent(event))
//     {
//         if(event.type == sf::Event::KeyPressed &&
//            event.key.code == sf::Keyboard::Enter)
//         {
//             gameState = !gameState;
//         }
//     }

//     if(gameState)
//         sprite.setTexture(playerTex);
//     else
//         sprite.setTexture(bloaterTex);

//     window.clear(sf::Color::Red);
//     window.draw(sprite);
//     window.display();
// }