package org.interview2024.javaprogrmas;

import java.util.*;
// Merge two arrays and insert the unique values
//Amex  Internal Project Question

public class AmexMergeAndUniqueArra {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        List<Integer> list1 = new ArrayList<>();

        for (int num: arr1) {
            list1.add(num);
        }

        for (int num: arr2) {
            list1.add(num);
        }

        System.out.println(list1);

        Set<Integer> hset = new HashSet<Integer>(list1);

        System.out.println("Set values are " + hset);

    }


}
