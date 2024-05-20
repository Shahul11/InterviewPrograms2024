package org.softwaretestingo;

import java.util.Scanner;

//Java Program to Check Whether Character Sequence Is in Same Order Or Not
public class CheckCharSeq {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        System.out.println("Enter the desired Character Sequence to check");
        String s2 = sc.nextLine();
        boolean result = sequenceChecker(s1, s2);
        if (result) {
            System.out.println("The sequence is in the same order.");
        } else {
            System.out.println("The sequence is not in the same order.");
        }


    }


    public static boolean sequenceChecker(String s1, String c1) {

        int j = 0;
        for (int i = 0; i < c1.length(); i++) {
            //char c = c1.charAt(i);

            while (j < s1.length() && s1.charAt(j) != c1.charAt(i)) {
                j++;
            }
            if (j >= s1.length()) {
                return false; // character not found
            }
            j++;
        }
        return true; // all characters found in order
    }
}
