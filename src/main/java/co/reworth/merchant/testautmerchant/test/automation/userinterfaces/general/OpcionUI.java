package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class OpcionUI
{
    private OpcionUI()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * <HTML></>
     */
    public static final Target BTN_OPCION=
        Target.the("opcion")
            .locatedBy("//button[contains(text(),'{0}')]|//button//*[contains(text(),'{0}')]");

    /**
     * <HTML></>
     */
    public static final Target BTN_OPCION_SUBMIT=
        Target.the("opción para dar continuidad")
            .locatedBy("//button[@type='submit'][contains(text(),'{0}')]|//button[@type='submit']//*[contains(text(),'{0}')]");

}
