package choucair.stepdefinitions;


import co.com.choucair.certification.practinasp.models.TestLoombok;
import co.com.choucair.certification.practinasp.questions.ValidateLogin;
import co.com.choucair.certification.practinasp.tasks.IngresaRegistro;
import co.com.choucair.certification.practinasp.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.certification.practinasp.userinterfaces.HomePage.TXT_USER;
import static co.com.choucair.certification.practinasp.utils.GlobalData.ACTOR;
import static co.com.choucair.certification.practinasp.utils.GlobalData.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class StoreStepDefinitions {

    @Given("el usuario ingresa a la pagina STORE")
    public void elUsuarioIngresaALaPaginaSTORE() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("el usuario ingresa a la opcion de registrarse")
    public void elUsuarioIngresaALaOpcionDeRegistrarse() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresaRegistro.clicLogin());
    }

    @When("ingresa el usuario usermotorola y la contrasena password")
    public void ingresaElUsuarioUsermotorolaYLaContrasenaPassword(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onSite(TestLoombok.setData(table).get(0))
        );
    }

    @Then("el usuario vera en la parte superior (.*)$")
    public void elUsuarioVeraEnLaParteSuperiorMotorolaxl(String userName) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateLogin.validate(TXT_USER), containsString(userName)));
    }

}
