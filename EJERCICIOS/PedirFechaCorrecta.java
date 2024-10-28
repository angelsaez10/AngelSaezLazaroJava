package EJERCICIOS;

import java.util.Scanner;

public class PedirFechaCorrecta {
    public static void main(String[] args) {
        // Ejercicio 13 y 14:Pedir el dia el mes y el año y comprtobar si la fecha es corercta contando con los dias que tiene cada mes y
        //si el año es bisiesto o no
        int dia, mes, año;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la fecha que quieres comprobar:");
        System.out.print("Día: ");
        dia = sc.nextInt();
        sc.nextLine();

        System.out.print("Mes: ");
        mes = sc.nextInt();
        sc.nextLine();

        System.out.print("Año: ");
        año = sc.nextInt();
        sc.nextLine();

        if (mes < 1 || mes > 12) {
            System.out.println("No ha introducido un mes válido.");
        } else {

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fecha es correcta.");
                } else {
                    System.out.println("El día no es válido para este mes.");
                }
            } else if (mes == 2) {
                if (esBisiesto(año)) {
                    if (dia >= 1 && dia <= 29) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("El día no es válido para febrero en un año bisiesto.");
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("El día no es válido para febrero en un año no bisiesto.");
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("La fecha es correcta.");
                } else {
                    System.out.println("El día no es válido para este mes.");
                }
            }
        }
    }

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int año) {

        return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
    }
}
