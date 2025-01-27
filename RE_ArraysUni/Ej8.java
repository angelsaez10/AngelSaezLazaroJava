package RE_ArraysUni;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayOrdenado = new int[10];
        int contador = 0,impares=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 números:");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " - ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]+" - ");
                contador++;
            }
        }
        System.out.println("Hay un total de "+contador+" pares.");

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]+" - ");
                contador++;
                impares++;
            }
        }

        System.out.println("Hay un total de "+impares+" impares.");
    }
}
