package org.desiredcapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    public AndroidDriver<AndroidElement> driver;

    public BaseDriver(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void baseDriverWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

