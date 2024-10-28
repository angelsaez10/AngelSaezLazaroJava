package EJERCICIOS;

import java.util.Scanner;

public class CreditosAcademicos {
    public static void main(String[] args) {
        //Ejercicio 2E:Escribe un programa que calcule el estado académico de un estudiante basado en sus créditos completados y su promedio:
        Scanner sc=new Scanner(System.in);

        //Variables
        int creditos;
        double promedio;

        System.out.println("Introduce tu numero de creditos:");
        creditos= sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce tu promedio:");
        promedio= sc.nextDouble();
        sc.nextLine();

        if (promedio<7.0){
            System.out.println("Su promedio es menor a 7,0.");
            System.out.println("Estado academico:en riesgo");

        }else if (creditos<80){
            System.out.println("Ha completado menos de 80 creditos.");
            System.out.println("Estado academico:estudiante regular");

        } else if ((creditos>80&&creditos<120)&&(promedio>=7.0)) {
            System.out.println("Ha completado entre 80 y 120 creditos y su promedio es de mas de 7,0.");
            System.out.println("Estado academico:estudiante de ultimo año");

        } else if ((promedio>=7.0&&promedio<=8.9)&&(creditos>120)) {
            System.out.println("El promedio esta entre 7,0 y 8,9 y supera los 120 creditos.");
            System.out.println("Estado academico:estudiante graduado");

        } else if (creditos>120&&promedio>=9.0) {
            System.out.println("El promedio es superior a 9,0 y posee mas de 120 creditos.");
            System.out.println("Estado academico:estudiante con honores");

        }else {
            System.out.println("los datos introducidos son erroneos.Por favor pruebe de nuevo");
        }
    }
}
