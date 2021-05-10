package co.com.andrea.bancolombia.stepdefinitions;

import co.com.andrea.bancolombia.models.Tasa;
import co.com.andrea.bancolombia.questions.MensajeEsperado;
import co.com.andrea.bancolombia.tasks.ConvertirTasa;
import co.com.andrea.bancolombia.tasks.IrA;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.andrea.bancolombia.utils.Constantes.CLIENTE;
import static co.com.andrea.bancolombia.utils.Constantes.RESULTADO_CONVERSION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class ConversorTasaNominalEfectivaStepDefinition {

    @Dado("^que el cliente ingresa a Bancolombia$")
    public void queElClienteIngresaABancolombia() {
        theActorCalled(CLIENTE).wasAbleTo(IrA.Bancolombia()
        );
    }

    @Cuando("^ingresa los datos principales para convertir la tasa$")
    public void ingresaLosDatosPrincipalesParaConvertirLaTasa(List <Tasa> tasa) {
        theActorInTheSpotlight().attemptsTo(ConvertirTasa.ConInformacionPrincipal(tasa));
    }

    @Entonces("^se visualiza el resultado$")
    public void seVisualizaElResultado() {
        theActorInTheSpotlight().
                should(seeThat(MensajeEsperado.es(co.com.andrea.bancolombia.userinterfaces.Tasas.MENSAJE_RESULTADO_BUSQUEDA),
                        containsString(RESULTADO_CONVERSION)));
    }

}