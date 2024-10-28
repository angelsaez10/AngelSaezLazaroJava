package EJERCICIOS;

import java.util.Scanner;

public class InvertirDigitosNumero {
    public static void main(String[] args) {
         //Variables
        String numero,reves;

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        numero = sc.nextLine();

        reves= new StringBuilder(numero).reverse().toString();
        System.out.println(reves);

    }
}
