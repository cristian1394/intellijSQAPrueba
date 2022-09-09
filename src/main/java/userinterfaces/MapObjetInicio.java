package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")

public class MapObjetInicio extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA


    public static final Target txtUsername =Target.the("BOTTON ADD").located(By.xpath("//*[@name='username']"));
    public static final Target txtPassword =Target.the("BOTTON FN").located(By.xpath("//*[@name='password']"));
    public static final Target btnLogin =Target.the("BOTTON LN").located(By.xpath("//*[@type='submit']"));
    public static final Target btnEmployee =Target.the("BOTTON Email").located(By.xpath("//a[contains(text(),'Add Employee')]"));

}