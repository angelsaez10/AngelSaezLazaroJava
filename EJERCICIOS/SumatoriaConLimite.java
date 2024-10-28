package EJERCICIOS;

import java.util.Scanner;

public class SumatoriaConLimite {
    public static void main(String[] args) {

        //Variables
        int limite, suma=0, numero;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el numero limite que quiere que tenga la suma:");
        limite = sc.nextInt();
        sc.nextLine();

        while (suma < limite){
            System.out.println("Introduzca un numero:");
            numero = sc.nextInt();
            sc.nextLine();

            suma = suma + numero;
        }

        System.out.println("EL resultado de la suma es: "+suma);

    }
}
