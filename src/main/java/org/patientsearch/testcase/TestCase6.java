//Checking view file option in three dot button

package org.patientsearch.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.patientsearch.PatientSearch;

import java.util.concurrent.TimeUnit;

public class TestCase6 extends PatientSearch {
    public TestCase6(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
    }

    public void patientSearchByValue() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchQuery.sendKeys("3285951034");
        test.log(Status.PASS, "Mobile number - Input Field fill successfully ");
    }

    @Override
    public void patientSearchByOption() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        patientSearchBy.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Mobile";

        for (WebElement option : listofpatientSearchBy) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        test.log(Status.PASS, "Dropdown  'List of Patient Search by' is Working Fine");
        test.log(Status.PASS, "Dropdown selected  = " + desiredOptionText);
    }

    public void workDoneVerify() {

    }
}
