package NOV18TO22;

import java.util.Scanner;

public class Dieciocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, mayuscula, caracter;

        do {
            System.out.println("Introduzca un nombre:");
            nombre = sc.nextLine();

            mayuscula = nombre.toUpperCase();

            if (!nombre.isEmpty() && nombre.length() < 11) {
                System.out.print("");
            } else System.err.println("El nombre no cumple con los requisitos de longitud.");

            if (nombre.charAt(0) == mayuscula.charAt(0)) {
                System.out.print("");
            } else System.err.println("El nombre debe empezar por letra mayuscula.");

            if (nombre.substring(1).equals(nombre.substring(1).toLowerCase())) {
                System.out.print("");
            } else System.err.println("Despues de la primera mayuscula todas las letras deben ser minusculas");

        } while (
                (nombre.length() > 10) ||
                        (nombre.charAt(0) != mayuscula.charAt(0)) ||
                            !(nombre.substring(1).toLowerCase().equals(nombre.substring(1))));

    }
}
