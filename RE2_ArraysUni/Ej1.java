package RE2_ArraysUni;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int [] a1 = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca diez numeros:");
        for(int i = 0; i < 10 ; i++){
            a1[i] = sc.nextInt();
        }

        Arrays.sort(a1);

        System.out.println("Array ordenado:");
        for (int num : a1){
            System.out.println(num + " ");
        }
    }
}
