package EJERCICIOS;

import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables para el rango
        int lInferior, lSuperior;

        // Solicitar el rango al usuario
        System.out.println("Introduce el valor mínimo del rango:");
        lInferior = sc.nextInt();
        System.out.println("Introduce el valor máximo del rango:");
        lSuperior = sc.nextInt();

        // Validar que el rango es correcto
        if (lInferior > lSuperior) {
            System.out.println("El valor mínimo debe ser menor o igual al valor máximo.");
        } else {
            System.out.println("Los números primos en el rango [" + lInferior + ", " + lSuperior + "] son:");

            // Iterar sobre cada número en el rango y verificar si es primo
            for (int num = lInferior; num <= lSuperior; num++) {
                if (esPrimo(num)) {
                    System.out.println(num);
                }
            }
        }

        // Cerrar el Scanner
        sc.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Verificar divisores solo hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // No es primo si tiene divisores
            }
        }

        return true; // Es primo si no se encontró ningún divisor
    }
}
