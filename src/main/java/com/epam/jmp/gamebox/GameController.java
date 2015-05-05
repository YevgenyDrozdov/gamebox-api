package com.epam.jmp.gamebox;

import java.util.Map;

public interface GameController {

    void init(GameContext context);
    void processAction(Action action, GameModel model);
    View processRender(GameModel model);
    Map<String, Object> getClientModel(Session session, GameModel model);

}
