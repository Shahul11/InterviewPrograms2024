package org.amodquestions;

import java.util.Arrays;

public class ReverseCharsInWords {

    public static void main(String[] args) {
        String s1 = "Make Selenium easy";
        char[] s2 = s1.toCharArray();
        String[] s3= s1.split(" ");



        for (int i = s2.length-1; i >=0; i--) {
            System.out.print(s2[i]);
        }
        System.out.println();
        for (int i = s3.length-1; i >=0; i--) {
            System.out.print(s3[i] + " ");
        }
    }


}
