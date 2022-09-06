package co.reworth.merchant.testautmerchant.test.automation.tasks.general;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.OpcionUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarAOpcion implements Task
{
    private Target elemento;

    public IngresarAOpcion(Target elemento)
    {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            Esperar.hastaQue(this.elemento).este(
                    EstadoElemento.VISIBLE,
                    EstadoElemento.HABILITADO
                ).porNoMasDe(20).segundos(),
            Click.on(this.elemento)
        );
    }

    public static IngresarAOpcion aTravesDel(String nombre)
    {
        return Tasks.instrumented(IngresarAOpcion.class, OpcionUI.BTN_OPCION.of(nombre));
    }

    public static IngresarAOpcion aTravesDel(Target elemento)
    {
        return Tasks.instrumented(IngresarAOpcion.class,elemento);
    }
}
