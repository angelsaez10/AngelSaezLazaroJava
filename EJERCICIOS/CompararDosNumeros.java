package EJERCICIOS;

import java.util.Scanner;

public class CompararDosNumeros {
    public static void main(String[] args) {
        //Ejercicio 2:Dos numeros y compararlos
        Scanner sc=new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1= sc.nextInt();
        sc.nextLine();

        System.out.println("Dime otro numero:");
        int num2= sc.nextInt();
        sc.nextLine();

        if (num1>num2){
            System.out.println("El numero 1 es mayor que el numero 2.");

        } else if (num1<num2) {
            System.out.println("El numero 1 es menor que el numero 2.");

        }else if (num1==num2){
            System.out.println("Los numeros 1 y 2 son iguales.");
        }
    }
}
