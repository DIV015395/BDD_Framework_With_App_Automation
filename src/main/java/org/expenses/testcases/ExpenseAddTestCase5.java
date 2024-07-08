package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpensesAdd;

public class ExpenseAddTestCase5 extends ExpensesAdd {
    ExtentTest test;
    public ExpenseAddTestCase5(AndroidDriver driver, ExtentTest test) {

        super(driver, test);
        this.test = test;
    }

}
