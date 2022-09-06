package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.general;


import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.OpcionUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.questions.ElEstado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class OpcionStepDefinition {

    @Entonces("deberia indicarse {string} la opcion {string}, para dar continuidad al proceso")
    public static void noDeberiaDarContinuidadALaOperacionAlertando(String estado, String opcion)
    {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                ElEstado.deLosElementos(
                    OpcionUI.BTN_OPCION_SUBMIT.of(opcion)
                ).sea(EstadoElemento.valueOf(estado.toUpperCase()))
            )
        );
    }
}
