package co.com.choucair.certification.choucairchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY = Target.the("")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span");
}
