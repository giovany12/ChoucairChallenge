package co.com.choucair.certification.choucairchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UtestRegisterPage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to register")
            .locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");

}
