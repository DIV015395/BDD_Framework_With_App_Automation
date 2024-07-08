package org.patientsearchtest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.patientsearch.PatientSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PatientSearchTest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            test = extent.createTest("Testcase 1", "description of schedule first page test case 1");
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Driver launch Successful");
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }

    }
    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        test.log(Status.PASS, "Login Successful");
    }

    @Test(priority = 2)
    public void patientSearch() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PatientSearch obj1 = new PatientSearch((AndroidDriver) driver, test);
        obj1.homePatientSearch();
        obj1.explore();
        obj1.patientSearchByValue();
        obj1.selectClinic();
        obj1.patientSearchByOption();
        obj1.searchButton();
        test.pass("Test is successful pass");
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }
}
