package EJERCICIOS;

import java.util.Scanner;

public class NumeroPrimoONo {
    public static void main(String[] args) {

        //Variables
        int num,contador=2;
        boolean esPrimo0 = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        num = sc.nextInt();

        while (contador<num && esPrimo0 ){
            if (num %contador == 0){
                esPrimo0=false;
            }
            contador++;
        }

        if (num <=1){
            System.out.println("El numero no es primo");
        }else if ( esPrimo0){
            System.out.println("El numero es primo");

        }else if(!esPrimo0) {
            System.out.println("El numero no es primo");
        }
    }
}
