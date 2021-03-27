package co.com.choucair.demoautomatizacion.tasks;

import co.com.choucair.demoautomatizacion.userinterface.DemostracionAutomatizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirAplicativo implements Task {

    private DemostracionAutomatizacion demostracionAutomatizacion;

    public static AbrirAplicativo paginaRegistro(){
        return Tasks.instrumented(AbrirAplicativo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demostracionAutomatizacion));
    }
}
