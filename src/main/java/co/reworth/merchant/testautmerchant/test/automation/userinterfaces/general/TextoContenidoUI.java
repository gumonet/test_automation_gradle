package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class TextoContenidoUI
{
    private TextoContenidoUI()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * <HTML></>
     */
    public static final Target LBL_TEXTO=
        Target.the("texto")
            .locatedBy("//*[contains(text(),'{0}')]");


}
