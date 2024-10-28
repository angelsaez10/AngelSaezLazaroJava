package EJERCICIOS;

import java.util.Scanner;

public class HorarioSaludo {
    public static void main(String[] args) {
        //Ejercicio 4:Horario saludo
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Que hora es?");
        int hora= sc.nextInt();

        if (hora>=6&&hora<=12){
            System.out.println("Buenos dias.");

        } else if (hora>12&&hora<=20) {
            System.out.println("Buenas tardes.");

        }else {
            System.out.println("Buenas noches.");
        }
    }
}
