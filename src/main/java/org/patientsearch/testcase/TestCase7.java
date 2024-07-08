//Checking Work Done  option in three dot button

package org.patientsearch.testcase;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase7 {
    //Print list of Three dot button option
//validate all option

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_patientRow_action")
    public WebElement Threedotbutton;
    //Add Files
    //Add Appointment
    //View Files
    //Work Done
    //Cancel
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofaction;


    //Print list of Three dot button option
//validate all option


    //validation of Three_Dot_Button working or not during Patient search;
}
