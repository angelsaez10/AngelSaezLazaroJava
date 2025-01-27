package ArraysBi;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int array[][];
        int sumaFila = 0, sumaColumna = 0;
        int fila, columna;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de filas que quiere que tenga el array:");
        fila = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el numero de columnas que quiere que tenga el array:");
        columna = sc.nextInt();
        sc.nextLine();

        array = new int[fila][columna];


        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int aleatorio = random.nextInt(101);
                array[i][j] = aleatorio;
            }
        }

        // Imprimir el array
        System.out.println("Array generado:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        // Sumar filas
        for (int i = 0; i < fila; i++) {
            sumaFila = 0;
            for (int j = 0; j < columna; j++) {
                sumaFila += array[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumaFila);
        }

        // Sumar columnas
        for (int i = 0; i < columna; i++) {
            sumaColumna = 0;
            for (int j = 0; j < fila; j++) {
                sumaColumna += array[j][i];
            }
            System.out.println("La suma de la columna " + (i + 1) + " es: " + sumaColumna);
        }
    }
}
