package co.reworth.merchant.test.automation.tasks;

import co.reworth.merchant.test.automation.userinterfaces.PortalComercios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IrA implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(PortalComercios.class));
    }

    public static IrA portalComercios(){
        return Tasks.instrumented(IrA.class);
    }
}
