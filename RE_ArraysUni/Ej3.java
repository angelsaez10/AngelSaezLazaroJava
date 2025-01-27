package RE_ArraysUni;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        int numero;
        int nTotales = 0;
        int contador = 0;
        int ultimo =9;
        Scanner sc = new Scanner(System.in);

        while (nTotales < 10) {
            System.out.println("Introduzca un numero:");
            numero = sc.nextInt();
            arrayInt[contador] = numero;
            nTotales++;
            contador++;
        }

        System.out.println("");

        for (int i = 0; i < nTotales/2 ; i++) {
            System.out.print(arrayInt[i]+" - ");
            System.out.print(arrayInt[ultimo]+" - ");
            ultimo--;
        }

    }
}
