package com.stackroute.junitdemo;


public class VowelConsonant {


    public static String VowelChecker(String ch) {
        String result="";
        if (ch==null)
             return"null not allowed";
        int len = ch.length();
        for (int index = 0; index < len; index++) {
            if (ch.charAt(index) == 'a' || ch.charAt(index)== 'A' || ch.charAt(index)== 'e' || ch.charAt(index)== 'E' ||
                    ch.charAt(index) == 'i' || ch.charAt(index)== 'I' || ch.charAt(index)== 'o' || ch.charAt(index) == 'O' ||
                    ch.charAt(index) == 'u' || ch.charAt(index) == 'U')
                result= result+"vowel";//if the index value is vowel
            else
                result= result+"consonant";//if the index value is consonant
        }
                return result;//return result



        }
    }
