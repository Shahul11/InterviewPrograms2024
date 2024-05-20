package org.interview2024.javaprogrmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PublicisJavaStream {


    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        lst.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

    }
}
