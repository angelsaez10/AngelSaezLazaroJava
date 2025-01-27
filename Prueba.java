import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        LocalDate lD = LocalDate.now();
        String fecha = "2000-10-12";
        LocalDate parse = LocalDate.parse(fecha);
        LocalDate ns = LocalDate.from(lD);
        System.out.println(ns +" ns");
        System.out.println(parse);
        System.out.println(lD);

        System.out.println("Han pasado:"+Math.abs(ChronoUnit.YEARS.between(lD,parse))+" años");
        LocalDate lskdlasd ;
    }
}
