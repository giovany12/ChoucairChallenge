package co.com.choucair.certification.choucairchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {
    public static final Target BRAND = Target.the("")
            .locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]");
    public static final Target BRAND_INPUT = Target.the("")
            .located(By.className("form-control ui-select-search ng-valid ng-dirty ng-touched ng-empty"));
    public static final Target MODEL = Target.the("")
            .locatedBy("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span");
    public static final Target OPERATING_SYSTEM = Target.the("")
            .locatedBy("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]");
    public static final Target NEXT_BUTTON = Target.the("")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span");

}
