package Java.sheet03.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample{
    public static void main(String[] args) {
        Date fechaActual = new Date();

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato3 = new SimpleDateFormat("ww, MM, dd yyyy");

        String fechaFormato1 = formato1.format(fechaActual);
        String fechaFormato2 = formato2.format(fechaActual);
        String fechaFormato3 = formato3.format(fechaActual);

        System.out.println("Fecha actual: "+ fechaFormato1);
        System.out.println("Fecha actual: "+ fechaFormato2);
        System.out.println("Fecha actual: "+ fechaFormato3);
    }
}