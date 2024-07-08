package org.applogin;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppLogin extends BaseDriver
{
    private final ExtentTest test;
    public AppLogin(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastmessages;
    private String getmassage;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_username")
    private AndroidElement et_login_username;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_password")
    private AndroidElement et_login_password;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    private AndroidElement tv_login_go;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement permission_allow_button;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("login");
    private final String userid = resourceBundle.getString("id");
    private final String password = resourceBundle.getString("pass");

    public void userName() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_username.sendKeys(userid);
        test.log(Status.PASS, "Correct User Id Filled");
    }

    public void userPassword() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_password.sendKeys(password);
        test.log(Status.PASS, "Correct Password Filled");
    }

    public void goClickButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_login_go.click();
        test.log(Status.PASS, "Clicked on Go Button");
    }

    public void permissonAllowed() {
        permission_allow_button.click();
        test.log(Status.PASS, "Permisson Allowed");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public String getToastMessage() {
        getmassage = toastmessages.getText();
        return getmassage;
    }
}
