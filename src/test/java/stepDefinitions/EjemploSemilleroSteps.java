package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.*;
import userinterfaces.MapObjetInicio;

public class EjemploSemilleroSteps
{
    @Managed(driver="chrome")
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    private MapObjetInicio homePage=new MapObjetInicio();


    public EjemploSemilleroSteps() {
    }


    @Dado("que un empleado accede a la web")
    public void queunempleadoaccedealaweb(){
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));


        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) homePage));



    }

    @Cuando("^el agrega (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) al formulario$")
    public void seHaceRegistroFormulario( String userName,String password, String firstName,String middleName,String lastName,String id,
                                             String nickName,String OtherId,String driverLicense,
                                             String licenseExpiry,String ssnNumber,String sinNumber,String dateBirth,
                                             String militaryService,String EmployeeName) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                PagObjetInicio.conDescripcion(userName,password),
        PagObjetEmpleado.cantidad(firstName,middleName,lastName,id),
        PagObjetFormularioEmpleado.botones(nickName,OtherId,driverLicense,licenseExpiry,ssnNumber,sinNumber,dateBirth,militaryService),
                PagObjetInformacionEmpleado.informacion(EmployeeName),
                PagObjetCerrarSesion.login());

    }

    @Entonces("El Se Registra")
    public  void elseRegistra() {


    }

    @Cuando("El Se Registra1")
    public void seHaceRegistroFormulario123456(String userName,String password, String firstName,String middleName,String lastName,String id,
                                                  String nickName,String OtherId,String driverLicense,
                                                  String licenseExpiry,String ssnNumber,String sinNumber,String dateBirth,
                                                  String militaryService,String EmployeeName){
        actor.wasAbleTo(
                PagObjetInicio.conDescripcion(userName,password),
                PagObjetEmpleado.cantidad(firstName,middleName,lastName,id),
                PagObjetFormularioEmpleado.botones(nickName,OtherId,driverLicense,licenseExpiry,ssnNumber,sinNumber,dateBirth,militaryService),
                PagObjetInformacionEmpleado.informacion(EmployeeName),
                PagObjetCerrarSesion.login());

    }

}