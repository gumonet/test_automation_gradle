package co.reworth.merchant.testautmerchant.test.automation.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Calendar;

public class Detener
{
    private long tiempo;

    private static final long A_SEGUNDOS= 1000;
    private static final long A_MINUTOS= A_SEGUNDOS*60;
    private static final long A_MILISEGUNDOS= 1;

    private Detener(long tiempo)
    {
        this.tiempo = tiempo;
    }

    private class DetenerPor implements Task
    {
        private long milisegundos;

        private DetenerPor(long milisegundos){
            this.milisegundos = milisegundos;
        }

        @Override
        public <T extends Actor> void performAs(T actor)
        {
            try {
                Thread.sleep(this.milisegundos);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Detener por(long tiempo)
    {
        return new Detener(tiempo);
    }

    public DetenerPor segundos()
    {
        this.tiempo = this.tiempo * Detener.A_SEGUNDOS;
        return new DetenerPor(this.tiempo);
    }

    public DetenerPor minutos()
    {
        this.tiempo = this.tiempo * Detener.A_MINUTOS;
        return new DetenerPor(this.tiempo);
    }

    public DetenerPor milisegundos()
    {
        this.tiempo = this.tiempo * Detener.A_MILISEGUNDOS;
        return new DetenerPor(this.tiempo);
    }

}
