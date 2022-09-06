package co.reworth.merchant.testautmerchant.test.automation.models.escena;

import net.serenitybdd.screenplay.actors.OnStage;

public class Usuario {

    private static Usuario usuario;

    private String nombre;

    private boolean tieneSesionActiva;

    private Libreto libreto;

    private static final String ANONIMO = "anonimo";

    private Usuario(String nombre)
    {
        this.nombre = nombre;
    }

    public static Usuario protagonista()
    {
        if(Usuario.usuario==null){
            Usuario.usuario = new Usuario(Usuario.ANONIMO);
        }
        return Usuario.usuario;
    }

    public static void sePreparaParaSiguienteEscena(){
        Usuario.usuario = null;
    }

    public static boolean estaEnEscena(String como)
    {
        boolean estaEnEscena;
        try{
            OnStage.theActorInTheSpotlight();
            estaEnEscena = true;
        }catch(NullPointerException npe){

            if  (   Usuario.protagonista().getNombre().equalsIgnoreCase(Usuario.ANONIMO)
                    &&  como!=null
                    && !como.trim().isEmpty()
            )
            {
                Usuario.protagonista().setNombre(como);
            }

            estaEnEscena = false;
        }
        return estaEnEscena;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libreto getLibreto()
    {
        if  (   this.libreto == null   )
        {
            this.libreto = new Libreto();
        }
        return libreto;
    }

    public boolean isTieneSesionActiva() {
        return tieneSesionActiva;
    }

    public void setTieneSesionActiva(boolean tieneSesionActiva) {
        this.tieneSesionActiva = tieneSesionActiva;
    }
}
