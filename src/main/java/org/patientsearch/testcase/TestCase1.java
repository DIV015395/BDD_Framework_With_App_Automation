//Patient Details validation

package org.patientsearch.testcase;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.patientsearch.PatientSearch;
public class TestCase1 extends PatientSearch {
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientName")
    public WebElement patientName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_contactNo")
    public WebElement contactNo;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientId")
    public WebElement patientId;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_doctorName")
    public WebElement doctorName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_clinicName")
    public WebElement clinicName;
    public TestCase1(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
    }

    public void patientDetails() {
        System.out.println(patientName.getText());
        System.out.println(patientId.getText());
        System.out.println(contactNo.getText());
        System.out.println(doctorName.getText());
        System.out.println(clinicName.getText());
    }

}
