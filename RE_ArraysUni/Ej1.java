package RE_ArraysUni;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int [] array = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Introduzca un numero:");
            array[i]=sc.nextInt();
        }

        for (int numero : array){
            System.out.print(numero + " - ");
        }
    }


}
