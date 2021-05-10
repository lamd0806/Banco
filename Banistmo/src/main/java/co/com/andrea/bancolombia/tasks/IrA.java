package co.com.andrea.bancolombia.tasks;

import co.com.andrea.bancolombia.userinterfaces.InicioBancolombia;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class IrA implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Open.browserOn().the(InicioBancolombia.class)));
    }

    public static IrA Bancolombia() {
        return Instrumented.instanceOf(IrA.class).withProperties();
    }

}
