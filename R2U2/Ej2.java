package R2U2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        num1 = sc.nextInt();

        System.out.println("Introduce otro numero:");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El numero "+num1+" es mayor que el numero "+num2+".");
        } else if (num1 < num2) {
            System.out.println("El numero "+num2+" es mayor que el numero "+num1+".");
        }else {
            System.out.println("Ambos numeros son iguales.");
        }
    }
}
