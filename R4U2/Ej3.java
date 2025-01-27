package R4U2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int num =0,suma = 0;
        Scanner sc = new Scanner(System.in);
        while (num >= 0){
            System.out.println("Introduce un numero:");
            num = sc.nextInt();

            if (num > 0){
                suma += num;
            }

        }

        System.out.println("La suma de todos los numeros positivos es:"+suma);
    }
}
