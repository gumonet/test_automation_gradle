package co.reworth.merchant.testautmerchant.test.automation.utils.gherkin.tabla.utils;

import co.reworth.merchant.testautmerchant.test.automation.utils.aleatorios.FormatoUtil;
import co.reworth.merchant.testautmerchant.test.automation.utils.gherkin.tabla.interfaces.ITablaGherkin;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;


public class TablaGherkinUtil
{
    private Map<String, String> tblGherkin;

    private TablaGherkinUtil(Map<String, String> tblGherkin)
    {
        this.tblGherkin = tblGherkin;
    }

    public static TablaGherkinUtil deLaTabla(Map<String, String> tblGherkin){
        return new TablaGherkinUtil(tblGherkin);
    }

    public String obtener(ITablaGherkin columnaTablaGherkin)
    {
        return FormatoUtil.validar(StringUtils.trimToEmpty(this.tblGherkin.get(columnaTablaGherkin.getColumna())));
    }
}
