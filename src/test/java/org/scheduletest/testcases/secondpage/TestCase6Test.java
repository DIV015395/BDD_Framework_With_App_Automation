package org.scheduletest.testcases.secondpage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.SchedulePageTemp;
import org.schedule.testcase.secondpage.TestCase6;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase6Test {

    private AppiumDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test case 6", "Schedule second page Test case 6");
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            logger.info("Wrong URL ");
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
    }

    @Test(priority = 2)
    public void schedulePage() {
        SchedulePageTemp obj = new SchedulePageTemp((AndroidDriver) driver, test);
        obj.homeSchedule();
        obj.selectClinicDropdownOne();
        obj.selectDoctorDropdownOne();
        obj.appointmentPlus();
    }

    @Test(priority = 3)
    public void appointmentTestCase() {
        TestCase6 obj = new TestCase6((AndroidDriver) driver, test);
        obj.mobileNumberPatient();
        obj.namePatient();
        obj.calenderOpen();
        obj.selectDate();
        obj.calenderOkButton();
        obj.slotSelection();
        obj.durationSelection();
        obj.scrolling();
        obj.painElements();
        obj.chiefNote();
        obj.submitButton();
        obj.toastMassageValidation();
        test.pass("Test case passed Successfully");
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }


}
