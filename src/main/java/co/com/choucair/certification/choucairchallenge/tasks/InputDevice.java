package co.com.choucair.certification.choucairchallenge.tasks;

import co.com.choucair.certification.choucairchallenge.model.UtestRegisterData;
import co.com.choucair.certification.choucairchallenge.userinterface.DevicePage;
import co.com.choucair.certification.choucairchallenge.userinterface.LocationPage;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class InputDevice implements Task {

    private UtestRegisterData utestRegisterData;

    public InputDevice(UtestRegisterData utestRegisterData) {
        this.utestRegisterData = utestRegisterData;
    }

    public static InputDevice now(UtestRegisterData utestRegisterData) {
        return Tasks.instrumented(InputDevice.class, utestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        new InternalSystemClock().pauseFor(30000);
        actor.attemptsTo(
//                Click.on(DevicePage.BRAND),
//                Enter.theValue(utestRegisterData.getMobileDevice()).into(DevicePage.BRAND_INPUT)
//                Click.on(DevicePage.BRAND_LIST)
//                Hit.the(Keys.TAB).into(DevicePage.BRAND)
//                Enter.theValue(utestRegisterData.getModel()).into(DevicePage.MODEL),
//                Hit.the(Keys.TAB).into(DevicePage.MODEL),
//                Enter.theValue(utestRegisterData.getOperatingSystem()).into(DevicePage.OPERATING_SYSTEM),
//                Click.on(DevicePage.NEXT_BUTTON)
        );

    }
}
