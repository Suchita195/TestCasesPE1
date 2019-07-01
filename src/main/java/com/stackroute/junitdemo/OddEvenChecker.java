package com.stackroute.junitdemo;

public class OddEvenChecker {


    public static String OddEven(int num) {
        if (num % 2 == 1){//check for odd
            if (num > 20 && num < 30) {
                return "Tom";
            } else {
                return "Error";
            }
        }else {
            if (num > 20 && num < 30) {
                return "Jerry";
            } else {
                return "Error";
            }
        }
    }
}
