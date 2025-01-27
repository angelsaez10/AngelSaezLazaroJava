package RE_ArraysUni;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int [] a1 = new int[10];
        int [] a2 = new int[10];
        int [] a3 = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros(orden creciente):");
        for (int i = 0; i < 10 ; i++) {
            a1[i]= sc.nextInt();
        }

        System.out.println("Introduzca otros 10 numeros(orden creciente):");
        for (int i = 0; i < 10 ; i++) {
            a2[i]= sc.nextInt();
        }

        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);

        Arrays.sort(a3);

        System.out.println("Array fisionado de manera creciente");
        for (int num : a3){
            System.out.println(num + " ");
        }

    }
}
