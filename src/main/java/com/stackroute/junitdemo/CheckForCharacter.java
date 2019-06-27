package com.stackroute.junitdemo;

public class CheckForCharacter {

    public static String checkforCharacter(char ch) {

        if (ch >= 65 && ch <= 90)
            return "Character is a capital letter";
        else if (ch >= 97 && ch <= 122)
            return "Character is a small letter";
        else if (ch >= 48 && ch <= 57)
            return  "Character is a digit";
        else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127))
            return "Character is a special symbol";
        else {
            return "invalid";
        }
    }
}
