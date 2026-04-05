/*

    CircleShape circle(X);
    circle.setFillColor(Color::Green);

    // Top-left
    circle.setPosition(0, 0);
    window.draw(circle);

    // Top-right
    circle.setPosition(1920 - X*2, 0);
    window.draw(circle);

    // Bottom-left
    circle.setPosition(0, 1080 - X*2);
    window.draw(circle);

    // Bottom-right
    circle.setPosition(1920 - X*2, 1080 - X*2);
    window.draw(circle);


    // Center stretched red circle
    CircleShape centerCircle(X);
    centerCircle.setFillColor(Color::Red);

    centerCircle.setScale(2, 1);

    centerCircle.setOrigin(X, X);
    centerCircle.setPosition(960, 540);

    window.draw(centerCircle);

*/