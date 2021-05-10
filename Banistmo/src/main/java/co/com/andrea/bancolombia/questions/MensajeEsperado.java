package co.com.andrea.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeEsperado implements Question<String> {

    private Target elemento;

    public MensajeEsperado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
       return  Text.of(elemento).viewedBy(actor).asString();
    }

    public static MensajeEsperado es(Target elemento) {
        return new MensajeEsperado(elemento);
    }
}
