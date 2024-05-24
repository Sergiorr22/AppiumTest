package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class HomeView {

    public static final Target loginLink = Target.the("getLoginLink").
            located(By.xpath("//android.widget.TextView[@text=\"Login Screen\"]"));

}
