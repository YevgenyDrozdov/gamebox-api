package com.epam.jmp.gamebox;

public interface Game {

    void init(GameboxContext context);
    void start();
    void pause();
    void stop();
    String getName();

}
