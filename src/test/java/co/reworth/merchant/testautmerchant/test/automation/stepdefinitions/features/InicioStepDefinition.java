package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features;


import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.inicio.IniciarEn;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

public class InicioStepDefinition {

    @Cuando("ingresa al portal de Reworth")
    public static void ingresaAlProtalDeReworth () {

        OnStage.theActorCalled(Usuario.protagonista().getNombre())
                .attemptsTo(IniciarEn.portalReworth());
    }
}
