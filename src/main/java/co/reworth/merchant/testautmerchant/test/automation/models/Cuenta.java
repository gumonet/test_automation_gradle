package co.reworth.merchant.testautmerchant.test.automation.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Cuenta
{

    private String correo;
    private String clave;
    private boolean aceptoTerminos;
    private Boolean visor;

    private final static String ACUERDO = "ACUERDO";
    private final static String VISOR_ACTIVADO = "ACTIVADO";

    public static Cuenta crearCuenta(String correo, String clave, String terminos, String visor)
    {
        CuentaBuilder cuenta = Cuenta.builder()
                .correo(correo)
                .clave(clave)
                .aceptoTerminos(ACUERDO.equalsIgnoreCase(terminos));

        if  (   !visor.isEmpty()    )
        {
            cuenta.visor(VISOR_ACTIVADO.equalsIgnoreCase(visor));
        }

        return cuenta.build();
    }
}
