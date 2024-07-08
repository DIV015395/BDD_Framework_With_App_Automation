package org.scheduletest;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.AppointmentPage;
import org.schedule.SchedulePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppointmentPageTest {
    private AppiumDriver driver;
    private ExtentTest test;

    @BeforeClass
    public void driverLaunch() throws MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void loginpage() {
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SchedulePage obj1 = new SchedulePage((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.homeSchedule();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.selectClinicDropdown();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.appointmentPlus();
    }

    @Test(priority = 3)
    public void main() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppointmentPage obj1 = new AppointmentPage((AndroidDriver) driver, test);
        obj1.mobileNumberPatient();
        obj1.namePatient();
        obj1.calenderOpen();
        obj1.selectDate();
        obj1.calenderOkButton();
        obj1.slotSelection();
        obj1.durationSelection();
        obj1.setDoctorName();
        obj1.scrolling();
        obj1.painElements();
        obj1.chiefNote();
        obj1.submitButton();
    }

    @AfterClass
    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
    }
}
