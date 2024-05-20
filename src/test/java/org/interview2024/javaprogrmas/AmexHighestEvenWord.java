package org.interview2024.javaprogrmas;

//Amex internal Project on May08-2024// arranged by seetharamju

//Fetch the highest number of even words

public class AmexHighestEvenWord {


    public static void main(String[] args) {
        String s1 = "Today is Wednesdays";

        String s2[] = s1.split(" ");
        String longWord = "";

        for (int i = 0; i < s2.length; i++) {

            if (s2[i].length() % 2 == 0) {
                if (s2[i].length() > longWord.length()) {
                    longWord = s2[i];
                }
            }
        }

        System.out.println(longWord);

    }
}
