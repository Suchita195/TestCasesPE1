package com.stackroute.junitdemo;

public class VerifyOriginal {

    public static String verifyOriginal(int n) {
        int original=60;

        if(n<original)
            return "Number guessed is less than original number";

        else if(n>original)
            return "Number guessed is more than original number";

        else
            return "Number guessed matches the original number";
    }
}
