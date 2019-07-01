package com.stackroute.junitdemo;

public class ReverseString {
    public static String reverseString(String original)
    {   String str;
        str=original;
        String reverse = " ";
        if(str==null)
        return null;

        int length = original.length();//length of the string

        for (int i = length - 1 ; i >= 0 ; i--)//reverse loop
            reverse = reverse + original.charAt(i);

        return "Reverse of the string: " + reverse;
    }
}
