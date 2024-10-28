package EJERCICIOS;

import java.util.Scanner;

public class InvertirDigitosNumero1 {
    public static void main(String[] args) {

        //Variables
        int numero,numeroOriginal,numeroInvertido;
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce un número entero: ");
                numero = scanner.nextInt();

                numeroOriginal = numero;

                numeroInvertido = 0;

                while (numero != 0) {
                    int digito = numero % 10; // 123 módulo 10 es 3 , es decir se coge el ultimo digito
                    numeroInvertido = numeroInvertido * 10 + digito; // se cpge el ultimo digito que hemos sacado haciendo modulo 10 y se guarda en otra variable multipliacandolo por 10 para obtener el primer digito del numero invertido
                    numero = numero / 10; // se divide el numero inicial entre 10 para quitarle el ultimo digito e ir avanzando
                }

                System.out.println("El número " + numeroOriginal + " invertido es: " + numeroInvertido);

            }
        }