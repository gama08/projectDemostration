package co.com.choucair.demoautomatizacion.userinterface;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemostracionAutomatizacionRegistrarsePage {

    public static final Target NOMBRE = Target.the("Campo para ingresar nombre").
            located(ByAngular.model("FirstName"));
    public static  final Target APELLIDO = Target.the("Campo para ingresar el apellido").
            located(ByAngular.model("LastName"));
    public static final Target DIRECCION = Target.the("Campo para ingresar la direccion").
            located(ByAngular.model("Adress"));
    public static final Target CORREO = Target.the("Campo para ingresar el correo electronico").
            located(ByAngular.model("EmailAdress"));
    public static  final Target TELEFONO = Target.the("Campo para ingresar el telefono").
            located(ByAngular.model("Phone"));
    public static final Target GENERO = Target.the("Seleccionar genero masculino").
            located(By.xpath(".//input[@value='Male']"));
    public static final Target PAIS = Target.the("Seleccionar pais").located(ByAngular.model("country"));
    public  static final Target FECHA_NACI_ANIO = Target.the("Seleccioanar año de nacimiento").
            located(By.id("yearbox"));
    public static final  Target FECHA_NACI_MES = Target.the("Seleccionar mes de nacimiento").
            located(ByAngular.model("monthbox"));
    public  static final  Target FECHA_NACI_DIA = Target.the("Seleccionar dia de nacimiento").
            located(By.id("daybox"));
    public static  final  Target CONTRASENIA = Target.the("Campo para ingresar contrasenia").
            located(ByAngular.model("Password"));
    public static final  Target CONFIRMAR_CONTRASENIA = Target.the("Campo para confirmar contrasenia").
            located(By.id("secondpassword"));
    public static  final  Target BOTON_ENVIAR = Target.the("Boton para registrarse").located(By.id("submitbtn"));

    public static  final Target TITULO_PAGINA = Target.the("Titulo de la pagina registrarse").
            located(By.xpath(".//h2[contains(text(),'Register')]"));

}
