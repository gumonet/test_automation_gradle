package co.reworth.merchant.testautmerchant.test.automation.tasks.general.redireccion;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Detener;
import co.reworth.merchant.testautmerchant.test.automation.interactions.Trasladar;
import co.reworth.merchant.testautmerchant.test.automation.models.Pagina;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class TrasladarseHacia implements Task
{
    private Pagina datosPagina;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Trasladarse.al(this.datosPagina.getEnlace()),
                Trasladar.aPestanya(this.datosPagina.getContenido())
        );
    }

    public static TrasladarseHacia el(Pagina datosPagina)
    {
       return Tasks.instrumented(
               TrasladarseHacia.class,
               datosPagina
       );
    }
}
