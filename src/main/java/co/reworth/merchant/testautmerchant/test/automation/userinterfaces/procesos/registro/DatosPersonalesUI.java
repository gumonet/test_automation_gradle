package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro;

import net.serenitybdd.screenplay.targets.Target;

public class DatosPersonalesUI {


    /**
     * <input aria-required="true" autocomplete="on" inputmode="text" name="" placeholder="Nombres y apellidos" type="text" required="" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_NOMBRE_COMPLETO =
            Target.the("nombre y apellido")
                    .locatedBy("//input[contains(@placeholder,'Nombres y apellidos')]");


    /**
     * <input aria-invalid="false" aria-required="true" autocomplete="on" inputmode="text" name="" placeholder="5555555555" type="number" required="" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_CELULAR =
            Target.the("numero de celular")
                    .locatedBy("//input[contains(@type,'number')]");

    /**
     * <button data-baseweb="button" id="merch-onb-ContactInfo" type="submit" class="dp fp ca cs gg gh au gi ax az ay b0 by cv gj gk gl b2 gm fr gn go gp gq gr gs ex aj eu ec gt gu gv gw gx c3 c4 fg fh cp eg h4 h5 gy gz h0">Continuar</button>
     */
    public static final Target BTN_CONTINUAR =
            Target.the("continuar")
                    .locatedBy("//button[contains(@id,'merch-onb-ContactInfo')]");


}
