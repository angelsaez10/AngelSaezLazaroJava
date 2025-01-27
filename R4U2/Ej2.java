package R4U2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero desde el que quiere realizar la cuenta regresiva:");
        num = sc.nextInt();

        System.out.println("Iniciando la cuenta atras:");
        while (num > 0){
            System.out.print(num+"...");
            num --;
        }
    }
}
