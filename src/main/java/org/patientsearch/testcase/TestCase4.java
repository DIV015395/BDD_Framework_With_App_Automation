//Checking add appointment option in three dot button


package org.patientsearch.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.patientsearch.PatientSearch;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class TestCase4 extends PatientSearch {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("patientsearch");
    private final String patientName = resourceBundle.getString("patientName");
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearchBy")
    private WebElement patientSearchBy;

    public TestCase4(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
    }

    public void patientSearchByValue() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchQuery.sendKeys(patientName);
        test.log(Status.PASS, "Name of Patient - Input Field fill successfully ");
    }

    @Override
    public void patientSearchByOption() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        patientSearchBy.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Name";

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
