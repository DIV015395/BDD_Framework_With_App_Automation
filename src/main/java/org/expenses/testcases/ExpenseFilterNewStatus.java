package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpenseFilter;

public class ExpenseFilterNewStatus extends ExpenseFilter {
    ExtentTest test;

    public ExpenseFilterNewStatus(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }


}
