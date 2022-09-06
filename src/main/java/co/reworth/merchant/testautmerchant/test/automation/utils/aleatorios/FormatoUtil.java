package co.reworth.merchant.testautmerchant.test.automation.utils.aleatorios;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatoUtil
{
    private FormatoUtil(){
        throw new UnsupportedOperationException();
    }

    public static String validar(String texto)
    {
        texto = FormatoUtil.reemplazarPorNumeroAleatorio(texto);
        texto = FormatoUtil.reemplazarPorFecha(texto);
        return texto;
    }

    private static String reemplazarPorNumeroAleatorio(String texto)
    {
        Matcher matcher;
        String patron = "\\{(#+)\\}";

        if  (   (matcher = Pattern.compile(patron).matcher(texto)).find() )
        {
            StringBuffer resultado = new StringBuffer();
            int min = 0;
            int max = 0;

            do {
                max = NumberUtils.toInt(matcher.group(1).replace("#","9"));
                int numero = RandomUtils.nextInt(min,max);

                matcher.appendReplacement(resultado,String.valueOf(numero));
            }while  (   matcher.find()  );
            matcher.appendTail(resultado);

            return resultado.toString();
        }else{
            return texto;
        }
    }

    private static String reemplazarPorFecha(String texto)
    {
        Matcher matcher;
        String patron = "\\{((d|M|y|H|h|m|s)+)\\}";

        if  (   (matcher = Pattern.compile(patron).matcher(texto)).find() )
        {
            StringBuffer resultado = new StringBuffer();

            Calendar fecha = Calendar.getInstance();
            String diaFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)),2,"0");
            String mesFecha = StringUtils.leftPad(String.valueOf((fecha.get(Calendar.MONTH)+1)),2,"0");
            String anyoFecha = String.valueOf(fecha.get(Calendar.YEAR));
            String hora12Fecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.HOUR)),2,"0");
            String hora24Fecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.HOUR_OF_DAY)),2,"0");
            String minutoFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.MINUTE)),2,"0");
            String segundoFecha = StringUtils.leftPad(String.valueOf(fecha.get(Calendar.SECOND)),2,"0");

            do{
                texto = FormatoUtil.reemplazarPorItemFecha(matcher.group(1),"d",2d,diaFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"M",2d,mesFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"y",4d,anyoFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"H",2d,hora24Fecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"h",2d,hora12Fecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"m",2d,minutoFecha);
                texto = FormatoUtil.reemplazarPorItemFecha(texto,"s",2d,segundoFecha);

                matcher.appendReplacement(resultado,texto);
            }while  ( matcher.find()  );
            matcher.appendTail(resultado);

            return resultado.toString();
        }else{
            return texto;
        }
    }

    private static String reemplazarPorItemFecha(String texto, String id, double digitos, String valorItemFecha)
    {
        StringBuffer resultado = new StringBuffer();
        Matcher matcher = Pattern.compile("("+id+"+)").matcher(texto);
        while  (   matcher.find()  )
        {
            //double totalId = StringUtils.countMatches(matcher.group(),id);
            int totalId = StringUtils.countMatches(matcher.group(),id);
            //int paresId = (int)Math.ceil(totalId/digitos);
            //String reemplazar = StringUtils.truncate(StringUtils.repeat(valorItemFecha,paresId),(int)totalId);
            String reemplazar = StringUtils.truncate(StringUtils.leftPad(valorItemFecha,totalId,"0"),totalId);

            matcher.appendReplacement(resultado,reemplazar);

        }
        matcher.appendTail(resultado);

        return resultado.toString();
    }

    /*
    public static void main(String args[]){
        String var = "Información incorrectaVerifica tu correo electrónico y contraseña e intenta de nuevo";
        //String valor = "yesenia.v+{ddddMMdyyyy}@reworth{HHmmsshh}.co";
        //String valor = "2023";

        //System.out.println(StringUtils.truncate(valor,100));

        //System.out.println("R/ "+reemplazarPorFecha(valor));
        System.out.println(var.contains("Verifica tu correo electrónico y contraseña e intenta de nuevo"));
    }

     */


}
