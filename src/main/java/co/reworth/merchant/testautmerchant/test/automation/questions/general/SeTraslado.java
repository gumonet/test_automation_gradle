package co.reworth.merchant.testautmerchant.test.automation.questions.general;

import co.reworth.merchant.testautmerchant.test.automation.utils.navegador.VentanaUtils;
import lombok.Builder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


@Builder
public class SeTraslado implements Question<Boolean>
{

    private String contenido;

    @Override
    public Boolean answeredBy(Actor actor)
    {
        return VentanaUtils.getTituloPestanya(actor).contains(this.contenido);
    }

    public static SeTraslado hacia(String contenido)
    {
        return SeTraslado.builder().contenido(contenido).build();
    }
}
