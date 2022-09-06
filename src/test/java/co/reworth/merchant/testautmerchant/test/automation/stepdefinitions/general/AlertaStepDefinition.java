package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.general;

import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.AlertasUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.questions.ElEstado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AlertaStepDefinition {

    @Entonces("no deberia  realizarse la operacion, alertando {string}")
    public static void noDeberiaRealizarseLaOPeracionAlertando(String mensaje)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ElEstado.deLosElementos(
                                AlertasUI.ALERTA_OPERACION
                        ).sea(EstadoElemento.VISIBLE)
                ),
                GivenWhenThen.seeThat(
                        ElEstado.deLosElementos(
                                AlertasUI.DESCRIPCION_ALERTA_OPERACION_CON_O.of(mensaje)
                        ).sea(EstadoElemento.VISIBLE)
                )
        );
    }

    @Entonces("no deberia  realizarse la operacion, indicando {string}")
    public static void noDeberiaRealizarseLaOPeracionIndicando(String mensaje)
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ElEstado.deLosElementos(
                                AlertasUI.ALERTA_ELEMENTO_CON_O.of(mensaje)
                        ).sea(EstadoElemento.VISIBLE)
                )
        );
    }
}
