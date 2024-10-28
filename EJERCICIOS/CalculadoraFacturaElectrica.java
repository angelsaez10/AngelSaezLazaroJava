package EJERCICIOS;

import java.util.Scanner;

public class CalculadoraFacturaElectrica {
    public static void main(String[] args) {
        //Ejercicio 5E:Escribe un programa que calcule el total de una factura de electricidad basada en el consumo de energía.

        Scanner sc=new Scanner(System.in);

        //Variables
        double consumo;

        System.out.println("Introduzca el consumo mensual en kWh:");
        consumo=sc.nextDouble();
        sc.nextLine();
if (consumo<0){
    System.out.println("El precio introducido no es correcto");
    }else{
            if (consumo<100){
                System.out.println("Total a pagar:"+consumo*0.5+"euros");

            }else if(consumo>=101&&consumo<=500){
                System.out.println("Total a pagar:"+consumo*0.75+"euros");

            }else if(consumo>=501&&consumo<=1000){
                System.out.println("Total a pagar:"+consumo*1+"euros");

            }else if(consumo>1000) {
                System.out.println("Total a pagar:" + consumo * 1.5 + "euros");
            }
        }
    }
}
