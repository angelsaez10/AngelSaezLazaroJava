package EJERCICIOS;

import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {

        // Variables
        int numero;
        int factorial;  // Moveremos la inicialización de factorial dentro del do-while

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número:");
            numero = sc.nextInt();
            sc.nextLine();

            factorial = 1;

            if (numero >= 0) {
                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }

                System.out.println("El factorial de " + numero + " es: " + factorial);
            }

        } while (numero >= 0);
    }
}
