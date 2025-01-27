package RE_ArraysUni;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayOrdenado = new int[10];
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 números:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " - ");
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                arrayOrdenado[contador] = array[i];
                contador++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                arrayOrdenado[contador] = array[i];
                contador++;
            }
        }

        System.out.println();
        System.out.println("Array final:");
        for (int num : arrayOrdenado) {
            System.out.print(num + " - ");
        }
    }
}
