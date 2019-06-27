package com.stackroute.junitdemo;


public class VowelConsonant {


    public static String VowelChecker(String ch) {
        String result="";
        if (ch==null)
             return"null not allowed";
        int len = ch.length();
        for (int i = 0; i < len; i++) {
            if (ch.charAt(i) == 'a' || ch.charAt(i)== 'A' || ch.charAt(i)== 'e' || ch.charAt(i)== 'E' ||
                    ch.charAt(i) == 'i' || ch.charAt(i)== 'I' || ch.charAt(i)== 'o' || ch.charAt(i) == 'O' ||
                    ch.charAt(i) == 'u' || ch.charAt(i) == 'U')
                result= result+"vowel";
            else
                result= result+"consonant";
        }
                return result;


        }
    }
