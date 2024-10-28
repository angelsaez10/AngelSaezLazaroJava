package EJERCICIOS;

import java.util.Scanner;

public class ContadorNumerosPares {
    public static void main(String[] args) {

        //Variables
        int pares,contador=2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Imprimiendo los 50 primeros numeros pares...");

        while (contador <= 50){
            System.out.print(contador+",");
            contador +=2;
        }

    }
}
