package NOV18TO22;

import java.util.Scanner;

public class Veintidos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño, posicion, numero, contador = 0;

        System.out.println("¿De qué tamaño quiere hacer el array?");
        tamaño = sc.nextInt();

        if (tamaño < 0){
            System.err.println("El tamaño del array no puede ser un numero negativo.");
            return;
        }

        int[] arraynumeros = new int[tamaño];

        //Mientras que el array tenga posiciones libre el while seguira ejecutandose
        //cada vez que se introduce un valor el contador se actualiza ,es decir, por una posicion menos en el array se le suma uno al contador
        while (contador < tamaño) {
            System.out.println("Introduzca la posición donde quiere guardar el valor:");
            posicion = sc.nextInt();

            if (posicion == -1){
                System.out.println("Finalizando programa...");
                return;
            }
        //si la posicion esta dentro del tamaño del array es decir mayor que 0 y menor que el tamaño del array
            if (posicion < 0 || posicion >= tamaño) {
                System.err.println("La posición debe estar entre 0 y " + (tamaño - 1));
                //Si el valor de la posicion es 0 es que esta vacio por lo que si no es cero hay algo en la posicion
            } else if (arraynumeros[posicion] != 0) {
                System.out.println("La posición " + posicion + " ya está ocupada. Intente otra posición.");
            } else {
                System.out.println("Introduzca el valor que quiere guardar:");
                numero = sc.nextInt();
                arraynumeros[posicion] = numero;
                contador++;
                System.out.println("Valor introducido correctamente.");
                System.out.println("Contenido actual del array:");
                for (int i = 0; i < tamaño; i++) {
                    System.out.println("Posición " + i + ": " + arraynumeros[i]);
            }

            }
        }

        System.out.println("El array está lleno.");

    }
}
