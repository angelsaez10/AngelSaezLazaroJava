package R5U2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int filas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas:");
        filas = sc.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
