package org.jaspeetprograms;

import java.io.BufferedReader;

public class RemoveVowelsString {

    public static void main(String[] args) {
        String s1 = "Hello World";


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != 'a' && s1.charAt(i) != 'e' && s1.charAt(i) != 'i' && s1.charAt(i) != 'o' && s1.charAt(i) != 'u') {
                sb.append(s1.charAt(i));
            }

        }

        System.out.println(sb);
    }
}
