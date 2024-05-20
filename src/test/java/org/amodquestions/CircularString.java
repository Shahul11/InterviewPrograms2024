package org.amodquestions;

import java.awt.*;
import java.util.Arrays;

public class CircularString {

    public static void main(String[] args) {
        String s1 = "Make Selenium easy";

        String[] s2 = s1.split(" ");
        int rotation = 1;

        for (int i = 0; i < rotation; i++) {
            String prev = s2[0];

            for (int j = s2.length-1; j >= 0; j--) {

                String temp = s2[j];
                s2[j] = prev;
                prev = temp;
            }

        }

        System.out.println(Arrays.toString(s2));

    }
}
