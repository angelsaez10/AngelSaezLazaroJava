package EJERCICIOS;

import java.util.Scanner;

public class CalculadoraBonosEmpresariales {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int añosTrabajados,bono;
        String desempeño;

        System.out.print("Introduzca los años trabajados:");
        añosTrabajados=sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el nivel de desempeño(excelente,bueno,bajo):");
        desempeño=sc.nextLine();

        if (añosTrabajados>=10&&desempeño.equalsIgnoreCase("excelente")){
            System.out.println("Bono otorgado: 20% del salario");

        } else if (añosTrabajados>=5&&desempeño.equalsIgnoreCase("bueno")) {
            System.out.println("Bono otorgado: 10% del salario");

        } else if (añosTrabajados<5) {
            System.out.println("No recibes bono");

        } else if (desempeño.equalsIgnoreCase("bajo")) {
            System.out.println("No recibes bono");
        }


    }
}
