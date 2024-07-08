package org.algorithm;


import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTimeInIndia {
    public static void main(String[] args) {
        String nearestHalfHourTime = getNearestHalfHourTime();
        System.out.println("Nearest half-hour time in India: " + nearestHalfHourTime);
    }

    public static String getNearestHalfHourTime() {
        // Set the time zone to India Standard Time (IST)
        TimeZone indiaTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        Calendar calendar = Calendar.getInstance(indiaTimeZone);

        // Get the current time in India
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Calculate the minutes to the nearest half-hour
        int minutesToNearestHalfHour = (30 - minute % 30) % 30;

        // Add the calculated minutes to the current time
        int totalMinutes = hour * 60 + minute + minutesToNearestHalfHour;
        int newHour = totalMinutes / 60;
        int newMinute = totalMinutes % 60;

        // Format the new time in India as a string
        String nearestHalfHourTime = String.format("%02d:%02d", newHour, newMinute);

        return nearestHalfHourTime;
    }
}
