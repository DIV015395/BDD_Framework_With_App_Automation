package org.schedule;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.CurrentTimeInIndia;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppointmentPage extends BaseDriver {
    ExtentTest test;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"04 August 2023\"]")
    public WebElement Date;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDateSelect")
    public WebElement Dates;
    //    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_next_month_arrow")
//    public WebElement Next_month;
    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    public WebElement Dateok;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_timeSlots")
    public WebElement rv_timeSlots;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlot")
    public List<WebElement> tv_timeSlot;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDuration")
    public WebElement tv_appointmentDuration;

    //Till  Date is okkk
    @AndroidFindBy(id = "com.clove.clover.uat:id/np_appointmentDuration")
    public List<WebElement> np_appointmentDuration;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlotPicker_actionButtonDone")
    public WebElement duration_Ok;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notesTitle")
    public WebElement tv_notesTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    public WebElement et_text;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDone")
    public WebElement iv_actionDone;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_save")
    public WebElement iv_save;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_chiefComplaintList")
    private WebElement painElement;

    public AppointmentPage(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }


    ResourceBundle resourceBundle = ResourceBundle.getBundle("appointment");
    String patientName = resourceBundle.getString("namePatient");
    String patientMobileNumber = resourceBundle.getString("mobileNumber");

    public void mobileNumberPatient() {
        try {
            et_contact.sendKeys(patientMobileNumber);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Patient mobile no filled");
        } catch (Exception e) {
            test.log(Status.FAIL, "Patient mobile no filled -> Not working");

        }

    }

    public void namePatient() {
        try {
            et_name.sendKeys(patientName);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Patient name filled at Appointment page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Patient name filled at Appointment page -> Not working");
        }

    }

    public void calenderOpen() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Dates.click();
            test.log(Status.PASS, "Calender Open Properly");
        } catch (Exception e) {
            test.log(Status.FAIL, "Calender Open -> Not working");
        }
    }

    public void selectDate() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Date.click();
            test.log(Status.PASS, "Date selected from calender");
        } catch (Exception e) {
            test.log(Status.FAIL, "Date selected from calender -> Not Working");
        }

    }

    public void calenderOkButton() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Dateok.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Clicked on ok Button at Calender page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Clicked on ok Button at Calender page -> Not Working");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_doctorName")
    public List<WebElement> doctorName;

    public void durationSelection() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_appointmentDuration.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        duration_Ok.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void slotSelection() {
//        rv_timeSlots.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredslot = CurrentTimeInIndia.getNearestHalfHourTime();
        for (WebElement option : tv_timeSlot) {
            if (option.getText().equals(desiredslot)) {
                option.click();
                break;
            }
        }
    }

    public void setDoctorName() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredname = "Aarti Panchal";
        for (WebElement option : doctorName) {
            if (option.getText().equals(desiredname)) {
                option.click();
                break;
            }
        }
    }

    //Scroll down perform karna hai is jagah par;
    public void scrolling() {
//        Dimension size = driver.manage().window().getSize();
//        int startX = size.width / 2;
//        int startY = (int) (size.height * 0.8);
//        int endY = (int) (size.height * 0.2);
//        new TouchAction(driver)
//                .press(PointOption.point(startX, startY))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//                .moveTo(PointOption.point(startX, endY))
//                .release()
//                .perform();
//        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))"
//                        + ".scrollIntoView(new UiSelector().text(\"SAVE\"))"));
//        element.click();


        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    public void painElements() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            painElement.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "All pain Selected");
        } catch (Exception e) {
            test.log(Status.FAIL, "All pain Selected - Not Working Fine");
        }

    }
    String notes = resourceBundle.getString("Notes");

    public void chiefNote() {
        tv_notesTitle.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_text.sendKeys(notes);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_actionDone.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void submitButton() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            iv_save.click();
            test.log(Status.PASS, "Click on Save button at Appointment Page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Save button at Appointment Page -> Not Working");
        }
    }
}
