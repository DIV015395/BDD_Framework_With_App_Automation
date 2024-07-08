package org.algorithm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentFormattedDate {
    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public static int currentDate() {
        LocalDate currentDate = LocalDate.now();
        String formattedDate = formatDate(currentDate);
        int k = ExtractDayFromStringDate.extractDayFromDate(formattedDate);
        return k;
    }

}
