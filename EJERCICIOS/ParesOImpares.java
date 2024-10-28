package EJERCICIOS;

import java.util.Scanner;

public class ParesOImpares {
    public static void main(String[] args) {
        //Ejercicio 8:Pide 2 numeros por teclado y di si son pares o impares
        Scanner sc=new Scanner(System.in);

        System.out.println("Dame un numero entero:");
        int num1= sc.nextInt();
        sc.nextLine();

        System.out.println("Dame otro numero entero");
        int num2= sc.nextInt();
        sc.nextLine();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos números son pares");

        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Ambos números son impares");

        } else if (num1 % 2 == 0 && num2 % 2 != 0) {
            System.out.println("El número 1 es par y el número 2 es impar");

        } else {
            System.out.println("El número 1 es impar y el número 2 es par");
        }
    }
}
