package EJERCICIOS;

import java.util.Scanner;

public class CuentaRegresiva {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int n,contador;

        System.out.println("Introduzca el numero desde el que quiere comenzar la cuenta atras:");
        n= sc.nextInt();
        sc.nextLine();

        contador=n;

        while (contador==0){
            System.out.println(contador);
            contador--;
        }
    }
}
