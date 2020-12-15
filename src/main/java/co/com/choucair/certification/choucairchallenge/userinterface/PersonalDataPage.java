package co.com.choucair.certification.choucairchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage {
    public static final Target FIRST_NAME = Target.the("")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_MONTH_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthMonth\"]/option[2]");
    public static final Target BIRTH_DAY = Target.the("")
            .located(By.id("birthDay"));
    public static final Target BIRTH_DAY_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthDay\"]/option[13]");
    public static final Target BIRTH_YEAR = Target.the("")
            .located(By.id("birthYear"));
    public static final Target BIRTH_YEAR_LIST = Target.the("")
            .locatedBy("//*[@id=\"birthYear\"]/option[11]");
    public static final Target BUTTON_NEXT = Target.the("")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span");
}
