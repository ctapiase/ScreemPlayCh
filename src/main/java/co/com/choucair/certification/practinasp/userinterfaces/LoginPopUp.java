package co.com.choucair.certification.practinasp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class LoginPopUp {
    public static final Target TXT_USER = Target.the("campo username").locatedBy("//input[@id='loginusername']");
    public static final Target TXT_USER3 = Target.the("campo username").locatedBy("//input[@id='loginus2ername']");
    public static final Target TXT_PASS = Target.the("campo password").locatedBy("//input[@id='loginpassword']");
    public static final Target BTN_LOGIN = Target.the("boton login").locatedBy("(//button[@class='btn btn-primary'])[3]");
}
