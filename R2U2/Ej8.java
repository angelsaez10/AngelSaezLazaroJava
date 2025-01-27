package R2U2;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        int num1,num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        num1 = sc.nextInt();

        System.out.println("Introduzca otro numero:");
        num2 = sc.nextInt();

        if (num1 %2 == 0 && num2 %2 ==0){
            System.out.println("Ambos numeros son pares.");
        }else if (num1 %2 !=0 && num2 %2 != 0){
            System.out.println("Ambos numero son impares.");
        }else {
            System.out.println("La pareja de numeros no es ni par ni impar.");
        }
    }
}
