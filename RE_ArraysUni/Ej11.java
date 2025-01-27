package RE_ArraysUni;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 números (sin repetir):");

        for (int i = 0; i < 10; i++) {
            boolean repetido;

            do {
                repetido = false;
                System.out.print("Número " + (i + 1) + ": ");
                array[i] = sc.nextInt();

                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        repetido = true;
                        System.out.println("Error: El número ya fue ingresado. Introduzca otro.");
                        break;
                    }
                }
            } while (repetido);
        }

        System.out.println("Números válidos:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
