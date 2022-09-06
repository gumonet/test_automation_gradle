package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.general;


import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.VisorUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.questions.ElEstado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class VisorStepDefinition {

    @Entonces("deberia {string} la clave")
    public static void deberiaObservarseLaClave (String estado) {

        if  (   "leerse".equalsIgnoreCase(estado)   )
        {
            OnStage.theActorInTheSpotlight().should(
                    GivenWhenThen.seeThat(
                            ElEstado.deLosElementos(
                                    VisorUI.TXT_CLAVE_DESPROTEGIDA
                            ).sea(EstadoElemento.PRESENTE)
                    )
            );
        }   else    {
            OnStage.theActorInTheSpotlight().should(
                    GivenWhenThen.seeThat(
                            ElEstado.deLosElementos(
                                    VisorUI.TXT_CLAVE_PROTEGIDA
                            ).sea(EstadoElemento.PRESENTE)
                    )
            );
        }
    }
}
