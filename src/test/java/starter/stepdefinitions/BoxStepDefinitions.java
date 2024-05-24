package starter.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.equalTo;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.SendBoxQuestions;
import starter.tasks.NavigateToBox;
import starter.tasks.NavigateToLogin;
import starter.tasks.SendBox;

public class BoxStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Sergio ingresa al box")
    public void ingresarBox(){
        theActorCalled("Sergio").attemptsTo(
                new NavigateToBox()
        );
    }

    @When("envia el mensaje")
    public void sendMessage(){
        theActorInTheSpotlight().attemptsTo(
                new SendBox()
        );
    }

    @Then("muestra la confirmacion del mensaje")
    public void msjConfirm(){
        String msjConfirmBox = "Here's what you said before:";

        theActorInTheSpotlight().should(
                seeThat("El mensaje enviado", SendBoxQuestions.value(),
                        equalTo(msjConfirmBox))
        );
    }

}
