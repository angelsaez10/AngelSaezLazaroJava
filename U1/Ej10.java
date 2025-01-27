package U1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        System.out.println("Cadena recortada:"+cadena.substring(5));
    }
}
