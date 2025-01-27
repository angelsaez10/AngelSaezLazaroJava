package RE_ArraysUni;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int num1, num2, pos1, pos2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 8 números:");
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " - ");
        }

        System.out.println();
        System.out.println("Introduzca un nuevo número:");
        num1 = sc.nextInt();
        System.out.println("Introduzca la posición donde desea guardarlo (0-9):");
        pos1 = sc.nextInt();

        System.out.println("Introduzca otro número más:");
        num2 = sc.nextInt();
        System.out.println("Introduzca la posición donde desea guardarlo (0-9):");
        pos2 = sc.nextInt();

        if (pos1 < 0 || pos1 >= 10 || pos2 < 0 || pos2 >= 10) {
            System.out.println("Error: Las posiciones deben estar entre 0 y 9.");
            return;
        }

        for (int i = 8; i > pos1; i--) {
            array[i] = array[i - 1];
        }
        array[pos1] = num1;

        /*
        if (pos2 > pos1) {
            pos2++;
        }
         */

        for (int i = 9; i > pos2; i--) {
            array[i] = array[i - 1];
        }
        array[pos2] = num2;

        System.out.println("Array final:");
        for (int num : array) {
            System.out.print(num + " - ");
        }
    }
}
