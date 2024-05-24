package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class LoggedInAreaView {

    public static final Target Logged = Target.the("Logged area")
            .located(By.xpath("//android.widget.TextView[contains(@text, 'You are logged in')]"));
}
