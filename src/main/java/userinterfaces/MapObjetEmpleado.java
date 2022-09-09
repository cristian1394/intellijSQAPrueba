package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")
public class MapObjetEmpleado extends PageObject {


    public static final Target txtfirstNamee =Target.the("texto").located(By.xpath("//*[@name='firstName']"));
    public static final Target txtMiddleName =Target.the("texto").located(By.xpath("//*[@name='middleName']"));
    public static final Target txtlastName =Target.the("texto").located(By.xpath("//*[@name='lastName']"));
    public static final Target txtId =Target.the("texto").located(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
    public static final Target btnSave =Target.the("boton").located(By.xpath("//*[@type='submit']"));

}
