package co.com.choucair.certification.choucairchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {
    public static final Target PASSWORD = Target.the("")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE = Target.the("")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTING = Target.the("")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("")
            .locatedBy("//*[@id=\"laddaBtn\"]/span");
}
