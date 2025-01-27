package R2U2;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        double horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el total de horas que ha trabajado esta semana:");
        horas = sc.nextDouble();

        if (horas < 40 ){
            System.out.println("El salario semanal es de:"+horas*16+" euros.");
        } else if (horas >= 40) {
            System.out.println("El salario semanal es de:"+((40*16)+(horas-40)*20)+" euros");
        }
    }
}
