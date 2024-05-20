package org.jaspeetprograms;

import java.util.Scanner;

public class PerfectNumbers1000 {

    public static void main(String[] args) {

        for (int n = 1; n < 1000; n++) {

            int i = 1, sum = 0;

            while (i < n) {
                if (n % i == 0) {
                    sum = sum + i;
                }
                n++;
            }

            if (n == sum) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not a perfect Number");
            }

        }


    }
}
