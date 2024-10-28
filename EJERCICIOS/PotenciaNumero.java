package EJERCICIOS;

import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args) {

        //Variables
        int base,potencia,contador=1,resultado=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero base:");
        base = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca la potencia a la que quiere elevarlo:");
        potencia = sc.nextInt();
        sc.nextLine();

        while (contador <= potencia){
            resultado= resultado*base;
            contador++;
        }

        System.out.println(base+" elevado a "+potencia+" es igual a "+resultado);
    }
}
