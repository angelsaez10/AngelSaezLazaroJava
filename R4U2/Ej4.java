package R4U2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num=1,producto=1;
        Scanner sc = new Scanner(System.in);
        while (num != 0){
            System.out.println("Introduce un numero:");
            num = sc.nextInt();
            if (num != 0) {
                producto *= num;
            }
        }
        System.out.println("El producto acumulado es:"+producto);
    }
}
