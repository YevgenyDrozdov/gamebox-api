package com.epam.jmp.gamebox;

import java.util.Set;

public interface GameModel {

    void put(String key, Object value);
    Object get(String key);
    Set<String> getAllKeys();

}
