package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.general;

import co.reworth.merchant.testautmerchant.test.automation.models.Pagina;
import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.questions.general.SeTraslado;
import co.reworth.merchant.testautmerchant.test.automation.tasks.general.IngresarAOpcion;
import co.reworth.merchant.testautmerchant.test.automation.tasks.general.redireccion.Trasladarse;
import co.reworth.merchant.testautmerchant.test.automation.tasks.general.redireccion.TrasladarseHacia;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.TextoContenidoUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.questions.ElEstado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

public class RedireccionStepDefinition {

    @Cuando("se traslada para {string}(.*)")
    public static void seTrasladaPara(String proceso)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Trasladarse.al(proceso)
        );
    }

    @Cuando("se traslada hacia (.*)")
    public static void seTrasladaHacia(Pagina datosPagina)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TrasladarseHacia.el(datosPagina)
        );
    }

    @Cuando("ingresa a la opción para {string}(.*)")
    public static void ingresaALaOpcionPara(String opcion)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
            IngresarAOpcion.aTravesDel(opcion)
        );
    }

    public static void ingresaALaOpcionPara(Target opcion)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarAOpcion.aTravesDel(opcion)
        );
    }

    @Entonces("deberia haberse trasladado (.*)")
    public static void deberiaHaberseTrasladado()
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        SeTraslado.hacia(
                                Usuario.protagonista().getLibreto().getDatosPagina().getContenido()
                        )
                )
        );
    }

    @Entonces("deberia mostrarse en pantalla {string}(.*)")
    public static void deberiaMostrasEnPantalla(String texto)
    {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                ElEstado.deLosElementos(TextoContenidoUI.LBL_TEXTO.of(texto))
                    .sea(EstadoElemento.VISIBLE)
            )
        );
    }

}
