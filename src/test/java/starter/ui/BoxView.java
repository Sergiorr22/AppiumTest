package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class BoxView {

    public static final Target msgInput = Target.the("MsjInput")
            .located(AppiumBy.accessibilityId("messageInput"));

    public static final Target btnSave = Target.the("BtnSave")
            .located(By.xpath("//android.widget.TextView[@text=\"Save\"]"));
}
