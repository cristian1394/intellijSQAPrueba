package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MapObjetFormularioEmpleado.txtNickName;
import static userinterfaces.MapObjetInformacionEmpleado.*;

public class PagObjetInformacionEmpleado implements Task {

    private static String EmployeeName;

    public PagObjetInformacionEmpleado(String EmployeeName) {

        this.EmployeeName=EmployeeName;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                TiempoEspera.unMomento(3),
                Click.on(btnPim),
                Enter.theValue(EmployeeName).into(txtEmployeeName),
                Click.on(btnSearch),
                Click.on(btnID),
                TiempoEspera.unMomento(4),
                Click.on(btnEliminar),
                Click.on(btnEliminar2),
                TiempoEspera.unMomento(2));

}

    public static PagObjetInformacionEmpleado informacion (String EmployeeName) {
        return instrumented(PagObjetInformacionEmpleado.class,EmployeeName);


    }
}

