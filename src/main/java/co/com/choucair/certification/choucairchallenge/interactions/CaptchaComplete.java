package co.com.choucair.certification.choucairchallenge.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class CaptchaComplete implements Interaction {

    public static CaptchaComplete now() {
        return Tasks.instrumented(CaptchaComplete.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(60000);
    }
}
