package R2U2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej10 {
    public static void main(String[] args) {
        int numero,contador = 0;
        StringTokenizer st;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 0 al 99999:");
        numero = sc.nextInt();

        while (numero > 0){
                numero /= 10;
                contador++;
        }
        System.out.println("El numero tiene:"+contador+" digitos.");

    }
}
