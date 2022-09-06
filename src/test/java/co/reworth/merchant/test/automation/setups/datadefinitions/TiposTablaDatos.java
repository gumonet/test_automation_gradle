package co.reworth.merchant.test.automation.setups.datadefinitions;

import co.reworth.merchant.test.automation.models.DatosCuenta;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class TiposTablaDatos {

    @DataTableType
    public DatosCuenta datosCuentaEntry(Map<String, String> entry) {

        return new DatosCuenta(
                entry.get("correo"),
                entry.get("clave"));
    }

}
