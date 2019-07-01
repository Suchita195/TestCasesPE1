package com.stackroute.junitdemo;

public class NumberSeries {

    public static String numberSeries(int num) {
        int index1,index2,initial=0;
        String string="";
        if(num==0)
        {
            return "Invalid";
        }
        for (index1 = 1; index1 <= num; index1++) {//outer loop
            for (index2 = 1; index2 <= index1; index2++) {//inner loop
                initial=index1;
                string=string+initial;
            }

        }
        return string;
    }
}
