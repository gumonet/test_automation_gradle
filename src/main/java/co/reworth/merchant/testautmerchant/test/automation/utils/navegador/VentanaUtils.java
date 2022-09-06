package co.reworth.merchant.testautmerchant.test.automation.utils.navegador;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Set;

public class VentanaUtils
{
    private VentanaUtils(){
        throw new UnsupportedOperationException();
    }

    public static String getIdPestanyaActual(Actor actor)
    {
        return WebDriverUtils.getDriver(actor).getWindowHandle();
    }

    public static Set<String> getIdPestanyas(Actor actor)
    {
        return WebDriverUtils.getDriver(actor).getWindowHandles();
    }

    public static String getTituloPestanya(Actor actor)
    {
        return WebDriverUtils.getDriver(actor).getTitle();
    }

    public static String getURLPestanyaActual(Actor actor)
    {
        return WebDriverUtils.getDriver(actor).getCurrentUrl();
    }

}
