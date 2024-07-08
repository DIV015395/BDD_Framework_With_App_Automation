package org.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManipulator {
    public static String subtractOneDay(String originalDateStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date originalDate = dateFormat.parse(originalDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(originalDate);
            calendar.add(Calendar.DAY_OF_MONTH, -1);

            Date previousDate = calendar.getTime();
            return dateFormat.format(previousDate);
        } catch (ParseException e) {
            // Handle parsing errors, such as invalid date format
            return null;
        }
    }

    public static String addOneDay(String originalDateStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date originalDate = dateFormat.parse(originalDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(originalDate);
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            Date nextDate = calendar.getTime();
            return dateFormat.format(nextDate);
        } catch (ParseException e) {
            // Handle parsing errors, such as invalid date format
            return null;
        }
    }
}
