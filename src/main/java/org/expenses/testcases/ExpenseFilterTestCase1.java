package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.expenses.ExpenseFilter;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ExpenseFilterTestCase1 extends ExpenseFilter {
    ExtentTest test;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;

    public ExpenseFilterTestCase1(AndroidDriver driver, ExtentTest test) {

        super(driver, test);
        this.test = test;
    }

    public void toastMessage() {
        try {
            getmassage = massages.getText();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            System.out.println(getmassage);
            test.log(Status.PASS, "Toast Message => " + getmassage);
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Display the Toast message in Report");
        }
    }

    public void toastMassageValidation() {


        try {
            Assert.assertEquals(getmassage, "Please select From and To Date!");
            test.log(Status.PASS, "Toast message is Validated");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed toast message Validation");
        }

    }
}
