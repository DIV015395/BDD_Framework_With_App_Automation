package org.expenses;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpenseFilter extends Expenses {
    ExtentTest test;
    String searchButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/search_expense")
    private AndroidElement searchExpenseButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    private AndroidElement ivSearchButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_filter_expense")
    private AndroidElement ivFilterExpense;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
    private AndroidElement fromDate;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView")
    private AndroidElement toDate;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement allStatus;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    private AndroidElement newStatus;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    private AndroidElement pendingStatus;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
    private AndroidElement approvedStatus;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")
    private AndroidElement rejectionStatus;
    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    private AndroidElement calenderOkButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_cancel")
    private AndroidElement calenderCancelButton;

    @AndroidFindBy(id = "//android.widget.ImageButton[@content-desc=\"Previous Month\"]")
    private AndroidElement calenderPreviousMonth;

    @AndroidFindBy(id = "//android.widget.ImageButton[@content-desc=\"Next Month\"]")
    private AndroidElement calenderNextButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_date_picker_year")
    private AndroidElement calenderDatePickerYearbutton;

    @AndroidFindBy(id = "//android.widget.TextView[@content-desc=\"2021\"]")
    private AndroidElement calenderYearset;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemdetail")
    private List<WebElement> itemDetail;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_action_dots")
    private List<AndroidElement> actionDots;


    public ExpenseFilter(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void setSearchExpenseButton() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            searchExpenseButton.click();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.PASS, "Click on search Expense button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on search Expense button. Not Working");
        }
    }

    public void setIvSearchButton() {
        try {
            ivSearchButton.click();
            test.log(Status.PASS, "Click on search Expense filter button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on search Expense filter button. Not Working");
        }
        searchButton = ivSearchButton.getText();
    }

    public void setIvFilterExpense() {
        try {
            ivFilterExpense.click();
            test.log(Status.PASS, "Click on Expense filter button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on Expense filter button. Not Working");
        }
    }

    public void setIvSearchButtonDisabled() {
        System.out.println(searchButton);
        JButton button = new JButton(searchButton);
        boolean isButtonEnabled = button.isEnabled();
        System.out.println(isButtonEnabled);
    }

    public void setIvSearchButtonDisabled1() {
        boolean isDisabled = !ivSearchButton.isEnabled();
        if (isDisabled) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public void setFromDate() {
        try {
            fromDate.click();
            test.log(Status.PASS, "Click on From Date in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on From Date in Expense Filter -  not working");
        }
    }

    public void setToDate() {
        try {
            toDate.click();
            test.log(Status.PASS, "Click on to Date in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on to Date in Expense Filter -  not working");
        }
    }

    public void setNewStatus() {
        try {
            newStatus.click();
            test.log(Status.PASS, "Click on new status in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on new status in Expense Filter -  not working");
        }
    }

    public void setCalenderOkButton() {
        try {
            calenderOkButton.click();
            test.log(Status.PASS, "Click on Calender ok button in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender ok button in Expense Filter-  not working");
        }
    }

    public void setAllStatus() {
        try {
            allStatus.click();
            test.log(Status.PASS, "Click on All status in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on All status in Expense Filter -  not working");
        }

    }

    public void setPendingStatus() {
        try {
            pendingStatus.click();
            test.log(Status.PASS, "Click on Pending status in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Pending status in Expense Filter -  not working");
        }
    }

    public void setApprovedStatus() {
        try {
            approvedStatus.click();
            test.log(Status.PASS, "Click on Approved status in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Approved status in Expense Filter -  not working");
        }

    }

    public void setRejectionStatus() {
        try {
            rejectionStatus.click();
            test.log(Status.PASS, "Click on Reject status in Expense Filter -  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Reject status in Expense Filter -  not working");
        }
    }

}
