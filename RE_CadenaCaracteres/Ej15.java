package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        String cadena,reverse;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        reverse = new StringBuilder(cadena).reverse().toString();
        System.out.println("La cadena dada la vuelta seria: "+reverse);

    }
}
