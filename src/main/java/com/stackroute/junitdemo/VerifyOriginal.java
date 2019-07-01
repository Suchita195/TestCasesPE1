package com.stackroute.junitdemo;

public class VerifyOriginal {

    public static String verifyOriginal(int number) {
        int original=60;

        if(number<original)
            return "Number guessed is less than original number";

        else if(number>original)
            return "Number guessed is more than original number";

        else
            return "Number guessed matches the original number";
    }
}
