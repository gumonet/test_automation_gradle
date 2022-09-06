package co.reworth.merchant.testautmerchant.test.automation.stepdefinitions.features.registro;

import co.reworth.merchant.testautmerchant.test.automation.models.Negocio;
import co.reworth.merchant.testautmerchant.test.automation.models.Propietario;
import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datosnegocio.DiligenciarRegistroDatosNegocio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroDatosNegocioStepDefinition {

    @Dado("que {string} se encuentra ingresando la informacion de su negocio(.*)")
    public static void queElComercioSeEncuentraIngresandoLaInformacionDeSuNegocio(String actor, Propietario datosPropietario) {
        if  (   !Usuario.estaEnEscena(actor) )
        {
            RegistroDatosPersonalesStepDefinition.intentaRegistrarSusDatosPersonales(datosPropietario);
        }
    }

    @Cuando("diligencia la informacion de su negocio(.*)")
    public static void diligenciaLaInformacionDeSuNegocio(Negocio datosNegocio)
    {
        RegistroDatosNegocioStepDefinition.queElComercioSeEncuentraIngresandoLaInformacionDeSuNegocio(
                Usuario.protagonista().getNombre(),
                Usuario.protagonista().getLibreto().getDatosPropietario()
        );


        OnStage.theActorInTheSpotlight().attemptsTo(
                DiligenciarRegistroDatosNegocio.delPropietarioCon(datosNegocio)
        );
    }
/*
    @Cuando("intenta registrar sus datos personales(.*)")
    public static void intentaRegistrarSusDatosPersonales(Propietario datosPropietario)
    {
        RegistroDatosNegocioStepDefinition.queElComercioSeEncuentraIngresandoSusDatosPersonalesComoParteDeLaCreacionDeSuCuentaEnReworth(
                Usuario.actual().getNombre(),
                Usuario.actual().getDatosOperacion().getDatosCuenta()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                IntentarRegistroDatosPersonales.delPropietarioCon(datosPropietario)
        );
    }

 */
}
