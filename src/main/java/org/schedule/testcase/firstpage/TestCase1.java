//Do not select clinic
//Doctor will be default name
//click on appointmentPlus button
//it generate some massage for user.

package org.schedule.testcase.firstpage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.SchedulePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase1 extends SchedulePage {
    private final ExtentTest test;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massagess;
    private String getmassage;

    public TestCase1(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void toastMessage() {
        getmassage = massagess.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        test.log(Status.INFO, getmassage);
    }

    public void toastMassageValidation() {

        Assert.assertEquals(getmassage, "Please select a valid clinic!");
        test.log(Status.PASS, "Toast message is Validated");
    }
}
