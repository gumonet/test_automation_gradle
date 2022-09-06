package co.reworth.merchant.testautmerchant.test.automation.setups.hooks;

import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Escena {

    @Before
    public void camaras() {
        OnStage.setTheStage(new OnlineCast());
    }

    /**
     * Al terminar un caso de prueba
     */
    @After
    public void corte()
    {
        Usuario.sePreparaParaSiguienteEscena();
    }

}
