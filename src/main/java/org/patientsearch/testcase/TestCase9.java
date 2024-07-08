package org.patientsearch.testcase;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase9 {

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearchBy")
    public WebElement patientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofpatientSearchBy;
}
