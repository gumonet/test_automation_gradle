package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features;

import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import io.cucumber.java.es.Dado;

public class PortalStepDefinition
{

    @Dado("que {string} se encuentra en el portal de Reworth")
    public static void queSeEcuentraEnElPortalDeReworth(String actor) {
        if  (   !Usuario.estaEnEscena(actor) )
        {
            InicioStepDefinition.ingresaAlProtalDeReworth();
        }
    }

}
