package org.algorithm;

public class FirstNameExtractor {
    public static String extractFirstName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            return ""; // Return an empty string for null or empty input
        }

        String[] nameParts = fullName.trim().split("\\s+"); // Split by whitespace characters
        return nameParts[0];
    }
}
