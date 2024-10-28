package EJERCICIOS;

import java.util.Scanner;

public class DivisoresDeNumero {
    public static void main(String[] args) {

        //Variables
        int numero,contador=1;

        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Introduce un numero positivo entero:");
            numero = sc.nextInt();
        }
        while(contador <= numero);{
            if (numero % contador == 0){
                System.out.println(contador);
            }
            contador++;
        }

    }
}
