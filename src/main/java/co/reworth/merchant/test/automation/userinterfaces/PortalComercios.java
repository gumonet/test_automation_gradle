package co.reworth.merchant.test.automation.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PortalComercios extends PageObject {


    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Correo electronico").locatedBy("//input[@name='mail']");
    public static final Target CAMPO_CLAVE = Target.the("Contraseña").locatedBy("//input[@name='password']");
    public static final Target BOTON_INICIAR_SESION = Target.the("Iniciar sesion").locatedBy("//button[contains(text(),'Iniciar Sesi')]");

    public static final Target ALERTA_ERROR_DATOS_INCORRECTOS = Target.the("Alerta").locatedBy("//div[@role='alert']");
}
