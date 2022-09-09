package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php")
public class MapObjetInformacionEmpleado extends PageObject {


    public static final Target btnPim =Target.the("BOTTON alerts").located(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
    public static final Target txtEmployeeName =Target.the("BOTTON btnClic1").located(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
    public static final Target btnSearch =Target.the("BOTTON btnClic1").located(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]"));
    public static final Target btnID =Target.the("BOTTON btnClic1").located(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]"));
    public static final Target btnEliminar =Target.the("BOTTON btnClic1").located(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/button[1]/i[1]"));
    public static final Target btnEliminar2 =Target.the("BOTTON btnClic1").located(By.xpath("//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]"));







}
