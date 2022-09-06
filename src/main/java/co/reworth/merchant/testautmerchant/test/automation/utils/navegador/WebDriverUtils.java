package co.reworth.merchant.testautmerchant.test.automation.utils.navegador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils
{
    private WebDriverUtils(){
        throw new UnsupportedOperationException();
    }

    public static WebDriver getDriver(Actor actor)
    {
        return BrowseTheWeb.as(actor).getDriver();
    }

}
