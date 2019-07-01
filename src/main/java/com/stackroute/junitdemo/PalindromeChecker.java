package com.stackroute.junitdemo;

public class PalindromeChecker {


    public static String palindromeChecker(int num) {
        try {
            int original, mod, value = 0, res = 0;
            original = num;
            while (num > 0) {
                mod = num % 10;
                value = value * 10 + mod;
                num = num / 10;
            }

            if (value == original) {

                while (original > 0) {
                    mod = original % 10;
                    if (mod % 2 == 0) {
                        res = res + mod;
                    }
                    original = original / 10;
                }

                if (res > 25) {
                    return "It is a palindrome and sum of even nos is more than 25";
                } else {
                    return "It is a palindrome and sum of even nos is less than 25";
                }


            } else {

                return "It is not a palindrome";


            }
        } catch (Exception e) {
            return "Error";
        }
    }
}


