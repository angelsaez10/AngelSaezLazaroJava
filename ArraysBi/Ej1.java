package ArraysBi;

import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        int array [][] = new int[4][4];
        int temporal = 0;
        int columna = 0,fila=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                int aleatorio = random.nextInt(100);
                array[i][j] = aleatorio;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > temporal){
                    temporal = array[i][j];
                    fila=i;
                    columna=j;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("El numero mayor del array es "+temporal);
        System.out.println("Se encuentra en la fila:"+fila);
        System.out.println("Se encuentra en la fila:"+columna);
    }
}
