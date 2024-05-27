package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class ListView {

    public static final Target altocumulus = Target.the("Lista Altocumulus")
            .located(By.xpath("//android.widget.TextView[@text=\"Altocumulus\"]"));

    public static final Target cirrus = Target.the("Lista Cirrus")
            .located(By.xpath("//android.widget.TextView[@text=\"Cirrus\"]"));







}
