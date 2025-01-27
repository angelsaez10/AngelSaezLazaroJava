package RE_CadenaCaracteres;

import java.util.Locale;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        String cadena;
        String preferencia;
        boolean correcto = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto:");
        cadena = sc.nextLine();

        while ( !correcto) {
            System.out.println("¿Desea comvertirla a mayusculas o a minusculas?");
            preferencia = sc.nextLine();

            if (preferencia.equalsIgnoreCase("mayusculas")) {
                cadena = cadena.toUpperCase();
                System.out.println(cadena);
                correcto = true;
            } else if (preferencia.equalsIgnoreCase("minusculas")) {
                cadena = cadena.toLowerCase();
                System.out.println(cadena);
                correcto = true;
            } else
                System.err.println("La respuesta introducida es incorrecta.Por favor responda mayusculas o minusculas");
        }
    }
}
