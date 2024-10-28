package EJERCICIOS;

import java.util.Scanner;

public class PiramideDeAsteriscos {
    public static void main(String[] args) {

        // Variables
        int filas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de filas:");
        filas = sc.nextInt();

        for (int planta = 1; planta <= filas; planta++) {

            // Espacios antes de los asteriscos
            for (int e = 1; e <= filas - planta; e++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int a = 1; a <= (2 * planta) - 1; a++) {
                System.out.print("*");
            }

            // Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
    }
}
