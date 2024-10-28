package EJERCICIOS;

import java.util.Scanner;

public class CalcularImpuestos {
    public static void main(String[] args) {
        //Ejercicio 1E:Calcular los impuestos a pagar de una persona segun los tramos por salatio
        Scanner sc=new Scanner(System.in);

        //Variables
        double salarioB,salarioN;

        System.out.println("Introduce tu salario bruto:");
        salarioB=sc.nextDouble();
        sc.nextLine();

        if (salarioB>=0&&salarioB<=10000){
            salarioN=salarioB;
            System.out.println("Se le aplica un impuesto del 0%,por lo que el salario despues de impuestos es de:"+salarioN+"euros");

        } else if (salarioB>10000&&salarioB<=30000) {
            salarioN=salarioB*0.9;
            System.out.println("Se le aplica un impuesto del 10%,por lo que el salario despues de impuestos es de:"+salarioN+"euros");

        } else if (salarioB>30000&&salarioB<=60000) {
            salarioN=salarioB*0.8;
            System.out.println("Se le aplica un impuesto del 20%,por lo que el salario despues de impuestos es de:"+salarioN+"euros");

        } else if (salarioB>60000) {
            salarioN=salarioB*0.7;
            System.out.println("Se le aplica un impuesto del 30%,por lo que el salario despues de impuestos es de:"+salarioN+"euros");

        }else {
            System.out.println("El tramo de salario no corresponde con niguno de los tramos posibles, por favor introduzca un salario correcto");
        }
    }
}
