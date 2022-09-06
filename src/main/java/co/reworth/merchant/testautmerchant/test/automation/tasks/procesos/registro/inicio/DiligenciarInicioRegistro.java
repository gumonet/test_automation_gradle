package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.inicio;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Detener;
import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Cuenta;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.VisorUI;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.InicioRegistroUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

@AllArgsConstructor
public class DiligenciarInicioRegistro implements Task
{
    private Cuenta datosCuenta;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        boolean interactuarConVisor = this.datosCuenta.getVisor()!=null;
        boolean activarVisor = interactuarConVisor && this.datosCuenta.getVisor().booleanValue();

        actor.attemptsTo(
                Esperar.hastaQue(InicioRegistroUI.TXT_CORREO)
                        .este(EstadoElemento.VISIBLE)
                        .porNoMasDe(20).segundos(),

                Enter.theValue(this.datosCuenta.getCorreo())
                        .into(InicioRegistroUI.TXT_CORREO),

                Enter.theValue(this.datosCuenta.getClave())
                        .into(InicioRegistroUI.TXT_CLAVE_PROTEGIDA),

                Check.whether(interactuarConVisor)
                        .andIfSo(
                                Click.on(VisorUI.CHK_VISOR),

                                Check.whether(!activarVisor)
                                        .andIfSo(
                                                Detener.por(1).segundos(),

                                                Click.on(VisorUI.CHK_VISOR)
                                        )
                        ),

                Check.whether(this.datosCuenta.isAceptoTerminos())
                        .andIfSo(
                                Click.on(InicioRegistroUI.CHK_TERMINOS)
                        )
        );
    }

    public static DiligenciarInicioRegistro delComercio(Cuenta datosCuenta)
    {
       return Tasks.instrumented(
               DiligenciarInicioRegistro.class,
               datosCuenta
       );
    }
}
