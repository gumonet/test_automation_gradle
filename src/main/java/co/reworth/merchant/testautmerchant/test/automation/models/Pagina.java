package co.reworth.merchant.testautmerchant.test.automation.models;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Pagina {

    private String enlace;
    private String contenido;

    public static Pagina crearPagina(String enlace, String contenido)
    {
        return Pagina.builder()
                .enlace(enlace)
                .contenido(contenido)
                .build();
    }

}
