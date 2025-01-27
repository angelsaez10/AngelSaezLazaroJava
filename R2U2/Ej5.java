package R2U2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int dias,mes;

        Scanner sc = new Scanner( System.in);
        System.out.println("Introduce el dia de tu cumpleaños:");
        dias = sc.nextInt();

        System.out.println("Introduce el mes de tu cumpleaños:");
        mes = sc.nextInt();

        if (mes<1||mes>12){
            System.out.println("Mes no valido, por favor introduzca un mes entre entre 1 y 12");

        } else if (dias<1||dias>31) {
            System.out.println("Dia no valido, por favor introduzca un dia entre 1 y 31");

        } else {
            if ((dias >= 22 && mes == 12) || (dias <= 19 && mes == 1)) {
                System.out.println("Capricornio");

            } else if ((dias >= 20 && mes == 1) || (dias <= 18 && mes == 2)) {
                System.out.println("Acuario");

            } else if ((dias >= 19 && mes == 2) || (dias <= 20 && mes == 3)) {
                System.out.println("Piscis");

            } else if ((dias >= 21 && mes == 3) || (dias <= 19 && mes == 4)) {
                System.out.println("Aries");

            } else if ((dias >= 20 && mes == 4) || (dias <= 20 && mes == 5)) {
                System.out.println("Tauro");

            } else if ((dias >= 21 && mes == 5) || (dias <= 20 && mes == 6)) {
                System.out.println("Geminis");

            } else if ((dias >= 21 && mes == 6) || (dias <= 22 && mes == 7)) {
                System.out.println("Cancer");

            } else if ((dias >= 23 && mes == 7) || (dias <= 22 && mes == 8)) {
                System.out.println("Leo");

            } else if ((dias >= 23 && mes == 8) || (dias <= 22 && mes == 9)) {
                System.out.println("Virgo");

            } else if ((dias >= 23 && mes == 9) || (dias <= 22 && mes == 10)) {
                System.out.println("Libra");

            } else if ((dias >= 23 && mes == 10) || (dias <= 21 && mes == 11)) {
                System.out.println("Escorpio");

            } else if ((dias >= 22 && mes == 11) || (dias <= 21 && mes == 12)) {
                System.out.println("Sagitario");
            }
        }
    }
}
