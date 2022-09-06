package co.reworth.merchant.testautmerchant.test.automation.models;

import co.reworth.merchant.testautmerchant.test.automation.constants.enums.EtiquetadoComo;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

@Builder
@Data
public class RecompensaBienvenida
{
    private String porcentaje;

    private boolean otroPorcentaje;

    private String tipo;

    public static RecompensaBienvenida crearRecompensaBienvenida(String porcentaje)
    {
        return RecompensaBienvenida.builder()
                .tipo(EtiquetadoComo.RECOMPENSA_BIENVENIDA.enPantalla())
                .otroPorcentaje(StringUtils.containsIgnoreCase(EtiquetadoComo.OTRO_PORCENTAJE.enPantalla(),porcentaje))
                .porcentaje(porcentaje.replaceAll("[^0-9]",StringUtils.EMPTY)).build();
    }

}
