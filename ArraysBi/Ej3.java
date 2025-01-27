package ArraysBi;

import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        int array [][] = new int[4][4];
        int contador=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                int aleatorio = random.nextInt(100);
                array[i][j] = aleatorio;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 50){
                    contador++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("El array tiene " +contador+" numeros mayores que 50");

    }
}
