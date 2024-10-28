package EJERCICIOS;

import java.util.Scanner;

public class NumerosPrimosRango1 {
    public static void main(String[] args) {

        //Variables
        int num, contador = 2, lMinimo, lMaximo;
        boolean esPrimo=true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primero numero a comprobar:");
        lMinimo = sc.nextInt();

        System.out.println("Introduzca el ultimo numero a comprobar:");
        lMaximo = sc.nextInt();

        for (int i = lMinimo ; i <= lMaximo ; i++ ){
            contador = 2;
            esPrimo = true;

            while (contador<i && esPrimo ){
                if (i %contador == 0){
                    esPrimo=false;
                }
                contador++;
            }

            if (i <=1){
                System.out.println("El numero no es primo");
                // }else if ( esPrimo){
                //     System.out.println("El numero es primo");

            }else if(esPrimo) {
                System.out.println(i);
            }

        }
    }
}