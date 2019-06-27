package com.stackroute.junitdemo;

public class PalindromeChecker {


    public static String palindromeChecker(int num) {
        try {
            int m, x, i = 0, res = 0;
            m = num;
            while (num > 0) {
                x = num % 10;
                i = i * 10 + x;
                num = num / 10;
            }

            if (i == m) {

                while (m > 0) {
                    x = m % 10;
                    if (x % 2 == 0) {
                        res = res + x;
                    }
                    m = m / 10;
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


