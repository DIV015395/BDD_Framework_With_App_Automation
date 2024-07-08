//try to login with wrong credential in user id and password.
//click on go button
//it should be display toast massage "You are not authorised to access"


package org.applogin.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.applogin.AppLogin;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase4 extends AppLogin {
    private final ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_username")
    private AndroidElement et_login_username;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_password")
    private AndroidElement et_login_password;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;

    public TestCase4(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    @Override
    public void userName() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_username.sendKeys("manjeet");
        test.log(Status.PASS, "Entered Wrong user ID");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Override
    public void userPassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_password.sendKeys("qpalzm2223");
        test.log(Status.PASS, "Entered wrong password");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void toastMessage() {
        getmassage = massages.getText();
        test.log(Status.INFO, "Toast Message => " + getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
    }

    public void toastMassageValidation() {

        Assert.assertEquals(getmassage, "You are not authorised to access.");
        test.log(Status.PASS, "Toast message is Validated");
    }
}
