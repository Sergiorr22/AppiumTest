package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class LoginView {

    public static final Target username = Target.the("Username")
            .located(AppiumBy.accessibilityId("username"));

    public static final Target password = Target.the("Password")
            .located(AppiumBy.accessibilityId("password"));

    public static final Target login = Target.the("getBtnLogin")
            .located(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
}
