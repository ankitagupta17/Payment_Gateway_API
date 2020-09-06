package com.demo.card;

import org.jetbrains.annotations.NotNull;

public class Validations {
    public static boolean isNumber(@NotNull String inputString){
        String regex = "\\d+";
        return inputString.matches(regex);
    }
}
