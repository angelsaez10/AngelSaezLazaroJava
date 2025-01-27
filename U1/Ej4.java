package U1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int numero ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        numero = sc.nextInt();

        if (numero == 0){
            System.out.println("El numero es 0.");
        }else System.out.println("El numero no es 0.");

        if (numero > 0){
            System.out.println("El numero es mayor que 0.");
        }else System.out.println("El numero es menor que 0.");

        if (numero < 100){
            System.out.println("El numero es menor que 100.");
        }else System.out.println("El numero es mayor que 100.");

        if ( numero%2 ==0){
            System.out.println("El numero es par.");
        }else System.out.println("El numero es impar.");
    }
}
