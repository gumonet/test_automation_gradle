package co.reworth.merchant.testautmerchant.test.automation.constants.enums;

import co.reworth.merchant.testautmerchant.test.automation.utils.gherkin.tabla.interfaces.ITablaGherkin;

public class TablasGherkin
{
    private TablasGherkin()
    {
        throw new UnsupportedOperationException();
    }

    public enum Cuenta implements ITablaGherkin
    {
        CORREO("correo_cuenta"),
        CLAVE("clave_cuenta"),
        VISOR("visor_cuenta"),
        TERMINOS("terminos_cuenta"),
        ;

        private final String columna;

        private Cuenta(String columna)
        {
            this.columna = columna;
        }

        @Override
        public String getColumna() {
            return columna;
        }
    }

    public enum Propietario implements ITablaGherkin
    {
        NOMBRE("nombre_propietario"),
        CELULAR("celular_propietario"),
        ;

        private final String columna;

        private Propietario(String columna)
        {
            this.columna = columna;
        }

        @Override
        public String getColumna() {
            return columna;
        }
    }

    public enum Negocio implements ITablaGherkin
    {
        NOMBRE("nombre_negocio"),
        CATEGORIA("categoria_negocio"),
        TIPO("tipo_negocio"),
        WEB("web_negocio"),
        DIRECCION("direccion_negocio"),
        ;

        private final String columna;

        private Negocio(String columna)
        {
            this.columna = columna;
        }

        @Override
        public String getColumna() {
            return columna;
        }
    }

    public enum Recompensas implements ITablaGherkin
    {
        PORCENTAJE_RECOMPENSA_BIENVENIDA("recompensa_bienvenida"),
        PORCENTAJE_RECOMPENSA_RECURRENTE("recompensa_recurrente"),
        ;

        private final String columna;

        private Recompensas(String columna)
        {
            this.columna = columna;
        }

        @Override
        public String getColumna() {
            return columna;
        }
    }

    public enum Pagina implements ITablaGherkin
    {
        ENLACE("enlace_pagina"),
        CONTENIDO("contenido_pagina")
        ;

        private final String columna;

        private Pagina(String columna)
        {
            this.columna = columna;
        }

        @Override
        public String getColumna() {
            return columna;
        }
    }

}
