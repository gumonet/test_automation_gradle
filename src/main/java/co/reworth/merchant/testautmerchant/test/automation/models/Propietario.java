package co.reworth.merchant.testautmerchant.test.automation.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Propietario
{
    private String nombre;
    private String celular;

    public static Propietario crearPropietario(String nombre, String celular)
    {
        return Propietario.builder()
                .nombre(nombre)
                .celular(celular).build();
    }
}
