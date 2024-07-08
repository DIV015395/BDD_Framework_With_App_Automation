package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.Expenses;

public class ExpenseTestCase1 extends Expenses {
    ExtentTest test;

    public ExpenseTestCase1(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
}
