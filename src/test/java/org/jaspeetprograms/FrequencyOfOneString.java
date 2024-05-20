package org.jaspeetprograms;

public class FrequencyOfOneString {

    public static void main(String[] args) {
        String s1 = "Hello World Hello World Java Selenium World";

        String searchString = "World";

        String[] s2 = s1.split(" ");

        int counter = 0;
        String printWord = "";

        for (String word : s2) {
            if (word.equals(searchString)) {
                counter++;
                printWord = word;

            }
        }
        System.out.println("The word " + printWord + " is appearing " + counter + " times") ;

    }
}
