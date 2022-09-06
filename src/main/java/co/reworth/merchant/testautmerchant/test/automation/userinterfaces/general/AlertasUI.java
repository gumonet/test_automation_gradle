package co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general;

import net.serenitybdd.screenplay.targets.Target;

public class AlertasUI
{
    /**
     * <div role="alert" data-baseweb="toast" class="aj bm b9 bn hq hr ea hs ht hu hv hw d8 d9 hx hy hz i0 i1 i2 ia i3 b2 i4 aq dn i5 i6"><div class=""><div><strong>Información incorrecta</strong><br><br>Verifica tu correo electrónico y contraseña e intenta de nuevo</div></div><svg data-baseweb="icon" title="Close" viewBox="0 0 24 24" role="button" tabindex="0" class="ce cf cg i7 i8 fr i9 by"><title>Close</title><path fill-rule="evenodd" clip-rule="evenodd" d="M7.29289 7.29289C7.68342 6.90237 8.31658 6.90237 8.70711 7.29289L12 10.5858L15.2929 7.29289C15.6834 6.90237 16.3166 6.90237 16.7071 7.29289C17.0976 7.68342 17.0976 8.31658 16.7071 8.70711L13.4142 12L16.7071 15.2929C17.0976 15.6834 17.0976 16.3166 16.7071 16.7071C16.3166 17.0976 15.6834 17.0976 15.2929 16.7071L12 13.4142L8.70711 16.7071C8.31658 17.0976 7.68342 17.0976 7.29289 16.7071C6.90237 16.3166 6.90237 15.6834 7.29289 15.2929L10.5858 12L7.29289 8.70711C6.90237 8.31658 6.90237 7.68342 7.29289 7.29289Z"></path></svg></div>
     */
    public static final Target
            ALERTA_OPERACION =
            Target.the("alerta operacion")
                    .locatedBy("//div[@role='alert']");

    /**
     * <strong>Información incorrecta</strong>
     */
    public static final Target TITULO_ALERTA_OPERACION_CON_O =
            Target.the("titulo alerta operacion")
                    .locatedBy("//div[@role='alert']//strong[contains(text(),'{0}')]");

    /**
     * <div><strong>Información incorrecta</strong><br><br>Verifica tu correo electrónico y contraseña e intenta de nuevo</div>
     */
    public static final Target DESCRIPCION_ALERTA_OPERACION_CON_O =
            Target.the("descripcion alerta operacion")
                    .locatedBy("//div[@role='alert']/div/div[contains(text(),'{0}')]");

    /**
     * <svg data-baseweb="icon" title="Close" viewBox="0 0 24 24" role="button" tabindex="0" class="ce cf cg i7 i8 fr i9 by"><title>Close</title><path fill-rule="evenodd" clip-rule="evenodd" d="M7.29289 7.29289C7.68342 6.90237 8.31658 6.90237 8.70711 7.29289L12 10.5858L15.2929 7.29289C15.6834 6.90237 16.3166 6.90237 16.7071 7.29289C17.0976 7.68342 17.0976 8.31658 16.7071 8.70711L13.4142 12L16.7071 15.2929C17.0976 15.6834 17.0976 16.3166 16.7071 16.7071C16.3166 17.0976 15.6834 17.0976 15.2929 16.7071L12 13.4142L8.70711 16.7071C8.31658 17.0976 7.68342 17.0976 7.29289 16.7071C6.90237 16.3166 6.90237 15.6834 7.29289 15.2929L10.5858 12L7.29289 8.70711C6.90237 8.31658 6.90237 7.68342 7.29289 7.29289Z"></path></svg>
     */
    public static final Target CIERRE_ALERTA_OPERACION =
            Target.the("cerrar alerta")
                    .locatedBy("//div[contains(text(),'Verifica tu correo electrónico y contraseña e intenta de nuevo')]");

    /**
     * <p data-baseweb="typo-paragraphxsmall" class="h5 aj b9 dq bn" style="font-style: italic;">Acepta nuestros términos y condiciones para continuar.</p>
     */
    public static final Target ALERTA_ELEMENTO_CON_O =
            Target.the("alerta en elemento")
                    .locatedBy("//p[@data-baseweb='typo-paragraphxsmall'][contains(text(),'{0}')]");





}
