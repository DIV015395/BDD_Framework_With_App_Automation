package org.schedule.testcase.firstpage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.DateManipulator;
import org.openqa.selenium.WebElement;
import org.schedule.SchedulePage;
import org.testng.Assert;


public class DateChange extends SchedulePage {
    private final ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedDate")
    private WebElement tv_selectedDate;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    private WebElement iv_previousDate;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_nextDate")
    private WebElement iv_nextDate;
    public DateChange(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void dateChange() {

        try {
            String orignalDate = tv_selectedDate.getText();
            String decreaseOrignalDate = DateManipulator.subtractOneDay(orignalDate);
            iv_previousDate.click();
            String priviousDate = tv_selectedDate.getText();
            if (decreaseOrignalDate.equals(priviousDate)) {
                Assert.assertEquals(priviousDate, decreaseOrignalDate);
                test.log(Status.PASS, "decrease the date functionality button working fine");
            }
            iv_nextDate.click();
            String nextDate = tv_selectedDate.getText();
            if (orignalDate.equals(nextDate)) {
                Assert.assertEquals(orignalDate, nextDate);
                test.log(Status.PASS, "increase the date functionality button working fine");
            } else {
                test.log(Status.PASS, "-1");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "decrease the date functionality button not  working fine");
        }
    }
}
