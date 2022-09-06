package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class VisorUI
{
    private VisorUI()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * <button aria-label="Show password text" title="Show password text" type="button" class="aq ca bw bx bu bv cb cc cd by bo"><svg data-baseweb="icon" title="Show password text" viewBox="0 0 20 20" class="ce cf cg ch ci"><title>Show password text</title><path d="M.2 10a11 11 0 0119.6 0A11 11 0 01.2 10zm9.8 4a4 4 0 100-8 4 4 0 000 8zm0-2a2 2 0 110-4 2 2 0 010 4z"></path></svg></button>
     */
    public static final Target CHK_VISOR=
            Target.the("Visor de contraseña")
                    .locatedBy("//button[contains(@aria-label,'password text')]");

    /**
     * <input aria-invalid="false" aria-required="false" autocomplete="new-password" inputmode="text" name="" placeholder="Contraseña" type="password" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_CLAVE_PROTEGIDA =
            Target.the("clave protegida")
                    .locatedBy("//input[contains(@placeholder,'Contrase')][@type='password']");

    /**
     * <input aria-invalid="false" aria-required="false" autocomplete="new-password" inputmode="text" name="" placeholder="Contraseña" type="text" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_CLAVE_DESPROTEGIDA =
            Target.the("clave legible")
                    .locatedBy("//input[contains(@placeholder,'Contrase')][@type='text']");

}
