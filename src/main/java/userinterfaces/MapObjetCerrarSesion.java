package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")
public class MapObjetCerrarSesion extends PageObject {


    public static final Target btnPaul =Target.the("BOTTON alerts").located(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]"));
    public static final Target btnLogout =Target.the("BOTTON btnClic1").located(By.xpath("//a[contains(text(),'Logout')]"));








}
