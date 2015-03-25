package com.epam.jmp.gamebox;

public interface Action {

    String getActionId();
    String[] getActionParameters();
    Session getSession();

}
