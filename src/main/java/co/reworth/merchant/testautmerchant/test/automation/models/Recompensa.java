package co.reworth.merchant.testautmerchant.test.automation.models;

import co.reworth.merchant.testautmerchant.test.automation.constants.enums.EtiquetadoComo;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Builder
@Data
public class Recompensa
{
    private String porcentaje;

    private boolean otroPorcentaje;

    private String tipo;

    public static Recompensa crearRecompensaBienvenida(String porcentaje)
    {
        return Recompensa.crearRecompensa(
                EtiquetadoComo.RECOMPENSA_BIENVENIDA.enPantalla(),
                porcentaje
        );
    }

    public static Recompensa crearRecompensaRecurrente(String porcentaje)
    {
        return Recompensa.crearRecompensa(
                EtiquetadoComo.RECOMPENSA_RECURRENTE.enPantalla(),
                porcentaje
        );
    }

    private static Recompensa crearRecompensa(String tipo, String porcentaje)
    {
        return Recompensa.builder()
                .tipo(tipo)
                .otroPorcentaje(StringUtils.containsIgnoreCase(EtiquetadoComo.OTRO_PORCENTAJE.enPantalla(),porcentaje))
                .porcentaje(porcentaje.replaceAll("[^0-9]",StringUtils.EMPTY)).build();
    }

}
