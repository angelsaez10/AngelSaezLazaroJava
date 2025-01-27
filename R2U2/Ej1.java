package R2U2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        if (num %10 ==0){
            System.out.println("El numero es multiplo de 10.");
        }else System.out.println("El numero no es multiplo de 10.");
    }
}
