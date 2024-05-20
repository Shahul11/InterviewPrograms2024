package org.interview2024.javaprogrmas;

import java.util.HashSet;
// From Amex
public class AmexFetchOnlyUniqueWords {

    public static void main(String[] args) {
        String s1 = "Hello world java world";

        String s2[] = s1.split(" ");
        HashSet<String> hs = new HashSet<String>();
        for (String word : s2) {
            hs.add(word);

        }

        System.out.println(hs);


    }

}
