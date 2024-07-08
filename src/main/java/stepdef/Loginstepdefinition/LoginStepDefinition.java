package stepdef.Loginstepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    public ExtentTest test;
    public AppiumDriver driver;
    public ExtentReports extent;
    AppLogin obj;

    @Given("Launch the driver")
    public void launch_the_driver() throws MalformedURLException {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case login", "Description of main login");
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj = new AppLogin((AndroidDriver) driver, test);

    }

    @When("user will enter the user id")
    public void user_will_enter_the_user_id() {
        // Write code here that turns the phrase above into concrete actions
        obj.userName();
    }

    @When("user will enter the password")
    public void user_will_enter_the_password() {
        // Write code here that turns the phrase above into concrete actions
        obj.userPassword();
    }

    @When("user will click on Go button")
    public void user_will_click_on_go_button() {
        // Write code here that turns the phrase above into concrete actions
        obj.goClickButton();
    }

    @When("user will click on notification allowed")
    public void user_will_click_on_notification_allowed() {
        // Write code here that turns the phrase above into concrete actions
        obj.permissonAllowed();
    }
    @Then("Toast message {string} will display")
    public void toast_message_will_display(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(obj.getToastMessage());
        Assert.assertEquals(obj.getToastMessage(), string);
    }
}
