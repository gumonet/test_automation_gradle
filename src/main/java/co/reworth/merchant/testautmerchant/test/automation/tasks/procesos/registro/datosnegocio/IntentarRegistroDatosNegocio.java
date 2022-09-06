package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datosnegocio;


import co.reworth.merchant.testautmerchant.test.automation.constants.enums.EtiquetadoComo;
import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Negocio;
import co.reworth.merchant.testautmerchant.test.automation.models.Propietario;
import co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datospersonales.DiligenciarRegistroDatosPersonales;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.OpcionUI;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.DatosPersonalesUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

@AllArgsConstructor
public class IntentarRegistroDatosNegocio implements Task
{
    private Negocio datosNegocio;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        Target btnContinuar = OpcionUI.BTN_OPCION_SUBMIT.of(EtiquetadoComo.CONTINUAR.enPantalla());

        actor.attemptsTo(
                DiligenciarRegistroDatosNegocio.delPropietarioCon(this.datosNegocio),
                Esperar.hastaQue(btnContinuar)
                        .este(EstadoElemento.CLICKABLE)
                        .porNoMasDe(20).segundos(),

                Click.on(btnContinuar)
        );
    }

    public static IntentarRegistroDatosNegocio delPropietarioCon(Negocio datosNegocio)
    {
       return Tasks.instrumented(
               IntentarRegistroDatosNegocio.class,
               datosNegocio
       );
    }
}
