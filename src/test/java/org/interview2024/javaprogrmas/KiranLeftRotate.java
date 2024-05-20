package org.interview2024.javaprogrmas;



import java.util.Arrays;
import java.util.Scanner;

//Question by Kiran
public class KiranLeftRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array rotations");
        int r = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5};

        rotateArray(arr,r);
    }


    static void rotateArray(int[] ar, int rotation) {
        int temp, prev;
        for (int i = 0; i < rotation; i++) {
            prev = ar[0];
            for (int j = ar.length - 1; j >= 0; j--) {
                temp = ar[j];
                ar[j] = prev;
                prev = temp;

            }
        }
        System.out.println(Arrays.toString(ar));
    }

}
