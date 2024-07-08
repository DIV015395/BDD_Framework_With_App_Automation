//fill contact no in appointment page then scroll down and click on save button
//it will generate toast massage like : Please enter patient name !

package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase2 extends AppointmentPage {
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    private final ExtentTest test;
    String getmassage;

    public TestCase2(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }


    public void scrolling() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    @Override
    public void submitButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
    }

    public void toastMassageValidation() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(getmassage, "Please enter patient name!");
    }
}
