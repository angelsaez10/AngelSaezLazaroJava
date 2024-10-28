package EJERCICIOS;

import java.util.Scanner;

public class GestionAvanzadaInventarios {
    public static void main(String[] args) {
        //Ejercicio 3E:Escribe un programa que reciba las ventas mensuales de un producto y el stock inicial. El programa debe calcular
        // si es necesario realizar un pedido, siguiendo una serie de reglas

        Scanner sc=new Scanner(System.in);

        //Variables
        int stockInicial,ventas;

        System.out.println("Introduzca el stock actual:");
        stockInicial=sc.nextInt();
        sc.nextLine();

if (stockInicial<10){
    System.out.println("Pedido urgente");

    }else {

    System.out.println("Introduzca las ventas mensuales:");
    ventas=sc.nextInt();
    sc.nextLine();

            if (ventas>80){
                System.out.println("Pedido urgente");

            } else if (ventas<=80&&ventas>=50) {
                System.out.println("Pedido estandar");

            } else if (ventas<50) {
                System.out.println("No es necesario hacer un pedido");

            }
        }
    }
}
