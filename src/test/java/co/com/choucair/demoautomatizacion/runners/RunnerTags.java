package co.com.choucair.demoautomatizacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automatizacion-demostracion.feature",
        tags = "@registrarse",
        glue = "co.com.choucair.demoautomatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
