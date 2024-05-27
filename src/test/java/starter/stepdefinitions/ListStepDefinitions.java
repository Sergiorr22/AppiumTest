package starter.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.tasks.NavigateToList;
import starter.tasks.SelectList;

public class ListStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Sergio ingresa a las listas")
    public void ingresarListas(){
        theActorCalled("Sergio").attemptsTo(
                new NavigateToList()
        );
    }

    @When("selecciona una lista y muestra mensaje")
    public void selectList(){
        theActorInTheSpotlight().attemptsTo(
                new SelectList()
        );
    }
}
