package co.reworth.merchant.test.automation.tasks;

import co.reworth.merchant.test.automation.userinterfaces.PortalComercios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Acceder implements Task{

    private String correo;

    private String clave;

    public Acceder(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PortalComercios.CAMPO_CORREO_ELECTRONICO, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(this.correo).into(PortalComercios.CAMPO_CORREO_ELECTRONICO),
                Enter.theValue(this.clave).into(PortalComercios.CAMPO_CLAVE),
                //WaitUntil.the(PortalComercios.BOTON_INICIAR_SESION, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(PortalComercios.BOTON_INICIAR_SESION));
    }

    public static Acceder con(String correo, String clave){
        return Tasks.instrumented(Acceder.class,correo,clave);
    }
}
