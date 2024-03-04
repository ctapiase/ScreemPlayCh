package co.com.choucair.certification.practinasp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target CLIC_LOGIN_BUTOON = Target.the("clic button login").located(By.id("login2"));
    public static final Target TXT_USER = Target.the("clic button login").locatedBy("//*[@id='nameofuser']");

}
