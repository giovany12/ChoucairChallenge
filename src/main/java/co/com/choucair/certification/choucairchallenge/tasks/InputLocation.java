package co.com.choucair.certification.choucairchallenge.tasks;

import co.com.choucair.certification.choucairchallenge.model.UtestRegisterData;
import co.com.choucair.certification.choucairchallenge.userinterface.LocationPage;
import kotlin.coroutines.experimental.ContinuationInterceptor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

public class InputLocation implements Task {

    private UtestRegisterData utestRegisterData;

    public InputLocation(UtestRegisterData utestRegisterData) {
        this.utestRegisterData = utestRegisterData;
    }

    public static InputLocation now(UtestRegisterData utestRegisterData) {
        return Tasks.instrumented(InputLocation.class, utestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestRegisterData.getCity()).into(LocationPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(LocationPage.CITY),
                Hit.the(Keys.TAB).into(LocationPage.CITY),
                Enter.theValue(utestRegisterData.getPostalCode()).into(LocationPage.POSTAL_CODE),
                Click.on(LocationPage.BUTTON_NEXT)
        );

    }
}
