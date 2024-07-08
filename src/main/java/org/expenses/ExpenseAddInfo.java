package org.expenses;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class ExpenseAddInfo extends Expenses {
    ExtentTest test;

    public ExpenseAddInfo(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    public AndroidElement screenTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    public AndroidElement backArrow;
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_info")
    public AndroidElement addInfo;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_expenseLimit")
    public AndroidElement expenseLimit;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_expenseLimitValue")
    public AndroidElement expenseLimitAmount;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_mtdExpense")
    public AndroidElement mtdExpense;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_mtdExpenseValue")
    public AndroidElement mtdExpenseValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_amountAvailable")
    public AndroidElement amountAvailable;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_amountAvailableValue")
    public AndroidElement amountAvailableValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_rejectedBalance")
    public AndroidElement rejectBalance;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_rejectedBalanceValue")
    public AndroidElement rejectedBalanceValue;


    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_approvedBalance")
    public AndroidElement approveBalance;


    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_approvedBalanceValue")
    public AndroidElement approvedBalanceValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_pendingApproval")
    public AndroidElement pendingApproval;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_pendingApprovalValue")
    public AndroidElement pendingApprovalValue;


    public void setAddInfo() {
        addInfo.click();
    }

    public void setBackArrow() {
        backArrow.click();
    }

    public void setScreenTitle() {
        String title = screenTitle.getText();
        String actualTitle = "Expenses";
        Assert.assertEquals(title, actualTitle);
    }

    public void setScreenTitleInfo() {
        String title = screenTitle.getText();
        String actualTitle = "Info";
        Assert.assertEquals(title, actualTitle);
    }

    public void setExpenseLimitAndAmount() {
        Assert.assertEquals(expenseLimit.getText(), "Expense Limit");
        Assert.assertEquals(expenseLimitAmount.getText(), "₹15000");
    }

    public void setMtdExpenseAndValue() {
        Assert.assertEquals(mtdExpense.getText(), "MTD Expense");
        Assert.assertEquals(mtdExpenseValue.getText(), "₹10614");

    }


}
