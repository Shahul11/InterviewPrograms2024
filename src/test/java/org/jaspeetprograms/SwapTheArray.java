package org.jaspeetprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapTheArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};

        System.out.println("Before Swapping");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
