package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features.registro;

import co.reworth.merchant.testautmerchant.test.automation.constants.enums.EtiquetadoComo;
import co.reworth.merchant.testautmerchant.test.automation.models.Cuenta;
import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features.PortalStepDefinition;
import co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.general.RedireccionStepDefinition;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.inicio.PortalUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.inicio.DiligenciarInicioRegistro;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.inicio.IntentarInicioRegistro;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.InicioRegistroUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.questions.ElEstado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class InicioRegistroStepDefinition {

    @Dado("que {string} se encuentra iniciando el registro de su cuenta en Reworth")
    public static void queElComercioSeEncuentraIniciandoElRegistroDeSuCuentaEnReworth(String actor) {
        if  (   !Usuario.estaEnEscena(actor) )
        {
            PortalStepDefinition.queSeEcuentraEnElPortalDeReworth(actor);
            RedireccionStepDefinition.ingresaALaOpcionPara(EtiquetadoComo.REGISTRARSE.enPantalla());
        }
    }

    @Cuando("intenta iniciar con el registro de su cuenta(.*)")
    public static void intentaIniciarConElRegistroDeSuCuenta(Cuenta cuenta)
    {
        InicioRegistroStepDefinition.queElComercioSeEncuentraIniciandoElRegistroDeSuCuentaEnReworth(
                Usuario.protagonista().getNombre()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                IntentarInicioRegistro.delComercio(cuenta)
        );
    }

    @Cuando("diligencia el inicio de su registro(.*)")
    public static void diligenciaElInicioDeSuRegistro(Cuenta cuenta)
    {
        InicioRegistroStepDefinition.queElComercioSeEncuentraIniciandoElRegistroDeSuCuentaEnReworth(
                Usuario.protagonista().getNombre()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarInicioRegistro.delComercio(cuenta)
        );
    }

    @Entonces("no deberia permitir la opcion para continuar con el proceso")
    public static void noDeberiaPermitirLaOpcionParaContinuarConElProceso()
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ElEstado.deLosElementos(
                                InicioRegistroUI.BTN_UNIRME
                        ).sea(EstadoElemento.DESHABILITADO)
                )
        );
    }

    @Entonces("deberia indicarse el inicio de sesion")
    public static void deberiaIniciarseElInicioDeSesion()
    {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ElEstado.deLosElementos(
                                PortalUI.BTN_REGISTRARSE
                        ).sea(EstadoElemento.VISIBLE)
                )
        );
    }

}
