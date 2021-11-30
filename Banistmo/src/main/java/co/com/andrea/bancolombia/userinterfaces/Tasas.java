package co.com.andrea.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Tasas {

    public static final Target INGRESAR_CAPITALIZACION = Target.the("Dato Capitalizacion").located(By.id("capitalizacion"));
    public static final Target INGRESAR_PERIODICIDAD = Target.the("Dato Periodicidad").located(By.id("periodicidad-deseada"));
    public static final Target INGRESAR_TASA = Target.the("Dato Tasa").located(By.id("interes"));
   // public static final Target CALCULAR_NOMINAL_EFECTIVA = Target.the("Boton calcular Nominal Efectiva").locatedBy("//*[@id='location-field-leg1-destination-menu']/div[2]/ul/li[1]/button");
    public static final Target OPCION_CONVERSOR_TASAS = Target.the("Boton Conversor Tasas").locatedBy("//*[@id='simuladores']/div/div/div[3]/div[1]/div[2]/div/ul/li[4]/a/h3");
    public static final Target OPCION_HERRAMIENTAS = Target.the("Opcion Herramientas").locatedBy("//*[@id='menu-top']/div/div/div/ul/li[4]/a");
    public static final Target OPCION_NEGOCIOS = Target.the("Opcion Negocios").locatedBy("//*[@id='header-pymes']");
    public static final Target MENSAJE_RESULTADO_BUSQUEDA = Target.the("Resultado Busqueda").located(By.id("respuesta"));
public static final Target BTN_PAGINA_PRINCIPAL= Target.the("Botón Página principal").locatedBy("//*/button[@class='modal-prehome-fenix-header-info-button-home btn-modal']");
}
