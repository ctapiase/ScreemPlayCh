package co.com.choucair.certification.practinasp.questions;


import co.com.choucair.certification.practinasp.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateLogin implements Question<String> {

    Target element;
    private String msgValidation;

    public ValidateLogin(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static ValidateLogin validate(Target element) {
        return Instrumented.instanceOf(ValidateLogin.class).withProperties(element);
    }

}
