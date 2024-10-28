package EJERCICIOS;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Ejercicio 15:Haz una calculadora basica
        String operacion;
        double num1,num2,suma,resta,multiplicación,división;
        Scanner sc=new Scanner(System.in);

        System.out.println("---Iniciando calculadora---");
        System.out.println("S.Suma");
        System.out.println("R.Resta");
        System.out.println("M.Multiplicación");
        System.out.println("D.División");

        System.out.println("¿Que operaion deseas realizar?");
        operacion= sc.nextLine();

        System.out.println("Dame el primer operando:");
        num1= sc.nextDouble();
        sc.nextLine();

        System.out.println("Dame el segundo operando:");
        num2= sc.nextDouble();

        if (operacion.equalsIgnoreCase("s")){
            suma=num1+num2;
            System.out.println("El resultado de la suma es:"+suma);

        } else if ((operacion.equalsIgnoreCase("r"))) {
            resta=num1-num2;
            System.out.println("El resultado de la resta es:"+resta);

        } else if ((operacion.equalsIgnoreCase("m"))) {
            multiplicación=num1*num2;
            System.out.println("El resultado de la multiplicación es:"+multiplicación);

        }else if ((operacion.equalsIgnoreCase("d"))){
            división=num1/num2;
            System.out.println("El resultado de la división es:"+división);

        }else {
            System.out.println("No se ha introducido un operacion valida");
        }

    }
}
