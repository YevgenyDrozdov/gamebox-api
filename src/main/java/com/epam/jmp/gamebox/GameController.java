package com.epam.jmp.gamebox;

public interface GameController {

    void init(GameContext context);
    void processAction(Action action, GameModel model);
    View processRender(GameModel model);

}
