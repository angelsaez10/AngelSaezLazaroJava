package EJERCICIOS;

import java.util.Scanner;

public class ComvertirMoneda {
    public static void main(String[] args) {
        //Ejercicio 11:Realiza conversion de euros a libras,dolares,yenes y bolivares
        double euros;
        final double libras,dolares,yenes,bolivares;
        libras=0.83;
        dolares=1.08;
        yenes=162.28;
        bolivares=41.10;
        String moneda;

        Scanner sc=new Scanner(System.in);

        System.out.println("Dime la cantidad en euros que quieres convertir:");
        euros= sc.nextDouble();
        sc.nextLine();

        System.out.println("¿A que moneda quieres hacer el cambio?");
        moneda=sc.nextLine();

        switch (moneda){
            case "libras":
                System.out.println("La conversion de "+euros+"euros a libras es:"+euros*libras);
                break;

            case "dolares":
                System.out.println("La conversion de "+euros+"euros a dolares es:"+euros*dolares);
                break;

            case "yenes":
                System.out.println("La conversion de "+euros+"euros a yenes es:"+euros*yenes);
                break;

            case "bolivares":
                System.out.println("La conversion de "+euros+"euros a bolivares es:"+euros*bolivares);
                break;
        }
    }
}
