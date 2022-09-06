package co.reworth.merchant.test.automation.models;


public class DatosCuenta {

    private String correo;

    private String clave;

    public DatosCuenta() {
    }

    public DatosCuenta(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
