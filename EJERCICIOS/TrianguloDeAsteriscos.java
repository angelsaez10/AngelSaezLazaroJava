package EJERCICIOS;

import java.util.Scanner;

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {

        //Variables
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de filas:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}