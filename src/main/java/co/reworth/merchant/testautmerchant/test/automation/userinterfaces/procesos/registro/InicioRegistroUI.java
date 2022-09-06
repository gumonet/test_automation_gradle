package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro;

import net.serenitybdd.screenplay.targets.Target;

public class InicioRegistroUI {


    /**
     * <input aria-invalid="false" aria-required="false" autocomplete="on" inputmode="text" name="mail" placeholder="Correo electrónico" type="email" class="ae en bq br bs bt bu bv bw bx by as bz c0 c1 c2 er es et eu aj e7 b9 ei ai c7 ev ew ex" value="">
     */
    public static final Target TXT_CORREO =
            Target.the("correo electronico")
                    .locatedBy("//input[@name='mail']");


    /**
     * <HTML></>
     */
    public static final Target TXT_CLAVE_PROTEGIDA =
            Target.the("clave")
                    .locatedBy("//input[@type='password']");

    public static final Target TXT_CLAVE_DESPROTEGIDA =
            Target.the("clave")
                    .locatedBy("//input[@type='text']");

    /**
     * <span class="ft b2 b3 fu ci ch fv fw ae ax ay az b0 ey ez f0 aw fx fy fz g0 g1 g2 g3 g4 by ce g5 dm dj g6 g7 g8 g9 ga gb"></span>
     */
    public static final Target CHK_TERMINOS=
            Target.the("aceptar terminos y condiciones")
                    .locatedBy("//*[@data-baseweb='checkbox']/span[@class]");

    /**
     * <button data-baseweb="button" id="signup-submit-button" type="submit" class="dp fp ca cs gg gh au gi ax az ay b0 by cv gj gk gl b2 gm fr gn go gp gq gr gs ex aj eu ec gt gu gv gw gx c3 c4 fg fh cp eg h3 h4 gy gz h0">Unirme</button>
     */
    public static final Target BTN_UNIRME=
            Target.the("unirme")
                    .locatedBy("//button[@id='signup-submit-button']");




}

