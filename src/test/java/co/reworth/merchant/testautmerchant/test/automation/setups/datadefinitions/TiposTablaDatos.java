package co.reworth.merchant.testautmerchant.test.automation.setups.datadefinitions;

import co.reworth.merchant.testautmerchant.test.automation.constants.enums.TablasGherkin;
import co.reworth.merchant.testautmerchant.test.automation.models.*;
import co.reworth.merchant.testautmerchant.test.automation.models.escena.Usuario;
import co.reworth.merchant.testautmerchant.test.automation.utils.gherkin.tabla.utils.TablaGherkinUtil;
import io.cucumber.java.DataTableType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TiposTablaDatos {

    @DataTableType
    public Cuenta datosCuenta(Map<String, String> tblGherkin)
    {
        TablaGherkinUtil deLaTablaGherkin = TablaGherkinUtil.deLaTabla(tblGherkin);
        Cuenta cuenta = Cuenta.crearCuenta(
                deLaTablaGherkin.obtener(TablasGherkin.Cuenta.CORREO),
                deLaTablaGherkin.obtener(TablasGherkin.Cuenta.CLAVE),
                deLaTablaGherkin.obtener(TablasGherkin.Cuenta.TERMINOS),
                deLaTablaGherkin.obtener(TablasGherkin.Cuenta.VISOR)
        );

        Usuario.protagonista().getLibreto().setDatosCuenta(cuenta);

        return cuenta;
    }

    @DataTableType
    public Propietario datosPropietario(Map<String, String> tblGherkin)
    {
        TablaGherkinUtil deLaTablaGherkin = TablaGherkinUtil.deLaTabla(tblGherkin);
        Propietario propietario = Propietario.crearPropietario(
                deLaTablaGherkin.obtener(TablasGherkin.Propietario.NOMBRE),
                deLaTablaGherkin.obtener(TablasGherkin.Propietario.CELULAR)
        );

        this.datosCuenta(tblGherkin);

        Usuario.protagonista().getLibreto().setDatosPropietario(propietario);

        return propietario;
    }

    @DataTableType
    public Negocio datosNegocio(Map<String, String> tblGherkin)
    {
        TablaGherkinUtil deLaTablaGherkin = TablaGherkinUtil.deLaTabla(tblGherkin);
        Negocio negocio = Negocio.crearNegocio(
                deLaTablaGherkin.obtener(TablasGherkin.Negocio.NOMBRE),
                deLaTablaGherkin.obtener(TablasGherkin.Negocio.CATEGORIA),
                deLaTablaGherkin.obtener(TablasGherkin.Negocio.TIPO),
                deLaTablaGherkin.obtener(TablasGherkin.Negocio.WEB),
                deLaTablaGherkin.obtener(TablasGherkin.Negocio.DIRECCION)
        );

        this.datosPropietario(tblGherkin);

        Usuario.protagonista().getLibreto().setDatosNegocio(negocio);

        return negocio;
    }

    @DataTableType
    public List<Recompensa> datosRecompensa(Map<String, String> tblGherkin)
    {
        List<Recompensa> lstRecompensas = new ArrayList<>();
        TablaGherkinUtil deLaTablaGherkin = TablaGherkinUtil.deLaTabla(tblGherkin);
        Recompensa recompensaBienvenida = Recompensa.crearRecompensaBienvenida(
                deLaTablaGherkin.obtener(TablasGherkin.Recompensas.PORCENTAJE_RECOMPENSA_BIENVENIDA)
        );
        lstRecompensas.add(recompensaBienvenida);

        Recompensa recompensaRecurrente = Recompensa.crearRecompensaRecurrente(
                deLaTablaGherkin.obtener(TablasGherkin.Recompensas.PORCENTAJE_RECOMPENSA_RECURRENTE)
        );
        lstRecompensas.add(recompensaRecurrente);

        this.datosNegocio(tblGherkin);

        Usuario.protagonista().getLibreto().setDatosRecompensas(lstRecompensas);

        return lstRecompensas;
    }

    @DataTableType
    public Pagina datosPagina(Map<String, String> tblGherkin)
    {
        TablaGherkinUtil deLaTablaGherkin = TablaGherkinUtil.deLaTabla(tblGherkin);
        Pagina pagina = Pagina.crearPagina(
                deLaTablaGherkin.obtener(TablasGherkin.Pagina.ENLACE),
                deLaTablaGherkin.obtener(TablasGherkin.Pagina.CONTENIDO)
        );

        Usuario.protagonista().getLibreto().setDatosPagina(pagina);

        return pagina;
    }
}
