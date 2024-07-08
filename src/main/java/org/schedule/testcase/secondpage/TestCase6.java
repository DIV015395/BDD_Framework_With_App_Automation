package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase6 extends AppointmentPage {
    ExtentTest test;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;

    public TestCase6(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void toastMassageValidation() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(getmassage, "Please select a Doctor to book an appointment!");
    }

}
