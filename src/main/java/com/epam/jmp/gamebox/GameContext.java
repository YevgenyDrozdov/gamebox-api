package com.epam.jmp.gamebox;

import com.epam.jmp.gamebox.services.PersistenceService;

public interface GameContext {

    PersistenceService getPersistenceService();

}
