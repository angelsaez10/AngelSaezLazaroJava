package RE2_ArraysUni;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int [] a1 = new int[10];
        int max=0;
        int x;

        Scanner sc = new Scanner(System.in);

        //Pido 10 numeros para meterle al array
        System.out.println("Introduzca 10 numeros:");
        for (int i = 0; i < 10 ; i++) {
            int num = sc.nextInt();
            a1[i] = num;
        }

        //Pido el nuero a partir del cual voy a separar el array
        System.out.println("¿A partir de que numero quiere que se divida el array?");
        x = sc.nextInt();

        //Ordeno el array
        Arrays.sort(a1);

        //Compruebo a partir de que indice el valor es mayor que el numero X que m e han dado
        for (int i = 0; i < 10; i++) {
            if (a1[i] > x) {
                max = i;
                break;
            }
        }

        int [] a2 = new int[max];
        int [] a3 = new int[a1.length-max];

        //Copio los numeros inferiores a el numero X que me han dado en un nuevo array(a2)
        System.arraycopy(a1,0,a2,0,max);
        //Copio los numeros superiores a el numero X que me han dado en un nuevo array(a3)
        System.arraycopy(a1,max,a3,0,a1.length-max);

        //Imprimo el array base
        System.out.println("Array base ordenado");
        for(int num : a1){
            System.out.println(num + " ");
        }

        //Imprimo el array de los inferiores
        System.out.println("Array menores que "+x+":");
        for(int nu : a2){
            System.out.println(nu + " ");
        }

        //Imprimo el array base
        System.out.println("Array mayores que "+x+":");
        for(int n : a3){
            System.out.println(n + " ");
        }

    }
}
