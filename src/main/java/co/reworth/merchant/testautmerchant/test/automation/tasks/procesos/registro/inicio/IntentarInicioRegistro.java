package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.inicio;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Cuenta;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.InicioRegistroUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class IntentarInicioRegistro implements Task
{
    private Cuenta datosCuenta;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                DiligenciarInicioRegistro.delComercio(this.datosCuenta),
                Esperar.hastaQue(InicioRegistroUI.BTN_UNIRME)
                        .este(EstadoElemento.CLICKABLE)
                        .porNoMasDe(20).segundos(),

                Click.on(InicioRegistroUI.BTN_UNIRME)
        );
    }

    public static IntentarInicioRegistro delComercio(Cuenta datosCuenta)
    {
       return Tasks.instrumented(
               IntentarInicioRegistro.class,
               datosCuenta
       );
    }
}
