package EJERCICIOS;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        //Ejercicio 16:Pedir una nota de 1 a 10 y decir a que rango de nota alfabetica pertenece
        double nota;

        Scanner sc=new Scanner(System.in);

        System.out.println("¿Que nota has sacado?");
        nota=sc.nextDouble();

        if (nota>0&&nota<10) {
            if (nota >= 0 && nota < 5) {
                System.out.println("Insuficiente");

            } else if (nota >= 5 && nota < 7) {
                System.out.println("Bien");

            } else if (nota >= 7 && nota < 9) {
                System.out.println("Notable");

            } else if (nota >= 9 && nota < 10) {
                System.out.println("Sobresaliente");
            }

        }else {
            System.out.println("La nota introducida no es valida");
        }
    }
}
