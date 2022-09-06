package co.reworth.merchant.testautmerchant.test.automation.tasks.general.redireccion;


import co.reworth.merchant.testautmerchant.test.automation.interactions.Esperar;
import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.general.EnlacesUI;
import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@AllArgsConstructor
public class Trasladarse implements Task
{
    private String proceso;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        Target elemento= EnlacesUI.LNK_A_OTRO_PROCESO.of(this.proceso);
        actor.attemptsTo(
                Esperar.hastaQue(elemento).este(EstadoElemento.CLICKABLE).porNoMasDe(20).segundos(),
                Click.on(elemento)
        );


    }

    public static Trasladarse al(String proceso)
    {
       return Tasks.instrumented(
               Trasladarse.class,
               proceso
       );
    }
}
