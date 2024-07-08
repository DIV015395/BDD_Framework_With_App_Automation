//select valid clinic name in schedule page.
//Doctor name will be default in the dropdown
//click on Appointmentplus button
//Redirect to Appointment booking page

package org.schedule.testcase.firstpage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.schedule.SchedulePage;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase2 extends SchedulePage {

    String redirectScreenTitleName = "Add Appointment";
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> tv_itemTitle;
    private AndroidDriver<AndroidElement> driver;

    public TestCase2(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement screenTitle;

    @Override
    public void selectClinicDropdown() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            layout_clinicSelect.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Assuming you want to select the option with text "Bodakdev"
            String desiredOptionText = "Developer West";

            for (WebElement option : tv_itemTitle) {
                if (option.getText().equals(desiredOptionText)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Selected clinic from dropdown");
        } catch (Exception e) {
            test.log(Status.FAIL, "Selected clinic from dropdown -> Not Working");

        }
    }

    public void screenTitleValidation() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Assert.assertEquals(screenTitle.getText(), redirectScreenTitleName);
            test.log(Status.PASS, "Redirect to Appointment Add Screen Verified - Working Fine");
        } catch (Exception e) {
            test.log(Status.FAIL, "Redirect to Appointment Add Screen Verified - Not Working");
        }
    }
}
