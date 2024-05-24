package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import starter.ui.BoxView;
import starter.ui.HomeView;

public class SendBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Texto de prueba").into(BoxView.msgInput),
                Click.on(BoxView.btnSave)
        );
    }
}
