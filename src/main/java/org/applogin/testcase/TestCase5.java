//login with correct credential and click on go button.
//it should be redirect to home dashboard Welcome page.

package org.applogin.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.applogin.AppLogin;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase5 extends AppLogin {
    private final ExtentTest test;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massagess;
    private String getmassage;

    public TestCase5(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void toastMassage() {
        getmassage = massagess.getText();
        test.log(Status.INFO, "Toast Message => " + getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Please wait, your contacts are being updated!");
        test.log(Status.PASS, "Toast Message is Validated");
    }
}
