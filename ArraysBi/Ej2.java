package ArraysBi;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int array [][] = new int[4][4];
        int guess;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                int aleatorio = random.nextInt(100);
                array[i][j] = aleatorio;
            }
        }

        System.out.println("Introduce un numero que quieras comprobar si se encuentra dentro del array:");
        guess = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (guess == array[i][j]){
                    correcto = true;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        if (correcto){
            System.out.println("El numero introducido se encuentra dentro del array");
        }else System.out.println("El numero introducido no se encuentra en el array");


    }
}
