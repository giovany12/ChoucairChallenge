package co.com.choucair.certification.choucairchallenge.tasks;

import co.com.choucair.certification.choucairchallenge.interactions.CaptchaComplete;
import co.com.choucair.certification.choucairchallenge.model.UtestRegisterData;
import co.com.choucair.certification.choucairchallenge.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InputPassword implements Task {

    private UtestRegisterData utestRegisterData;

    public InputPassword(UtestRegisterData utestRegisterData) {
        this.utestRegisterData = utestRegisterData;
    }

    public static InputPassword now(UtestRegisterData utestRegisterData) {
        return Tasks.instrumented(InputPassword.class, utestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestRegisterData.getPassword()).into(PasswordPage.PASSWORD),
                Enter.theValue(utestRegisterData.getConfirmPassword()).into(PasswordPage.CONFIRM_PASSWORD),
                Click.on(PasswordPage.TERMS_OF_USE),
                Click.on(PasswordPage.PRIVACY_SETTING),
                Click.on(PasswordPage.COMPLETE_SETUP),
                CaptchaComplete.now(),
                Click.on(PasswordPage.COMPLETE_SETUP)
        );
    }
}
