package U1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        System.out.println("Cadena en mayusculas:");
        System.out.println(cadena.toUpperCase());

        System.out.println("Cadena en minusculas:");
        System.out.println(cadena.toLowerCase());

    }
}
