package org.interview2024.javaprogrmas;


// Find the second max number from an array.Dont use sorting. We should not alter the array.
// Input: arr[] = {10,5,9,11,15,1} Output=11.

// Interviewer asked me to use only one loop

public class PublicisSecondMaxNumber {

    public static void main(String[] args) {
        int arr[] = {10, 5, 9, 11, 15, 1};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                }
            }
        }

        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (arr[i] < max)
                        // max=arr[i];
                        secondMax = arr[i];
                }
            }
        }

        System.out.println(secondMax);


        optimizedApproach();
    }

    // By open AI
    public static void optimizedApproach() {

        int arr[] = {10, 5, 9, 11, 15, 1};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);

    }


}





