package RE_ArraysUni;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int [] ordenado = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 numeros en orden creciente:");
        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Introduzca 5 numeros:");
        for (int i = 0; i < 5; i++) {
            array2[i] = sc.nextInt();
        }

        System.arraycopy(array1, 0, ordenado, 0, 5);
        System.arraycopy(array2, 0, ordenado, 5, 5);

        Arrays.sort(ordenado);

        System.out.println("Array ordenado:");
        for (int num : ordenado) {
            System.out.print(num + " ");
            }
    }
}
