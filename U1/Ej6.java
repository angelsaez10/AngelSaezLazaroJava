package U1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int hTotales, rojo, verde, azul;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de hojas que tiene el cuaderno:");
        hTotales = sc.nextInt();

        if (hTotales % 3 == 0) {
            rojo = hTotales / 3;
            verde = hTotales / 3;
            azul = hTotales / 3;
        }
        else if (hTotales % 2 == 0) {
            rojo = hTotales / 3 + 1;
            verde = hTotales / 3;
            azul = hTotales / 3;
        }
        else {
            rojo = hTotales / 3 + 1;
            verde = hTotales / 3 + 1;
            azul = hTotales / 3;
        }

        System.out.println("Hojas rojas: " + rojo + " - Hojas verdes: " + verde + " - Hojas Azules: " + azul);
    }
}
