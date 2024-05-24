package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.ui.MessageBoxView;

public class SendBoxQuestions implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MessageBoxView.msjConfirm.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new SendBoxQuestions();
    }
}
