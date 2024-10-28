package EJERCICIOS;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        //Variables
        int numero,guess;

        numero=random.nextInt(1,10);
        guess=0;

        System.out.println("Generando numero aleatorio...");

        do{
            System.out.println("Adivina el numero secreto:");
            guess= sc.nextInt();
            sc.nextLine();

            if (numero!=guess){
                System.out.println("incorrecto, prueba otra vez");
            }

        } while (numero!=guess);

        System.out.println("Correcto, has adivinado el numero aleatorio");

    }
}
