package co.com.choucair.certification.choucairchallenge.tasks;

import co.com.choucair.certification.choucairchallenge.model.UtestRegisterData;
import co.com.choucair.certification.choucairchallenge.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InputPersonalData implements Task {

    private UtestRegisterData utestRegisterData;

    public InputPersonalData(UtestRegisterData utestRegisterData) {
        this.utestRegisterData = utestRegisterData;
    }

    public static InputPersonalData now(UtestRegisterData utestRegisterData) {
        return Tasks.instrumented(InputPersonalData.class, utestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestRegisterData.getName()).into(PersonalDataPage.FIRST_NAME),
                Enter.theValue(utestRegisterData.getLastName()).into(PersonalDataPage.LAST_NAME),
                Enter.theValue(utestRegisterData.getEmail()).into(PersonalDataPage.EMAIL),
                Click.on(PersonalDataPage.BIRTH_MONTH),
                Click.on(PersonalDataPage.BIRTH_MONTH_LIST),
                Click.on(PersonalDataPage.BIRTH_DAY),
                Click.on(PersonalDataPage.BIRTH_DAY_LIST),
                Click.on(PersonalDataPage.BIRTH_YEAR),
                Click.on(PersonalDataPage.BIRTH_YEAR_LIST),
                Click.on(PersonalDataPage.BUTTON_NEXT)
        );

    }
}
