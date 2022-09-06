package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features.registro;

import co.reworth.merchant.testautmerchant.test.automation.models.Cuenta;
import co.reworth.merchant.testautmerchant.test.automation.models.Propietario;
import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datospersonales.DiligenciarRegistroDatosPersonales;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datospersonales.IntentarRegistroDatosPersonales;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroDatosPersonalesStepDefinition {

    @Dado("que {string} se encuentra ingresando sus datos personales(.*)")
    public static void queElComercioSeEncuentraIngresandoSusDatosPersonalesComoParteDeLaCreacionDeSuCuentaEnReworth(String actor, Cuenta datosCuenta) {
        if  (   !Usuario.estaEnEscena(actor) )
        {
            InicioRegistroStepDefinition.intentaIniciarConElRegistroDeSuCuenta(datosCuenta);
        }
    }

    @Cuando("diligencia sus datos personales(.*)")
    public static void diligenciaSusDatosPersonales(Propietario datosPropietario)
    {
        RegistroDatosPersonalesStepDefinition.queElComercioSeEncuentraIngresandoSusDatosPersonalesComoParteDeLaCreacionDeSuCuentaEnReworth(
                Usuario.protagonista().getNombre(),
                Usuario.protagonista().getLibreto().getDatosCuenta()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarRegistroDatosPersonales.delPropietarioCon(datosPropietario)
        );
    }

    @Cuando("intenta registrar sus datos personales(.*)")
    public static void intentaRegistrarSusDatosPersonales(Propietario datosPropietario)
    {
        RegistroDatosPersonalesStepDefinition.queElComercioSeEncuentraIngresandoSusDatosPersonalesComoParteDeLaCreacionDeSuCuentaEnReworth(
                Usuario.protagonista().getNombre(),
                Usuario.protagonista().getLibreto().getDatosCuenta()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                IntentarRegistroDatosPersonales.delPropietarioCon(datosPropietario)
        );
    }
}
