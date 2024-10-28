package EJERCICIOS;

import java.util.Scanner;
public class MultiploDeDiez {
    public static void main(String[] args) {
        //Ejercicio 1:Número entero múltiplo de 10
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Dime un numero entero:");
        num= sc.nextInt();
        sc.nextLine();

        if (num%10==0){
            System.out.println("El numero es multiplo de 10.");

        }else {
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
