package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MapObjetEmpleado.*;
import static userinterfaces.MapObjetInicio.txtUsername;

public class PagObjetEmpleado implements Task {

    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String id;


    //CREAR NUESTRO CONSTRUCTOR
    public PagObjetEmpleado(String firstName, String middleName,String lastName,String id ){
        //CREAR VARIABLE
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.id=id;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //(Scroll.to(CLICK_btn_widgets)),
                TiempoEspera.unMomento(2),
                Enter.theValue(firstName).into(txtfirstNamee),
                TiempoEspera.unMomento(4),
                Enter.theValue(middleName).into(txtMiddleName),
                Enter.theValue(lastName).into(txtlastName),
                Hit.the(Keys.SHIFT,Keys.HOME).into(txtId),
                Hit.the(Keys.BACK_SPACE).into(txtId),
                Enter.theValue(id).into(txtId),
                TiempoEspera.unMomento(4),
                Click.on(btnSave),
                TiempoEspera.unMomento(3));

    }

    public static PagObjetEmpleado cantidad (String firstName, String middleName,String lastName,String id){
        return instrumented(PagObjetEmpleado.class,firstName,middleName,lastName,id);

    }
}
