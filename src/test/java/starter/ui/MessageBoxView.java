package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class MessageBoxView {

    public static final Target msjConfirm = Target.the("MsjConfirm")
            .located(By.xpath("//android.widget.TextView[@text=\"Here's what you said before:\"]"));
}
