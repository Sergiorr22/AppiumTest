package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import io.appium.java_client.AppiumBy;

public class MessageListView {

    public static final Target btnOk = Target.the("Botón ok")
            .located(AppiumBy.id("android:id/button1"));
}
