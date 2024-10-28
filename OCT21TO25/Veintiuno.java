package OCT21TO25;

import java.util.Scanner;

public class Veintiuno {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
/*
        //While
        int numero=1;
        while (numero<=10){
            System.out.println(numero);
            numero++;
        }
        System.out.println("Dame un numero de inicio:");
        int inicio= sc.nextInt();
        sc.nextLine();

        System.out.println("Dame un numero de fin:");
        int fin= sc.nextInt();
        sc.nextLine();

        while (inicio<=fin){
            System.out.println(inicio);
            inicio++;
        }

        while (inicio>fin){
            System.out.println("El numero de inicio debe ser menor que el de fin");

            System.out.println("Dame un numero de inicio:");
            inicio= sc.nextInt();
            sc.nextLine();

            System.out.println("Dame un numero de fin:");
            fin= sc.nextInt();
            sc.nextLine();
        }



        int numero,inicio=1,fin=10;

        System.out.println("¿Que tabla de multiplicar deseas conocer?");
        numero= sc.nextInt();;
        sc.nextLine();

        while (inicio<=fin){
            System.out.println(numero*inicio);
            inicio++;
        }
         */
//ta mal
        int inicio,fin,contador,pares=0;

        System.out.println("Introduzca el inicio:");
        inicio= sc.nextInt();
        sc.nextLine();

        contador=inicio;

        System.out.println("Introduzca el final:");
        fin=sc.nextInt();
        sc.nextLine();

        while (contador<=fin){
            if (contador%2==0){
                System.out.println(contador);
                pares++;
            }
            contador++;
        }
        System.out.println("Se han encontrado "+pares+" numeros pares");
    }
}
