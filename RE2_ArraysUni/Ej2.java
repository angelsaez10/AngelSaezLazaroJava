package RE2_ArraysUni;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int num, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca números (escriba 0 para salir):");

        while (true) {
            num = sc.nextInt();
            //Si es 0 sale del array y lo imprime
            if (num == 0) {
                System.out.println("Saliendo del programa...");
                System.out.println("Array resultante:");
                Arrays.sort(a1);
                //For each que imprime el array
                for (int n : a1) {
                    System.out.print(n + " ");
                }
                //Salimos del programa
                return;
            }
            //Si el array tiene menos de 10 numeros se añaden los numeros de manera normal
            if (cont < 10) {
                a1[cont] = num;
                cont++;
            //Si tiene mas de 10 numeros creamos una variable y recorremos el array buscando el numero mas grande
            } else {
                int maxIndex = 0;
                for (int i = 1; i < 10; i++) {
                    if (a1[i] > a1[maxIndex]) {
                        maxIndex = i;
                    }
                }
            //Desde el indice del numero mas grande,desplazamos todos los numeros un lugar a la izquierda
                for (int i = maxIndex; i < 9; i++) {
                    a1[i] = a1[i + 1];
                }
            //Metemos el numero en la ultima posocion del array
                a1[9] = num;
            }
        }
    }
}
