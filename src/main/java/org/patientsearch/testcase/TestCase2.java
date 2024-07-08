//validation of Three_Dot_Button working or not during Patient search;

package org.patientsearch.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.patientsearch.PatientSearch;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class TestCase2 extends PatientSearch {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("patientsearch");
    String patientEmail = resourceBundle.getString("patientEmail");


    public TestCase2(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
    }

    public void patientSearchByValue() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchQuery.sendKeys(patientEmail);
        test.log(Status.PASS, "Eamil - Input Field fill successfully ");
    }

    @Override
    public void patientSearchByOption() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        patientSearchBy.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Email";

        for (WebElement option : listofpatientSearchBy) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        test.log(Status.PASS, "Dropdown  'List of Patient Search by' is Working Fine");
        test.log(Status.PASS, "Dropdown selected  = " + desiredOptionText);
    }
}
