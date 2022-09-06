package co.reworth.merchant.test.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/reworth/merchant/test/automation/features/acceso.feature",
        glue = {"co.reworth.merchant.test.automation.stepdefinitions","co.reworth.merchant.test.automation.setups"}
)
public class accesoRunner {

}
