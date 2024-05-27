package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class HomeView {

    public static final Target loginLink = Target.the("getLoginLink").
            located(By.xpath("//android.widget.TextView[@text=\"Login Screen\"]"));

    public static final Target boxLink = Target.the("getboxLink")
            .located(By.xpath("//android.widget.TextView[@text=\"Echo Box\"]"));

    public static final Target listLink = Target.the("getListLink")
            .located(By.xpath("//android.widget.TextView[@text=\"List Demo\"]"));

}
