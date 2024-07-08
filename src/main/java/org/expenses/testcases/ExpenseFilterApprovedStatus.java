package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpenseFilter;

public class ExpenseFilterApprovedStatus extends ExpenseFilter {
    ExtentTest test;

    public ExpenseFilterApprovedStatus(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
}
