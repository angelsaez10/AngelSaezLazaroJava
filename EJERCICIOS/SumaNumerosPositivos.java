package EJERCICIOS;

import java.util.Scanner;

public class SumaNumerosPositivos {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int num=0,contador=0;

        while(num>=0){
            System.out.print("Introducza un numero:");
            num= sc.nextInt();
            sc.nextLine();
            if (num>=0) {
                contador = contador + num;
            }
        }
        System.out.println("La suma de los numeros introducidos es:"+contador);
    }
}
