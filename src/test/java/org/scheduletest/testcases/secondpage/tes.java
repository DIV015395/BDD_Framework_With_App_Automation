package org.scheduletest.testcases.secondpage;

import org.algorithm.CurrentFormattedDate;
import org.algorithm.CurrentTimeInIndia;
import org.algorithm.FirstNameExtractor;
import org.testng.annotations.Test;

import java.util.ResourceBundle;


public class tes {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("schedule");
    String doctorName = resourceBundle.getString("doctorName");
    String clinicName = resourceBundle.getString("clinicName");

    @Test
    public void main() {
        String times = CurrentTimeInIndia.getNearestHalfHourTime();
        System.out.println(times);
        System.out.println(doctorName);
        System.out.println(clinicName);
        String names = FirstNameExtractor.extractFirstName("Manjeet");
        System.out.println(names);
        int l = CurrentFormattedDate.currentDate();
        System.out.println(l);

    }


}
