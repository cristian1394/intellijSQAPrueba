package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.MapObjetFormularioEmpleado.*;
import static userinterfaces.MapObjetInicio.txtUsername;

public class PagObjetFormularioEmpleado implements Task {

    private static String nickName;
    private static String OtherId;
    private static String driverLicense;
    private static String licenseExpiry;
    private static String ssnNumber;
    private static String sinNumber;
    private static String dateBirth;
    private static String militaryService;

    public PagObjetFormularioEmpleado(String nickName,String OtherId,String driverLicense,String licenseExpiry,
                                      String ssnNumber,String sinNumber,String dateBirth, String militaryService) {

        this.nickName=nickName;
        this.OtherId=OtherId;
        this.driverLicense=driverLicense;
        this.licenseExpiry=licenseExpiry;
        this.ssnNumber=ssnNumber;
        this.sinNumber=sinNumber;
        this.dateBirth=dateBirth;
        this.militaryService=militaryService;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                TiempoEspera.unMomento(4),
                Enter.theValue(nickName).into(txtNickName),
                Enter.theValue(OtherId).into(txtOtherId),
                TiempoEspera.unMomento(4),
                Enter.theValue(driverLicense).into(txtDriverLicense),
                Enter.theValue(licenseExpiry).into(txtlicenseExpiry),
                (Scroll.to(txtSsnNumber)),
                Enter.theValue(ssnNumber).into(txtSsnNumber),
                TiempoEspera.unMomento(4),
                Enter.theValue(sinNumber).into(txtSinNumber),
                (Scroll.to(txtDateBirth)),
                Enter.theValue(dateBirth).into(txtDateBirth),
                Click.on(btnGender),
                Enter.theValue(militaryService).into(txtMilitaryService),
                TiempoEspera.unMomento(4),
                Click.on(btnSmoker),
                Click.on(btnSave),
                TiempoEspera.unMomento(6));

}

    public static PagObjetFormularioEmpleado botones (String nickName,String OtherId,String driverLicense,String licenseExpiry,
                                                      String ssnNumber,String sinNumber,String dateBirth, String militaryService) {
        return instrumented(PagObjetFormularioEmpleado.class,nickName,OtherId,driverLicense,licenseExpiry,ssnNumber,sinNumber,dateBirth,militaryService);


    }
}

