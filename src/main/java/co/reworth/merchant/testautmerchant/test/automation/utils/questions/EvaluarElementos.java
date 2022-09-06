package co.reworth.merchant.testautmerchant.test.automation.utils.questions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class EvaluarElementos implements Question<Boolean>
{
    private Target[] elementos;

    @Override
    public Boolean answeredBy(Actor actor)
    {
        actor.attemptsTo(
                WaitUntil.the(this.elementos[0], WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds()
        );

        boolean resultado = true;

        for (   Target elemento : this.elementos )
        {
            if  (   !(resultado = this.validaQue(actor,elemento))  ){
                break;
            }
        }

        return resultado;
    }

    protected abstract boolean validaQue(Actor actor, Target elemento);

}
