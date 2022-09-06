package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datospersonales;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Propietario;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.DatosPersonalesUI;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.InicioRegistroUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class IntentarRegistroDatosPersonales implements Task
{
    private Propietario datosPropietario;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                DiligenciarRegistroDatosPersonales.delPropietarioCon(this.datosPropietario),
                Esperar.hastaQue(DatosPersonalesUI.BTN_CONTINUAR)
                        .este(EstadoElemento.CLICKABLE)
                        .porNoMasDe(20).segundos(),

                Click.on(DatosPersonalesUI.BTN_CONTINUAR)
        );
    }

    public static IntentarRegistroDatosPersonales delPropietarioCon(Propietario datosPropietario)
    {
       return Tasks.instrumented(
               IntentarRegistroDatosPersonales.class,
               datosPropietario
       );
    }
}
