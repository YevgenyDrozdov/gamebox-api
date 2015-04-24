package com.epam.jmp.gamebox;

import java.util.Map;

public interface Action {

    String getActionId();
    Map<String, String> getActionParametersMap();
    String getActionParameter(String parameterName);
    Session getSession();

}
