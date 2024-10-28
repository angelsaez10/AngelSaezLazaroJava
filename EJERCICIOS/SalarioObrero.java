package EJERCICIOS;

import java.util.Scanner;

public class SalarioObrero {
    public static void main(String[] args) {
        //Ejercicio 7:Calcula el salario de un obrero que cobra 16euros la hora por 40 horas semanales y 20euros por hora a partir de
        //esas 40 horas semanales
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Cuantas horas ha trabajado el obrero esta semana?");
        double horas= sc.nextDouble();

        if (horas<=40.00){
            double salario=horas*16;
            System.out.println("El salario es de "+salario+"euros por un total de: "+horas+" horas");

        }else{
            double salario=horas*16;
            double hExtras=horas-40.00;
            double sExtras=hExtras*20;
            System.out.println("El salario es de "+salario+"euros por un total de: "+horas+" horas, mas: "+sExtras+"euros por:"+hExtras+" horas extra");
        }
    }
}
