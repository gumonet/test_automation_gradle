package co.reworth.merchant.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Aparece implements Question<String> {

    private Target valor;

    public Aparece(Target valor) {
        this.valor = valor;
    }

    @Override
    public String answeredBy(Actor actor) {
        return this.valor.resolveFor(actor).getTextContent();
    }

    public static Aparece en(Target componente){
        return new Aparece(componente);
    }
}
