package R2U2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora del dia(0-24):");
        h = sc.nextInt();

        if (h >= 6 && h < 12){
            System.out.println("Buenos dias.");
        } else if (h >= 12 && h < 20) {
            System.out.println("Buenas tardes.");
        }else if ((h>= 20 && h < 24) || (h >= 0 && h < 6)){
            System.out.println("Buenas noches.");
        }else System.out.println("La hora introducida es incorrecta.");
    }
}
