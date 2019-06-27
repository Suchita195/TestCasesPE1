package com.stackroute.junitdemo;

public class NumberSeries {

    public static String numberSeries(int num) {
        int i,j,k=0;
        String s="";
        if(num==0)
        {
            return "Invalid";
        }
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                k=i;
                s=s+k;
            }

        }
        return s;
    }
}
