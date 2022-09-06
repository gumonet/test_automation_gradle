package co.reworth.merchant.testautmerchant.test.automation.tasks.procesos.inicio;

import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.inicio.PortalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IniciarEn implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(PortalUI.class));
    }

    public static IniciarEn portalReworth(){
        return Tasks.instrumented(IniciarEn.class);
    }
}
