package OCT1TO4;

import java.util.Scanner;

public class TresEnRaya {
    static char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    static char jugadorActual = 'X';

    public static void main(String[] args) {
        boolean juegoTerminado = false;
        Scanner sc = new Scanner(System.in);

        while (!juegoTerminado) {
            imprimirTablero();
            int fila, columna;

            // Pedir al jugador actual su movimiento
            System.out.println("Jugador " + jugadorActual + ", ingresa la fila y columna (0, 1 o 2): ");
            fila = sc.nextInt();
            columna = sc.nextInt();

            // Verificar si la posición está vacía
            if (fila < 0 || columna < 0 || fila > 2 || columna > 2 || tablero[fila][columna] != ' ') {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
                continue;
            }

            // Hacer el movimiento
            tablero[fila][columna] = jugadorActual;

            // Verificar si hay un ganador
            if (hayGanador()) {
                imprimirTablero();
                System.out.println("¡Jugador " + jugadorActual + " gana!");
                juegoTerminado = true;
            } else if (esEmpate()) {
                imprimirTablero();
                System.out.println("¡Es un empate!");
                juegoTerminado = true;
            } else {
                // Cambiar de jugador
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }
        sc.close();
    }

    public static void imprimirTablero() {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    public static boolean hayGanador() {
        // Revisar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;  // Fila completa
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;  // Columna completa
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;  // Diagonal principal
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;  // Diagonal inversa
        }
        return false;
    }

    public static boolean esEmpate() {
        // Si no hay espacios vacíos y no hay un ganador, es un empate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;  // Aún hay movimientos disponibles
                }
            }
        }
        return true;
    }
}
