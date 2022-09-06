package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datospersonales;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Propietario;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.DatosPersonalesUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class DiligenciarRegistroDatosPersonales implements Task
{
    private Propietario datosPropietario;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Esperar.hastaQue(DatosPersonalesUI.TXT_NOMBRE_COMPLETO)
                        .este(EstadoElemento.VISIBLE)
                        .porNoMasDe(20).segundos(),

                Enter.theValue(this.datosPropietario.getNombre())
                        .into(DatosPersonalesUI.TXT_NOMBRE_COMPLETO),

                Enter.theValue(this.datosPropietario.getCelular())
                        .into(DatosPersonalesUI.TXT_CELULAR)
        );
    }

    public static DiligenciarRegistroDatosPersonales delPropietarioCon(Propietario datosPropietario)
    {
       return Tasks.instrumented(
               DiligenciarRegistroDatosPersonales.class,
               datosPropietario
       );
    }
}
