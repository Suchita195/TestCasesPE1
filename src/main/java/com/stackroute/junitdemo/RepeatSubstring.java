package com.stackroute.junitdemo;

public class RepeatSubstring {
    public static String repeatSubstring(String original,int n)

    {

        String str;
        str=original;
        if(original==null)
            return "invalid";
        for(int i=0;i<n;i++)
        {
            str= str+original.substring(original.length()-n);
        }
       return str;
    }
}
