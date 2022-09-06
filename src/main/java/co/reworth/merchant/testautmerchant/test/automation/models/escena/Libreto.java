package co.reworth.merchant.testautmerchant.test.automation.models.escena;

import co.reworth.merchant.testautmerchant.test.automation.models.*;
import lombok.Data;

import java.util.List;

@Data
public class Libreto {

    private Cuenta datosCuenta;
    private Propietario datosPropietario;
    private Negocio datosNegocio;
    private List<Recompensa> datosRecompensas;

    private Pagina datosPagina;
}

