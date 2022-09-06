package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.registro.datosnegocio;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.models.Negocio;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.OpcionUI;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.registro.DatosNegocioUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class DiligenciarRegistroDatosNegocio implements Task
{
    private Negocio datosNegocio;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Esperar.hastaQue(DatosNegocioUI.TXT_NOMBRE)
                        .este(EstadoElemento.VISIBLE)
                        .porNoMasDe(20).segundos(),

                Enter.theValue(this.datosNegocio.getNombre())
                        .into(DatosNegocioUI.TXT_NOMBRE),

                Check.whether(!this.datosNegocio.getCategoria().isEmpty())
                        .andIfSo(
                                Enter.theValue(this.datosNegocio.getCategoria())
                                        .into(DatosNegocioUI.CMB_CATEGORIA).thenHit(Keys.ENTER)
                        ),

                Check.whether(!this.datosNegocio.getTipo().isEmpty())
                        .andIfSo(
                                Click.on(OpcionUI.BTN_OPCION.of(this.datosNegocio.getTipo()))
                        ),

                Enter.theValue(this.datosNegocio.getWeb())
                        .into(DatosNegocioUI.TXT_WEB),

                Enter.theValue(this.datosNegocio.getDireccion())
                        .into(DatosNegocioUI.TXT_UBICACION)
        );
    }

    public static DiligenciarRegistroDatosNegocio delPropietarioCon(Negocio datosNegocio)
    {
       return Tasks.instrumented(
               DiligenciarRegistroDatosNegocio.class,
               datosNegocio
       );
    }
}
