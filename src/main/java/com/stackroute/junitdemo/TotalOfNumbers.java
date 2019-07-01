package com.stackroute.junitdemo;

public class TotalOfNumbers {
    public static String TotalOfNumbers(String[] num) {

        int total = 0;
        int index;
        try {

            for(index=0;index<num.length;index++) {
                if (Integer.parseInt(num[index]) == 0)//enter the numbers till 0 is not entered{
                    break;
            }
                total +=Integer.parseInt(num[index]);//calculate the total
            }

    catch(Exception e)

    {
        return "error";
    }
    String str = Integer.toString(total);
            return str;

}
}
