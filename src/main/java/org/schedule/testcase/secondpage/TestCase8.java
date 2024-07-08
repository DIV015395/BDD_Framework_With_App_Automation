//Action button verification in Appointment Listing

package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;

public class TestCase8 extends BaseDriver {
    private final ExtentTest test;


    public TestCase8(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/value_appointment_notes_value")
    public AndroidElement notesvalue;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_close_dialog")
    public AndroidElement cancelnotes;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_scheduleListing_actionButtons")
    public AndroidElement actionButtons;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofAction;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("appointment");
    String NotesValue = resourceBundle.getString("Notes");

    public void validationNotesInListing() {
        actionButtons.click();
        String desiredslot = "Notes";
        for (WebElement option : listofAction) {
            if (option.getText().equals(desiredslot)) {
                option.click();
                break;
            }
        }
        Assert.assertEquals(notesvalue.getText(), NotesValue);
        cancelnotes.click();
    }


//      actionButtons.click();
//        for (WebElement element : listofAction) {
//        System.out.println(element.getText());
//    }
}
