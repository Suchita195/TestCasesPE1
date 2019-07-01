package com.stackroute.junitdemo;

import java.util.Arrays;

public class ArrangeNonAscending {
    public static String arrangeNonAscending(int num) {
        int count = 0, temporary, res = 0, mod, num_copy;
        String t="";
        num_copy = num;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        int array[] = new int[count];
        int counter = 0;
        num = num_copy;
        while (num > 0) {
            mod = num % 10;
            num = num / 10;
            array[counter] = mod;
            counter++;
        }

        for (int index1 = 0; index1 < count; index1++) {
            for (int index2 = index1 + 1; index2 < count; index2++) {
                if (array[index1] < array[index2]) {
                    temporary = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temporary;
                }
            }
        }


        for (int i = 0; i < count; i++) {

            t=t+Integer.toString(array[i]);

        }

        for(int i=0;i<count;i++)
            if (array[i] % 2 == 0) {
                res = res + array[i];

            }

        if (res > 15)

            return "Sorting elements in non-ascending order"+t+"Sum of even nos is " + res+"True";
        else
            return "Sorting elements in non-ascending order"+t+"Sum of even nos is " + res+"False";

    }
}
