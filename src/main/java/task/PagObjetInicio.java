package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MapObjetInicio.*;

public class PagObjetInicio implements Task {
    private String userName;
    private String password;



    public PagObjetInicio(String userName , String password)
    {


        this.userName = userName;
        this.password = password;



    }


    public static PagObjetInicio conDescripcion(String userName, String password){


        return instrumented(PagObjetInicio.class,userName,password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPTSTO
        actor.attemptsTo(


                TiempoEspera.unMomento(4),
                Enter.theValue(userName).into(txtUsername),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                Enter.theValue(password).into(txtPassword),
                TiempoEspera.unMomento(2),
                Click.on(btnLogin),
                Click.on(btnEmployee),
                TiempoEspera.unMomento(4));


    }
}
