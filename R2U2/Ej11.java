package R2U2;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        double euros,conversion=0;
        final double libras = 1.11 , dolares = 2.22 , yenes = 3.33 , bolivares = 4.44;
        String moneda ;
        Scanner sc = new Scanner( System.in);

        System.out.println("Introduzca la moneda a la que quiere realizar el cambio:");
        moneda = sc.nextLine();

        System.out.println("Introduzca la cantidad de euros que desea convertir:");
        euros = sc.nextDouble();
        
        switch (moneda ){
            case "libras":
                conversion = euros * libras;
                break;

            case "dolares":
                conversion = euros * dolares;
                break;

            case "yenes":
                conversion = euros * yenes;
                break;

            case "bolivares":
            conversion = euros * bolivares;
            break;

            case "euros":
                conversion = euros;
                break;

            default:
                System.out.println("La moneda introducida no se encuentra en el sistema de conversion:");
                System.exit(0);
        }

        System.out.println("El resultado de la conversion de "+euros+" euros a "+moneda+" da un total de "+conversion+" "+ moneda);

    }
}
