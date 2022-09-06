package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro;

import net.serenitybdd.screenplay.targets.Target;

public class DatosNegocioUI {


    /**
     * <input aria-invalid="false" aria-required="true" autocomplete="on" inputmode="text" name="" placeholder="Nombre del negocio" type="text" required="" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_NOMBRE =
            Target.the("nombre del negocio")
                    .locatedBy("//input[contains(@placeholder,'Nombre del negocio')]");


    /**
     * <input aria-autocomplete="list" aria-expanded="false" aria-haspopup="listbox" aria-label="" aria-required="true" required="" role="combobox" tabindex="0" class="aj eu b9 bn bo kn l1 c0 d2 bu bw bv bx kl ce by gr ex gq gs ik il fb fc" value="" aria-activedescendant="bui4val-7">
     */
    public static final Target CMB_CATEGORIA =
            Target.the("categoria del negocio")
                    .locatedBy("//input[@aria-autocomplete='list']");


    /**
     * <input aria-invalid="false" aria-required="false" autocomplete="on" inputmode="text" name="" placeholder="Ej. www.tunegocio.com" type="text" class="ae fa bq br bs bt bu bv bw bx by as bz c0 c1 c2 fe ff fg fh aj eu b9 f5 ai c7 fi fj fk" value="">
     */
    public static final Target TXT_WEB=
            Target.the("sitio web")
                    .locatedBy("//input[contains(@placeholder,'Ej. www.tunegocio.com')]");


    /**
     * <input placeholder="e.g. Av Oaxaca 96, Roma Nte., Cuauhtémoc, 06700, CDMX" name="addressPlace" required="" class="l2 as l3 cq kx fd l4 ai co eu fi pac-target-input" value="" autocomplete="off">
     */
    public static final Target TXT_UBICACION=
            Target.the("ubicacion")
                    .locatedBy("//input[@name='addressPlace']");
}
