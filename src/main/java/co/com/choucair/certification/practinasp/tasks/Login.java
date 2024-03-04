package co.com.choucair.certification.practinasp.tasks;

import co.com.choucair.certification.practinasp.models.TestLoombok;
import co.com.choucair.certification.practinasp.userinterfaces.LoginPopUp;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    TestLoombok testLoombok;

    public Login(TestLoombok testLoombok) {
        this.testLoombok = testLoombok;
    }

    public static Login onSite(TestLoombok testLoombok) {
        return Tasks.instrumented(Login.class, testLoombok);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testLoombok.getUser()).into(LoginPopUp.TXT_USER),
                Enter.theValue(testLoombok.getPass()).into(LoginPopUp.TXT_PASS),
                (Click.on(LoginPopUp.BTN_LOGIN))
        );
    }

}
