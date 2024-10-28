package EJERCICIOS;

import java.util.Scanner;

public class SimuladorResultadoElecciones {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int votosA,votosB,votosC;

        System.out.println("Introduce el porcentaje de votos para el candidato A:");
        votosA=sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el porcentaje de votos para el candidato B:");
        votosB=sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el porcentaje de votos para el candidato C:");
        votosC=sc.nextInt();
        sc.nextLine();

    if (votosA+votosB+votosC>100){
        System.out.println("Los datos introducidos no son correctos.");

        }else {
            if (votosA>=50){
                System.out.println("El candidato A gana,");

            }else if (votosB>=50){
                System.out.println("El candidato B gana,");

            } else if (votosC>=50) {
            System.out.println("El candidato C gana,");

            }else if (votosA>votosB&&votosA>votosC){
                System.out.println("El candidato A gana,");

            } else if (votosB>votosA&&votosB>votosC) {
                System.out.println("El candidato B gana,");

            } else if (votosC>votosA&&votosC>votosB) {
                System.out.println("El candidato C gana,");

        }
    }
    }
}
