package co.reworth.merchant.testautmerchant.test.automation.runners.features.registro;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/co/reworth/merchant/testautmerchant/test/automation/features/registro",
        glue = {"co.reworth.merchant.testautmerchant.test.automation.stepdefinitions","co.reworth.merchant.testautmerchant.test.automation.setups"},
        tags = "@Registro"


)
public class RegistroRunner
{
    private RegistroRunner()
    {
        throw new UnsupportedOperationException();
    }
}
