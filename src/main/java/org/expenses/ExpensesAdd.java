package org.expenses;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class ExpensesAdd extends Expenses {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_expense")
    private AndroidElement addexpense;

    public ExpensesAdd(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_calender")
    private AndroidElement calenderButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_cancel")
    private AndroidElement calenderCancel;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    private AndroidElement calenderOk;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_name")
    private AndroidElement name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_quantity")
    private AndroidElement quantity;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_amount")
    private AndroidElement amount;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_notesAddEdit")
    private AndroidElement remarksButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    private AndroidElement remarksTextSend;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDone")
    private AndroidElement remarkDone;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDelete")
    private AndroidElement remarksDelete;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    private AndroidElement remarksBackArrow;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_attachFiles")
    private AndroidElement attachFiles;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private AndroidElement permissionOne;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement allowFirstTime;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement allowSecondtime;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_camera")
    private AndroidElement Camera;

    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
    private AndroidElement shutterButton;

    @AndroidFindBy(id = "com.android.camera2:id/done_button")
    private AndroidElement doneCapture;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_actionSave")
    private AndroidElement actionSave;


    ResourceBundle resourceBundle = ResourceBundle.getBundle("addexpensedetails");
    private final String expenseAddName = resourceBundle.getString("name");
    private final String expenseAddAmount = resourceBundle.getString("Amount");
    private final String expenseAddQuantity = resourceBundle.getString("Quantity");
    private final String expenseEditAddName = resourceBundle.getString("editname");
    private final String expenseEditAddAmount = resourceBundle.getString("editAmount");
    private final String expenseEditAddQuantity = resourceBundle.getString("editQuantity");


    public void setAddexpense() {
        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            addexpense.click();
            test.log(Status.PASS, "Click on Expense button. Working");

        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Expense button. Not Working");
        }

    }

    public void setCalenderButton() {
        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            calenderButton.click();
            test.log(Status.PASS, "Click on Calender button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender button. Not Working");
        }

    }

    public void setCalenderOk() {
        try {

            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            calenderOk.click();
            test.log(Status.PASS, "Click on Calender ok button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender ok button. Not Working");
        }
    }

    public void setCalenderCancel() {
        try {

            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            calenderCancel.click();
            test.log(Status.PASS, "Click on Calender Cancel button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender Cancel button. Not Working");
        }
    }

    public void setName() {
        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            name.sendKeys(expenseAddName);
            test.log(Status.PASS, "Click on Name send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Name send in Text field. Not Working");
        }

    }

    public void setEditName() {
        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            name.sendKeys(expenseEditAddName);
            test.log(Status.PASS, "Click on Name send in Text field in Edit . Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Name send in Text field in Edit. Not Working");
        }

    }

    public void setQuantity() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            quantity.sendKeys(expenseAddQuantity);
            test.log(Status.PASS, "Click on Quantity send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Quantity send in Text field. Not Working");
        }

    }


    public void setEditQuantity() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            quantity.sendKeys(expenseEditAddQuantity);
            test.log(Status.PASS, "Click on Quantity send in Text field in Edit. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Quantity send in Text field in Edit. Not Working");
        }

    }

    public void setAmount() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            amount.sendKeys(expenseAddAmount);
            test.log(Status.PASS, "Click on Amount send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Amount send in Text field. Not Working");
        }
    }


    public void setEditAmount() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            amount.sendKeys(expenseEditAddAmount);
            test.log(Status.PASS, "Click on Amount send in Text field in Edit. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Amount send in Text field in Edit. Not Working");
        }
    }

    public void setRemarksButton() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            remarksButton.click();
            test.log(Status.PASS, "Click on Remarks button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks button. Not Working");
        }


    }

    public void setRemarksTextSend() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            remarksTextSend.sendKeys("Expense Added");
            test.log(Status.PASS, "Click on Remarks send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks send in Text field. Not Working");
        }
    }

    public void setRemarkDone() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            remarkDone.click();
            test.log(Status.PASS, "Click on Remarks done button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks done button.  Not Working");
        }
    }

    public void setRemarksDelete() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            remarksDelete.click();
            test.log(Status.PASS, "Click on Remarks Delete button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks Delete button.  Not Working");
        }
    }

    public void setRemarksBackArrow() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            remarksBackArrow.click();
            test.log(Status.PASS, "Click on Remarks Back Arrow button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks Back Arrow button.  Not Working");
        }
    }


    public void setPermissionOne() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            permissionOne.click();
            test.log(Status.PASS, "Click on Permission button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Permission button.  Not Working");
        }
    }

    public void setAllowFirstTime() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            allowFirstTime.click();
            test.log(Status.PASS, "Click on Allow button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Allow button.  Not Working");
        }
    }

    public void setAllowSecondtime() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            allowSecondtime.click();
            test.log(Status.PASS, "Click on Allow Second button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Allow Second button.  Not Working");
        }
    }

    public void setCamera() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            Camera.click();
            test.log(Status.PASS, "Click on Camera button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Camera button.  Not Working");
        }
    }

    public void setShutterButton() {


        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            shutterButton.click();
            test.log(Status.PASS, "Click on Camera Capture button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Camera Capture button.  Not Working");
        }
    }

    public void setAttachFiles() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            attachFiles.click();

            test.log(Status.PASS, "Click on Attach file button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Attach file button.  Not Working");
        }
    }

    public void setDoneCapture() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            doneCapture.click();

            test.log(Status.PASS, "Click on Capture Right button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Capture Right button.  Not Working");
        }
    }

    public void setActionSave() {

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            actionSave.click();
            test.log(Status.PASS, "Click on Action Save button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Action Save button.  Not Working");
        }
    }

}
