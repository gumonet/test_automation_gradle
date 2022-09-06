package co.reworth.merchant.testautmerchant.test.automation.models;

import co.reworth.merchant.testautmerchant.test.automation.constants.enums.EtiquetadoComo;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Negocio
{
    private String nombre;
    private String categoria;
    private String tipo;
    private String web;
    private String direccion;

    private static final String ECOMMERCE = EtiquetadoComo.ECOMMERCE.enPantalla();
    private static final String TIENDA_FISICA = EtiquetadoComo.TIENDA_FISICA.enPantalla();

    public static Negocio crearNegocio(String nombre, String categoria, String tipo, String web, String direccion)
    {
        return Negocio.builder()
                .nombre(nombre)
                .categoria(categoria)
                .tipo(tipo.equalsIgnoreCase(ECOMMERCE)?ECOMMERCE:TIENDA_FISICA)
                .web(web)
                .direccion(direccion)
                .build();
    }
}
