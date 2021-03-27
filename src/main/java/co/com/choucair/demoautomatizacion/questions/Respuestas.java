package co.com.choucair.demoautomatizacion.questions;

import co.com.choucair.demoautomatizacion.userinterface.DemostracionAutomatizacionRegistrarsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Respuestas implements Question<Boolean> {

    private String pregunta;

    public Respuestas(String pregunta){
        this.pregunta = pregunta;
    }
    public static Respuestas toThe(String pregunta){
        return new Respuestas(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String titulo = Text.of(DemostracionAutomatizacionRegistrarsePage.TITULO_PAGINA).viewedBy(actor).asString();
        if (pregunta.equals(titulo)){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }

}
