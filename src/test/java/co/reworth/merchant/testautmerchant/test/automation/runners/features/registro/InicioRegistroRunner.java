package co.reworth.merchant.testautmerchant.test.automation.runners.features.registro;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/co/reworth/merchant/testautmerchant/test/automation/features/registro/inicio_registro.feature",
        glue = {"co.reworth.merchant.testautmerchant.test.automation.stepdefinitions","co.reworth.merchant.testautmerchant.test.automation.setups"},
        tags = "@InicioRegistro"
        //tags = "@TC-MER-2"
)
public class InicioRegistroRunner
{
    private InicioRegistroRunner()
    {
        throw new UnsupportedOperationException();
    }
}
