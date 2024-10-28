package EJERCICIOS;

import java.util.Scanner;

public class NNumerosImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Variables
        int n,contador,numero;

        System.out.print("Ingresa un valor: ");
        n = scanner.nextInt();

        contador=0;
        numero=1;

        while (contador < n) {
            System.out.println(numero);
            numero =numero+2;
            contador++;
        }

    }
}
