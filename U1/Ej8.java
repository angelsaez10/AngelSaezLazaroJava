package U1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        System.out.println("La longitud de la cadena es:"+cadena.length());

    }
}
