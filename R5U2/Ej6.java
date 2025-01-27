package R5U2;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int filas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de filas:");
        filas = sc.nextInt();

        for (int i = 0; i < filas; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
