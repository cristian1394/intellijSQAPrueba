package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MapObjetCerrarSesion.*;

public class PagObjetCerrarSesion implements Task {

    public PagObjetCerrarSesion() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                TiempoEspera.unMomento(3),
                Click.on(btnPaul),
                TiempoEspera.unMomento(4),
                Click.on(btnLogout),
                TiempoEspera.unMomento(4));


}
    public static PagObjetCerrarSesion login () {
        return instrumented(PagObjetCerrarSesion.class);

    }
}

