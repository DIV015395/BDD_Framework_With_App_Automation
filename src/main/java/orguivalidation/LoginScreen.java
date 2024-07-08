package orguivalidation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

public class LoginScreen extends BaseDriver {
    @AndroidFindBy(id = "android.widget.ImageView")
    private AndroidElement loginscreenimageview;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement logintitletext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleProceed")
    private AndroidElement titleproceedtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_username")
    private AndroidElement loginusernametext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_password")
    private AndroidElement loginpasswordtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    private AndroidElement logingotext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_bottomMessage")
    private AndroidElement loginbottommessage;

//    MobileElement imageView = driver.findElement(By.className("android.widget.ImageView"));


    public LoginScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

}
