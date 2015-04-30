package com.epam.jmp.gamebox.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    String gameName() default "";
    String gameVersion() default "";
    String miniaturePath() default "";
}
