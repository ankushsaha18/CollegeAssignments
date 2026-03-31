// Algorithmic steps — player presses Right key when `activeInput == true`

// 1. Check if activeInput == true
// 2. Check if sf::Keyboard::isKeyPressed(sf::Keyboard::Right)
// 3. If both true:
//    a. Set player position to RIGHT side of tree
//    b. Set player's facing direction to LEFT (towards tree)
//    c. Set playerSide = right
//    d. Increment score by 1
//    e. Update score text display
//    f. Call updateBranches() to shift branches down and add a new random branch at top
//    g. Set logActive = true, set log direction to LEFT (flying away)
//    h. Set activeInput = false (wait for key release before next chop)
//    i. Play chop sound effect
//    j. Check if new branch at player's side → if yes, trigger squash/game over