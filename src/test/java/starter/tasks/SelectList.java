package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import starter.ui.ListView;
import starter.ui.MessageListView;

public class SelectList implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ListView.altocumulus),
                Click.on(MessageListView.btnOk)
        );
    }
}
