package NOV11TO15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fechas {
    public static void main(String[] args) {
        //Imprime la fecha actual "now"
        LocalDate ahora = LocalDate.now();
        System.out.println(ahora);

        //Imprime una fecha que le introduzcas tu "of"
        LocalDate fecha = LocalDate.of(2024,11,15);
        System.out.println(fecha);

        //".minus"medida"()" para restar fecha -- ".plus"medida"()" para sumar fecha
        System.out.println("La fecha de hoy es:"+fecha+", y la de hace 6 meses es:"+fecha.minusMonths(6));
        System.out.println("La fecha de hoy es:"+fecha+", y la de dentro de 6 meses es:"+fecha.plusMonths(6));

        //Pasa a formato fecha una cadena de texto "parse"
        LocalDate texto = LocalDate.parse("2004-07-25");
        System.out.println(texto);

        //Imprime la hora actual "now"
        LocalTime now= LocalTime.now();
        System.out.println(now);

        //Imprime una hora que le introduzcas tu "of"
        LocalTime hora= LocalTime.of(20, 30, 45);
        System.out.println(hora);

        //".minus"medida"()" para restar tiempo -- ".plus"medida"()" para sumar tiempo
        System.out.println("La hora de hoy es:"+hora+", y la hora hace 2 horas era:"+hora.minusHours(3));
        System.out.println("La hora de hoy es:"+hora+", y la hora dentro de 2 horas sera:"+hora.plusHours(3));

        //Pasa a formato hora una cadena de texto "parse"
        LocalTime text= LocalTime.parse("16:28:30");
        System.out.println(text);


        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        LocalDateTime fechaHoraOF = LocalDateTime.of(2024,11,15,16,33,55);
        System.out.println(fechaHoraOF);

        LocalDateTime fechaHoraParse = LocalDateTime.parse("2004-07-25T04:30:55");
        System.out.println(fechaHoraParse);

    }
}
