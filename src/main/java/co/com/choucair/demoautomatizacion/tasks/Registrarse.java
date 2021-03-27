package co.com.choucair.demoautomatizacion.tasks;

import co.com.choucair.demoautomatizacion.userinterface.DemostracionAutomatizacionRegistrarsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrarse implements Task {

    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String genero;
    private String pais;
    private String contrasenia;
    private String confContrasenia;
    private String [] dividirFechaNac;
    private String anio;
    private String mes;
    private String dia;

    public Registrarse(String nombre, String apellido,String direccion, String correo, String telefono, String genero, String pais,
                       String fNacimiento, String contrasenia, String confContrasenia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.pais = pais;
        this.contrasenia = contrasenia;
        this.confContrasenia = confContrasenia;
        this.dividirFechaNac = fNacimiento.split("-");
        this.anio = dividirFechaNac[0];
        this.mes = dividirFechaNac[1];
        this.dia = dividirFechaNac[2];
    }


    public static Registrarse onThePage(String nombre,String apellido,String direccion, String correo, String telefono,
                                        String genero, String pais, String fNacimiento, String contrasenia,
                                        String confContrasenia) {

        return Tasks.instrumented(Registrarse.class,nombre, apellido, direccion, correo, telefono, genero, pais,
                fNacimiento, contrasenia,confContrasenia );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(DemostracionAutomatizacionRegistrarsePage.NOMBRE),
                Enter.theValue(apellido).into(DemostracionAutomatizacionRegistrarsePage.APELLIDO),
                Enter.theValue(direccion).into(DemostracionAutomatizacionRegistrarsePage.DIRECCION),
                Enter.theValue(correo).into(DemostracionAutomatizacionRegistrarsePage.CORREO),
                Enter.theValue(telefono).into(DemostracionAutomatizacionRegistrarsePage.TELEFONO),
                Click.on(DemostracionAutomatizacionRegistrarsePage.GENERO),
                SelectFromOptions.byVisibleText(pais).from(DemostracionAutomatizacionRegistrarsePage.PAIS),
                SelectFromOptions.byVisibleText(anio).from(DemostracionAutomatizacionRegistrarsePage.FECHA_NACI_ANIO),
                SelectFromOptions.byVisibleText(mes).from(DemostracionAutomatizacionRegistrarsePage.FECHA_NACI_MES),
                SelectFromOptions.byVisibleText(dia).from(DemostracionAutomatizacionRegistrarsePage.FECHA_NACI_DIA),
                Enter.theValue(contrasenia).into(DemostracionAutomatizacionRegistrarsePage.CONTRASENIA),
                Enter.theValue(confContrasenia).into(DemostracionAutomatizacionRegistrarsePage.CONFIRMAR_CONTRASENIA),
                Click.on(DemostracionAutomatizacionRegistrarsePage.BOTON_ENVIAR));

    }

}
