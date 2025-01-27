package RE_ArraysUni;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int [] array = new int[5];
        int positivos=0;
        int contPositivos=0;
        int negativos=0;
        int contNegativos=0;
        int contadorCeros=0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Introduzca un numero:");
            array[i]=sc.nextInt();
        }

        for (int i = 0; i < array.length ; i++) {
          int temporal;
          temporal = array[i];

          if (temporal > 0){
              positivos += temporal;
              contPositivos++;
          } else if (temporal < 0) {
              negativos -= temporal;
              contNegativos++;
          }else contadorCeros++;

        }

        if (contPositivos > 0) {
            System.out.println("La media de los numeros positivos es:" + positivos / contPositivos);
        }else System.out.println("No hay numeros positivos.");
        if (contNegativos > 0) {
            System.out.println("La media de los numeros negativos es:-" + Math.abs(negativos / contNegativos));
        }else System.out.println("No hay numeros negativos.");
        System.out.println("Hay un total de:"+contadorCeros+" ceros.");
    }
}
