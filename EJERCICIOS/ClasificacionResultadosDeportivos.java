package EJERCICIOS;

import java.util.Scanner;

public class ClasificacionResultadosDeportivos {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int vic1,derr1,emp1,vic2,derr2,emp2,vic3,derr3,emp3;

        System.out.println("Equipo 1:");
        System.out.print("Introduce el numero de victorias:");
        vic1= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de derrotas:");
        derr1= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de empates:");
        emp1= sc.nextInt();
        sc.nextLine();
        if (vic1>=8&&derr1==0){
            System.out.println("Invicto");
        }else if (derr1>5){
            System.out.println("Eliminado");
        } else if (emp1>5) {
            System.out.println("Mediocre");
        }else{
            System.out.println("Competitivo");
        }

        System.out.println("Equipo 2:");
        System.out.print("Introduce el numero de victorias:");
        vic2= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de derrotas:");
        derr2= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de empates:");
        emp2= sc.nextInt();
        sc.nextLine();

        if (vic2>=8&&derr2==0){
            System.out.println("Invicto");
        }else if (derr2>5){
            System.out.println("Eliminado");
        } else if (emp2>5) {
            System.out.println("Mediocre");
        }else{
            System.out.println("Competitivo");
        }

        System.out.println("Equipo 3:");
        System.out.print("Introduce el numero de victorias:");
        vic3= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de derrotas:");
        derr3= sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el numero de empates:");
        emp3= sc.nextInt();
        sc.nextLine();

        if (vic3>=8&&derr3==0){
            System.out.println("Invicto");
        }else if (derr3>5){
            System.out.println("Eliminado");
        } else if (emp3>5) {
            System.out.println("Mediocre");
        }else{
            System.out.println("Competitivo");
        }



    }
}
