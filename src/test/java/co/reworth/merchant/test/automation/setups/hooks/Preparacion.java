package co.reworth.merchant.test.automation.setups.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Preparacion {

    @Before
    public void escena() {
        OnStage.setTheStage(new OnlineCast());
    }

}
