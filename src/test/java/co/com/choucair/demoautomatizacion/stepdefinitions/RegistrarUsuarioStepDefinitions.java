package co.com.choucair.demoautomatizacion.stepdefinitions;

import co.com.choucair.demoautomatizacion.model.RegistrarseData;
import co.com.choucair.demoautomatizacion.questions.Respuestas;
import co.com.choucair.demoautomatizacion.tasks.AbrirAplicativo;
import co.com.choucair.demoautomatizacion.tasks.Registrarse;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistrarUsuarioStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Antonio desea registrarse en el aplicativo de sitio demostracion automatizacion$")
    public void queAntonioDeseaRegistrarseEnElAplicativoDeSitioDemostracionAutomatizacion() {
        OnStage.theActorCalled("Antonio").wasAbleTo(AbrirAplicativo.paginaRegistro());
    }

    @When("^diligencia la informacion solicitada despues valida la informacion$")
    public void diligenciaLaInformacionSolicitadaDespuesValidaLaInformacion(List<RegistrarseData> registrarseData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrarse.onThePage(registrarseData.get(0).getNombre(),
                registrarseData.get(0).getApellido(),registrarseData.get(0).getDireccion(),
                registrarseData.get(0).getCorreo(), registrarseData.get(0).getTelefono(),
                registrarseData.get(0).getGenero(),registrarseData.get(0).getPais(),
                registrarseData.get(0).getfNacimiento(),registrarseData.get(0).getContrasenia(),
                registrarseData.get(0).getConfirContrasenia()));
    }

    @Then("^sigue en la misma pantalla$")
    public void sigueEnLaMismaPantalla(List<RegistrarseData> registrarseData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuestas.toThe(registrarseData.get(0).getPantalla())));
    }





}
