package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class EnlacesUI {

    /**
     * <button href="/login"><div data-baseweb="typo-labelmedium" class="bf bg bh bm ew" style="color: rgb(46, 88, 255); font-weight: 400;">Inicia sesión</div></button>
     */
    public static final Target LNK_A_OTRO_PROCESO =
            Target.the("el enlace hacia otro proceso")
                    .locatedBy("//*[@href]//*[contains(text(),'{0}')]|//*[@href][contains(text(),'{0}')]");
}
