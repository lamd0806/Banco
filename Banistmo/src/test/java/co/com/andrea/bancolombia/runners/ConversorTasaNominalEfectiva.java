package co.com.andrea.bancolombia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/conversor_tasa_nominal_efectiva.feature",
        glue = {"co.com.andrea.bancolombia.stepdefinitions", "co.com.andrea.bancolombia.utils"},
        snippets = SnippetType.CAMELCASE
)
public class ConversorTasaNominalEfectiva {
}
