package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpensesAdd;

public class ExpenseAddCalender extends ExpensesAdd {

    ExtentTest test;

    public ExpenseAddCalender(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

}
