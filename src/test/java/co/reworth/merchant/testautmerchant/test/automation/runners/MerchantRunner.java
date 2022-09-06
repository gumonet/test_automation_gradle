package co.reworth.merchant.testautmerchant.test.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/co/reworth/merchant/testautmerchant/test/automation/features",
        glue = {"co.reworth.merchant.testautmerchant.test.automation.stepdefinitions","co.reworth.merchant.testautmerchant.test.automation.setups"},
        tags = "@Todos"



)
public class MerchantRunner {

    private MerchantRunner()
    {
        throw new UnsupportedOperationException();
    }
}
