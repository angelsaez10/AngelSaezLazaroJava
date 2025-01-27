package RE_ArraysUni;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean creciente = true;
        boolean decreciente = true;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca un número:");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                decreciente = false;
            } else if (array[i] > array[i + 1]) {
                creciente = false;
            }
        }

        if (creciente) {
            System.out.println("Creciente.");
        } else if (decreciente) {
            System.out.println("Decreciente.");
        } else {
            System.out.println("Desordenado.");
        }
    }
}
