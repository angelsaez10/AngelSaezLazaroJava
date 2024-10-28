package EJERCICIOS;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        int numero, contador = 1,i=0;

        System.out.println("Introduzca el numero que quiere comprobar si es primo:");
        numero = sc.nextInt();

        while (contador <= numero) {

            if (numero % contador == 0) {
                i++;
            }
            contador++;
        }

        System.out.println("Los numeros que son divisibles por "+numero+" son "+i);
        if (i==2){
            System.out.println("EL numero es primo");

        }else {
            System.out.println("El numero no es primo ");
        }


    }
}
