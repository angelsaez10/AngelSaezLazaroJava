package EJERCICIOS;

import java.util.Scanner;

public class PedirTresNumerosOrdenar {
    public static void main(String[] args) {
        // Ejercicio 9: Pide 3 números por teclado y ordénalos de mayor a menor
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Dime un número:");
        num1 = sc.nextInt();

        System.out.println("Dime otro número:");
        num2 = sc.nextInt();

        System.out.println("Dime otro número más:");
        num3 = sc.nextInt();


        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales: " + num1 + ", " + num2 + ", " + num3);
        }

        else {
            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println("El orden es: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("El orden es: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println("El orden es: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("El orden es: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                if (num1 >= num2) {
                    System.out.println("El orden es: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("El orden es: " + num3 + ", " + num2 + ", " + num1);
                }
            }
        }
    }
}
