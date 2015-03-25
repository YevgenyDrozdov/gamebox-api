package com.epam.jmp.gamebox;

import com.epam.jmp.gamebox.service.PersistenceService;

public interface GameContext {

    PersistenceService getPersistenceService();

}
