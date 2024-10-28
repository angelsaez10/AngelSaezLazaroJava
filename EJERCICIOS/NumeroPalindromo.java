package EJERCICIOS;

import java.util.Scanner;

public class NumeroPalindromo {
    public static void main(String[] args) {

        //Variables
        String numero,numeroInvertido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        numero = sc.nextLine();

        numeroInvertido = new StringBuilder(numero).reverse().toString();

        if (numero.equals(numeroInvertido)){
            System.out.println("El numero es palindromo");

        }else {
            System.out.println("El numero no es palindromo");
        }
    }
}