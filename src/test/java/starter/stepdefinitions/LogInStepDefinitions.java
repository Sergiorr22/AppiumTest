package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.questions.LoggedInQuestions;
import starter.tasks.Login;
import starter.tasks.NavigateToLogin;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("Sergio ingresa al login")
    public void ingresarLogin() {
        theActorCalled("Sergio").attemptsTo(
                new NavigateToLogin());
    }

    @When("ingresa las credenciales")
    public void ingresarCredenciales(){
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("puede ver el mensaje de logueado")
    public void logeoExitoso(){
        String expectedLogged = "You are logged in as alice";

        theActorInTheSpotlight().should(
                seeThat("El mensaje de logueo", LoggedInQuestions.value(),
                        equalTo(expectedLogged))
        );
    }
}
