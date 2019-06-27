package com.stackroute.junitdemo;

public class TotalOfNumbers {
    public static String TotalOfNumbers(String[] num) {

        int total = 0;
        int i;
        try {

            for(i=0;i<num.length;i++) {
                if (Integer.parseInt(num[i]) == 0){
                    break;
            }
                total +=Integer.parseInt(num[i]);
            }

        }
    catch(Exception e)

    {
        return "error";
    }
    String str = Integer.toString(total);
            return str;

}
}
