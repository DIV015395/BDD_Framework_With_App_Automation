

package org.schedule.testcase.secondpage;


import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.CurrentFormattedDate;
import org.openqa.selenium.WebElement;
import org.schedule.SchedulePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase9 extends SchedulePage {
    private final ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> tv_itemTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    private WebElement layout_doctorSelect;


    public TestCase9(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
//
//    public static String executionTime(String ss) {
//        String timming = ss;
//        return timming;
//    }


    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    public AndroidElement previousDate;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_scheduleListing_actionButtons")
    public AndroidElement actionButtons;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofAction;
    int l = CurrentFormattedDate.currentDate();
    int date = 10;


    @Override
    public void selectClinicDropdown() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Hinjewadi";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }
    @Override
    public void selectDoctorDropdown() {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Manjeet Sharma";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void dataBack() {
        while (date < l) {
            previousDate.click();
            l--;
        }
    }

    public void printAllAction() {
        actionButtons.click();
        for (WebElement element : listofAction) {
            System.out.println(element.getText());
        }
    }
}
