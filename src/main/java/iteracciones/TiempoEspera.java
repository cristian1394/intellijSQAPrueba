package iteracciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.UtiliTime;

import java.util.concurrent.TimeUnit;

public class TiempoEspera implements Interaction
{
    private final int milisegundos;
    protected WebDriver driver;

    //CREAR EL CONSTRUCTOR
    public TiempoEspera(int milisegundos)
    {
        this.milisegundos = milisegundos*1000;
    }

    public static TiempoEspera unMomento(int miliseguntos)
    {
        return Tasks.instrumented(TiempoEspera.class, miliseguntos);
    }

    // METODO DE ELIMINAR TEXTO CON EL TECLADO

    public void eliminarTextoKeyBoard(By elemento) throws Exception
    {

        driver.findElement(elemento).sendKeys(Keys.CONTROL + "a");
        driver.findElement(elemento).sendKeys(Keys.DELETE);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try
        {
            Awaitility.await().forever().pollInterval(milisegundos,
                    TimeUnit.MILLISECONDS).until(UtiliTime.condicionExitosa());
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
