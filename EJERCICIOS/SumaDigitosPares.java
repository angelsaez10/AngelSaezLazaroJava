package EJERCICIOS;

import java.util.Scanner;

public class SumaDigitosPares {
    public static void main(String[] args) {

        //Variables
        int numero,sumaDigitosPares=0,sumaDigitosImpares=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero:");
        numero = sc.nextInt();
        sc.nextLine();

        while (numero != 0) {
            int digito = numero % 10; // 123 módulo 10 es 3 , es decir se coge el ultimo digito
            if (digito %2 == 0) {
                sumaDigitosPares = sumaDigitosPares + digito; // se coge el ultimo digito que hemos sacado haciendo modulo 10 y se guarda en otra variable multipliacandolo por 10 para obtener el primer digito del numero invertido
                numero = numero / 10; // se divide el numero inicial entre 10 para quitarle el ultimo digito e ir avanzando
            } else if (digito %2 != 0) {
                sumaDigitosImpares = sumaDigitosPares + digito; // se coge el ultimo digito que hemos sacado haciendo modulo 10 y se guarda en otra variable multipliacandolo por 10 para obtener el primer digito del numero invertido
                numero = numero / 10; // se divide el numero inicial entre 10 para quitarle el ultimo digito e ir avanzando
            }
        }
        System.out.println("Pares:"+sumaDigitosPares);
        System.out.println("Impares:"+sumaDigitosImpares);

    }
}
