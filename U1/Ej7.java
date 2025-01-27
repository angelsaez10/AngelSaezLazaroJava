package U1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        String cadena ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        System.out.println("El primer caracter de la cadena es:'"+cadena.charAt(0)+"' y el ultimo es:'"+cadena.charAt(cadena.length()-1)+"'");
    }
}
