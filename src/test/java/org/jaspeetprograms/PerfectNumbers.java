package org.jaspeetprograms;


import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1, sum = 0;

        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (n == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect Number");
        }
    }
}
