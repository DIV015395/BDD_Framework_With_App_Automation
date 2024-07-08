package org.logout;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MenuLogout extends BaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_chat")
    private AndroidElement homeChat;
    @AndroidFindBy(id = "com.clove.clover.uat:id/openDrawer")
    private AndroidElement menu;
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_logout")
    private AndroidElement menuLogout;
    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement yesButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement titleLogin;


    public MenuLogout(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void setHomeChat() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        homeChat.click();
    }

    public void setMenu() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        menu.click();
    }

    //    public void logoutButtonTextVerify()
//    {
//        String logoutText = menuLogout.getText();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        Assert.assertEquals(logoutText,"Yes");
//    }
    public void setLogoutFromMenu() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            menuLogout.click();
        } catch (Exception e) {

        }
    }

    public void clickOnYesButton() {
        try {
            yesButton.click();
        } catch (Exception e) {

        }
    }

    public void redirectLoginPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(titleLogin.getText(), "Login");

    }
}
