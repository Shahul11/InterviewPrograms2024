package org.interview2024.javaprogrmas;

import java.util.*;


public class OpenShiftMaxofNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the size of the numbers");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter" + size + " numbers");
        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
            max=numbers[i];
            }
        }


        System.out.println(max);


/*
    int max=-1;
        int val=0;

        for(int i=0; i<size; i++){
            System.out.println("Entering the loop");
            for (int j=i+1; j<size; j++){

                if(numbers[i]>numbers[j]){
                    max=numbers[i];
                    System.out.println(max);
                }

                if(max>val){
                    max=val;
                }
            }
        }

        System.out.println(max);
        System.out.println(val);
*/

    }
}


