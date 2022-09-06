package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.inicio;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PortalUI extends PageObject {

    /**
     * <button type="button" class="aq ca d2 co d3 bh cr cs ct cu cv aj cw cy cz d0 d1">Registrarse</button>
     */
    public static final Target BTN_REGISTRARSE =
            Target.the("Registrarse")
                    .locatedBy("//button[contains(text(),'Registrarse')]");



}
