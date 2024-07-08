package org.algorithm;

public class ExtractDayFromStringDate {
    public static void main(String[] args) {
        String dateString = "10/08/2023";
        int day = extractDayFromDate(dateString);
        System.out.println("Day: " + day);
    }
    public static int extractDayFromDate(String dateString) {
        // Split the date string using "/" as the delimiter
        String[] dateParts = dateString.split("/");
        // Extract the day part as an integer
        int day = Integer.parseInt(dateParts[0]);

        return day;
    }
}
