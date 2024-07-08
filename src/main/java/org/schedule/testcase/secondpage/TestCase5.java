//check mobile number field validation in Appointment page
//Enter more than 10 digit no.

package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase5 extends AppointmentPage {

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;
    private final ExtentTest test;
    String getmassage;

    public TestCase5(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void mobileNumberNineDigit() {
        et_contact.sendKeys("701113149");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void scrollingDown() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    @Override
    public void submitButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
    }

    public void patientName() {
        et_name.sendKeys("Manjeet Sharma");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void scrollingUp() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward();"));
    }

    public void toastMassageValidation() {
        getmassage = massages.getText();
        System.out.println(getmassage);
        Assert.assertEquals(getmassage, "Enter 10 digit mobile no!");
    }

}
