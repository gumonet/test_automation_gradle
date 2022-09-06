package co.reworth.merchant.testautmerchant.test.automation.interactions;
import co.reworth.merchant.testautmerchant.test.automation.utils.navegador.VentanaUtils;
import co.reworth.merchant.testautmerchant.test.automation.utils.navegador.WebDriverUtils;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Switch;
import org.apache.commons.collections.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@Builder
public class Trasladar implements Interaction {

    private String tituloPestanya;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        String idPestanyaActual = VentanaUtils.getIdPestanyaActual(actor);

        for (   String idPestanya : VentanaUtils.getIdPestanyas(actor)  )
        {
            if  (   !idPestanyaActual.equals(idPestanya)  )
            {
                actor.attemptsTo(
                        Switch.toWindow(idPestanya),
                        Detener.por(1).segundos()
                );
                if  (   VentanaUtils.getTituloPestanya(actor).contains(this.tituloPestanya)  )
                {
                    break;
                }
            }
        }

    }

    public static Trasladar aPestanya(String tituloPestanya)
    {
        return Trasladar.builder().tituloPestanya(tituloPestanya).build();
    }
}
