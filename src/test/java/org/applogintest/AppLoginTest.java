package org.applogintest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppLoginTest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @Test
    public void main() throws InterruptedException, MalformedURLException {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case login", "Description of main login");
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
    }
}