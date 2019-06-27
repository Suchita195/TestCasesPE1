package com.stackroute.junitdemo;

import java.util.Arrays;

public class ArrangeNonAscending {
    public static String arrangeNonAscending(int num) {
        int n = 0, temp, res = 0, x, num_copy;
        String t="";
        num_copy = num;
        while (num > 0) {
            num = num / 10;
            n++;
        }
        int a[] = new int[n];
        int k = 0;
        num = num_copy;
        while (num > 0) {
            x = num % 10;
            num = num / 10;
            a[k] = x;
            k++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }


        for (int i = 0; i < n; i++) {

            t=t+Integer.toString(a[i]);

        }

        for(int i=0;i<n;i++)
            if (a[i] % 2 == 0) {
                res = res + a[i];

            }

        if (res > 15)

            return "Sorting elements in non-ascending order"+t+"Sum of even nos is " + res+"True";
        else
            return "Sorting elements in non-ascending order"+t+"Sum of even nos is " + res+"False";

    }
}
