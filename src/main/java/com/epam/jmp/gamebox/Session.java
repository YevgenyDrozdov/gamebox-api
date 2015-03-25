package com.epam.jmp.gamebox;

public interface Session {

    void put(String key, Object value);
    Object get(String key);

}
