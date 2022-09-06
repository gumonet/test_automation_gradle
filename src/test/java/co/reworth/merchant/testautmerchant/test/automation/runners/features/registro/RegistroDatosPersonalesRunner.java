package co.reworth.merchant.testautmerchant.test.automation.runners.features.registro;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/co/reworth/merchant/testautmerchant/test/automation/features/registro/datos_personales.feature",
        glue = {"co.reworth.merchant.testautmerchant.test.automation.stepdefinitions","co.reworth.merchant.testautmerchant.test.automation.setups"},
        //tags = "@RegistroDatosPersonales"
        tags = "@Este"
)
public class RegistroDatosPersonalesRunner
{
    private RegistroDatosPersonalesRunner()
    {
        throw new UnsupportedOperationException();
    }
}
