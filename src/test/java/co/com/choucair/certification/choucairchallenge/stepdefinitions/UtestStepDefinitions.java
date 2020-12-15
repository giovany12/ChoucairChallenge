package co.com.choucair.certification.choucairchallenge.stepdefinitions;

import co.com.choucair.certification.choucairchallenge.model.UtestRegisterData;
import co.com.choucair.certification.choucairchallenge.questions.Answer;
import co.com.choucair.certification.choucairchallenge.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Geovany wants to register on the utest website$")
    public void thatGeovanyWantsToRegisterOnTheUtestWebsite() {
        OnStage.theActorCalled("Geovany").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));

    }

    @When("^he complete the registration form$")
    public void heCompleteTheRegistrationForm(List<UtestRegisterData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InputPersonalData.now(data.get(0)),
                InputLocation.now(data.get(0)),
                InputDevice.now(data.get(0)),
                InputPassword.now(data.get(0))
        );

    }

    @Then("^he is registered on the utest platform$")
    public void heIsRegisteredOnTheUtestPlatform(List<UtestRegisterData> data) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Answer.toThe(data.get(0).getQuestion()))
        );

    }

}
