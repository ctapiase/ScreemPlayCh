package co.com.choucair.certification.practinasp.tasks;

import co.com.choucair.certification.practinasp.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.CLIC_LOGIN_BUTOON));
    }

    public static IngresaRegistro clicLogin(){
        return Tasks.instrumented(IngresaRegistro.class);
    }
}
