package EJERCICIOS;

import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {
        //Ejercicio 4E:Escribe un programa que reciba tres valores correspondientes a los lados de un triángulo. El programa debe clasificar el triángulo como

        Scanner sc=new Scanner(System.in);

        //Variables
        double ladoA,ladoB,ladoC;

        System.out.print("Introduce la longitud del lado A:");
        ladoA= sc.nextDouble();
        sc.nextLine();

        System.out.print("Introduce la longitud del lado B:");
        ladoB= sc.nextDouble();
        sc.nextLine();

        System.out.print("Introduce la longitud del lado C:");
        ladoC= sc.nextDouble();
        sc.nextLine();

        if (ladoA==ladoB&&ladoA==ladoC&&ladoB==ladoC){
            System.out.println("El triangulo es equilatero");

        } else if (ladoA==ladoB||ladoA==ladoC||ladoB==ladoC) {
            System.out.println("El triangulo es isosceles");

        } else if (ladoA!=ladoB&&ladoA!=ladoC&&ladoB!=ladoC) {
            System.out.println("El triangulo es escaleno");

        }else {
            System.out.println("Las medidas introducidas para los lados del triangulo son erroneas");
        }
    }
}
