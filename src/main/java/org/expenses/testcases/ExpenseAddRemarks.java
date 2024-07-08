package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.expenses.ExpensesAdd;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ExpenseAddRemarks extends ExpensesAdd {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notes")
    private WebElement notes;

    public ExpenseAddRemarks(AndroidDriver driver, ExtentTest test) {

        super(driver, test);
        this.test = test;
    }

    public void getNotes() {
        try {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            System.out.println(notes.getText());
            test.log(Status.PASS, "Access text from Notes on Screen");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Access text from Notes on Screen");
        }
    }
}
