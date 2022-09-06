package co.reworth.merchant.testautmerchant.test.automation.interactions;


import co.reworth.merchant.testautmerchant.test.automation.utils.questions.estadoelementos.constants.enums.EstadoElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esperar
{
    private Target[] elementos;

    private long tiempo;

    private static final long A_SEGUNDOS= 1000;
    private static final long A_MINUTOS= A_SEGUNDOS*60;
    private static final long A_MILISEGUNDOS= 1;

    private Esperar(Target[] elementos)
    {
        this.elementos = elementos;
    }

    public static Esperar hastaQue(Target ... elementos)
    {
        return new Esperar(elementos);
    }

    public _$EsperarHastaQue este(EstadoElemento... estados)
    {
        return new _$EsperarHastaQue(this.elementos, estados);
    }

    public class _$EsperarHastaQue
    {
        private Target[] elementos;

        private EstadoElemento[] estados;

        private _$EsperarHastaQue(Target[] elementos, EstadoElemento[] estados)
        {
            this.elementos = elementos;
            this.estados = estados;
        }

        public _$EsperarHastaQueSea porNoMasDe(long tiempo)
        {
            return new _$EsperarHastaQueSea(this.elementos, this.estados, tiempo);
        }

        public class _$EsperarHastaQueSea
        {
            private Target[] elementos;
            private EstadoElemento[] estados;
            private long tiempo;

            private _$EsperarHastaQueSea(Target[] elementos, EstadoElemento[] estados, long tiempo)
            {
                this.elementos = elementos;
                this.estados = estados;
                this.tiempo = tiempo;
            }

            public EsperarPor segundos()
            {
                this.tiempo = this.tiempo * Esperar.A_SEGUNDOS;
                return EsperarPor.situacion(this.elementos, this.estados, this.tiempo);
            }

            public EsperarPor minutos()
            {
                this.tiempo = this.tiempo * Esperar.A_MINUTOS;
                return EsperarPor.situacion(this.elementos, this.estados, this.tiempo);
            }

            public EsperarPor milisegundos()
            {
                this.tiempo = this.tiempo * Esperar.A_MILISEGUNDOS;
                return EsperarPor.situacion(this.elementos, this.estados, this.tiempo);
            }
        }
    }
}

class EsperarPor extends Thread implements Task
{
    private Target[] elementos;
    private EstadoElemento[] estados;
    private long milisegundos;
    private boolean detener;

    public EsperarPor(Target[] elementos, EstadoElemento[] estados, long milisegundos)
    {
        this.elementos = elementos;
        this.estados = estados;
        this.milisegundos = milisegundos;
    }

    @Override
    public void run()
    {
        this.detener = false;
        //System.err.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
        try {
            Thread.sleep(this.milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //System.err.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
        this.detener = true;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        Target elemento;
        List<Target> lstElementos = Arrays.asList(this.elementos);
        List<Target> lstElementosFinal = new ArrayList<>(lstElementos);

        this.start();

        while ( !lstElementosFinal.isEmpty() && !this.detener)
        {
            //System.err.println(Arrays.toString(lstElementosFinal.toArray()));
            elemento = lstElementosFinal.get(0);
            boolean cumple = true;
            for (   EstadoElemento estado : this.estados   )
            {
                if  (   !estado.esCuando(actor,elemento) )
                {
                    cumple = false;
                    break;
                }
            }
            lstElementosFinal.remove(elemento);
            if(!cumple){
                lstElementosFinal.add(elemento);
            }
        }
    }

    public static EsperarPor situacion(Target[] elementos, EstadoElemento[] estados, long milisegundos){
        return Tasks.instrumented(EsperarPor.class,elementos, estados, milisegundos);
    }
}


