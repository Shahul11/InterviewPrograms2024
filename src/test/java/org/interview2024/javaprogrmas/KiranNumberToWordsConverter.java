package org.interview2024.javaprogrmas;
// Intervieq questiosn given by Kiran kymar

public class KiranNumberToWordsConverter {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            return teens[number - 10];
        }

        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }

        return "";
    }

    public static void main(String[] args) {
        int number = 77;
        String words = convertToWords(number);
        System.out.println(number + " in words: " + words);
    }
}
