package org.interview2024.javaprogrmas;

// Encora Interview Questions

public class EncoraFetchDayFromWeekDay {
    // to remove  Day from follwing string
    public static void main(String[] args) {
        String weekdays = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";

        // Define the substring to search for
        String target = "DAY";

        // Initialize the starting index for searching the substring
        int startIndex = 0;

        // Repeat until no more occurrences of the substring are found
        while (true) {
            // Search for the substring starting from the current startIndex
            int index = weekdays.indexOf(target, startIndex);

            // If no more occurrences are found, break out of the loop
            if (index == -1) {
                break;
            }

            // Print the found substring "DAY"
            System.out.println("DAY");

            // Move the startIndex to the next position after the found substring
            startIndex = index + target.length();
        }
    }
    }

