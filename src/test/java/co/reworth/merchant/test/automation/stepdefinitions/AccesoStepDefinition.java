package co.reworth.merchant.test.automation.stepdefinitions;

import co.reworth.merchant.test.automation.models.DatosCuenta;
import co.reworth.merchant.test.automation.questions.Aparece;
import co.reworth.merchant.test.automation.tasks.Acceder;
import co.reworth.merchant.test.automation.tasks.IrA;
import co.reworth.merchant.test.automation.userinterfaces.PortalComercios;
import co.reworth.merchant.test.automation.userinterfaces.Tablero;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.CoreMatchers;

public class AccesoStepDefinition {



    @Dado("que {string} ingreso al portal de comercios de Reworth")
    public void que_el_usuario_ingreso_al_portal_de_comercios_de_Reworth(String actor) {

        OnStage.theActorCalled(actor).attemptsTo(IrA.portalComercios());

    }

    @Cuando("intenta acceder a su cuenta con credenciales(.*)")
    public void intenta_acceder_a_su_cuenta_con_credenciales_validas(DatosCuenta datosCuenta) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Acceder.con(
                        datosCuenta.getCorreo(),
                        datosCuenta.getClave()
                ));

    }

    @Entonces("deberia ver su cuenta iniciada")
    public void deberia_ver_su_cuenta_iniciada() {

        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(Tablero.ETIQUETA_SALDO_DISPONIIBLE, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("aparece en pantalla su",
                        Aparece.en(Tablero.ETIQUETA_SALDO_DISPONIIBLE),
                        CoreMatchers.equalTo("Saldo disponible")));

    }

    @Entonces("no deberia permitir el acceso, mostrando {string}")
    public void no_deberia_permitir_el_acceso_mostrando(String string) {

        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(PortalComercios.ALERTA_ERROR_DATOS_INCORRECTOS, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("aparece alerta de",
                        Aparece.en(PortalComercios.ALERTA_ERROR_DATOS_INCORRECTOS),
                        CoreMatchers.startsWith("ERROR: Datos incorrectos")));
    }
}
