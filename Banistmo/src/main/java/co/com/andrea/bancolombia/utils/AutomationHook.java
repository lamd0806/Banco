package co.com.andrea.bancolombia.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationHook {

    @Before
    public void iniciarNavegador(){
        OnStage.setTheStage(new OnlineCast());
    }

}
