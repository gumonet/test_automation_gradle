package co.reworth.merchant.testautmerchant.test.automation.constants.enums;


import co.reworth.merchant.testautmerchant.test.automation.userinterfaces.procesos.inicio.PortalUI;

public enum EtiquetadoComo
{
    //Portal
    REGISTRARSE(PortalUI.BTN_REGISTRARSE.getName()),

    //Registro/DatosNegocio
    TIENDA_FISICA("Tienda"),
    ECOMMERCE("Ecommerce"),

    //Registro/Recompensas
    RECOMPENSA_BIENVENIDA("Bienvenida"),
    RECOMPENSA_RECURRENTE("Recurrente"),
    OTRO_PORCENTAJE("Otro"),

    //Submit
    CONTINUAR("Continuar"),
    ;

    private final String etiqueta;

    private EtiquetadoComo(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public String enPantalla()
    {
        return this.etiqueta;
    }
}
