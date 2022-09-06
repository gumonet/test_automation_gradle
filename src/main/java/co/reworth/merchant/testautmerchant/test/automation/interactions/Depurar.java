package co.reworth.merchant.testautmerchant.test.automation.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Depurar implements Interaction {


    private String mensaje;

    private Depurar(String mensaje) {

        this.mensaje = mensaje;
    }

    public static Depurar enConsola(String mensaje){
        return new Depurar(mensaje);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.err.println(this.mensaje);
    }
}
