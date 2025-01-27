package ArraysBi;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
    int jugador1f, jugador1c, jugador2f, jugador2c;
    boolean victoria1 = false, victoria2 = false,empate = true;
    boolean mal = true;

    public TresEnRaya() {
        jugador1f = 0;
        jugador1c = 0;
        jugador2f = 0;
        jugador2c = 0;
    }

    public void mostrarTablero(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }

    /*
    public boolean comprobarPosicion(int fila,int columna){
        if (tablero[fila][columna].equals)
        return false;
    }
     */

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // se crea la partida 1
        TresEnRaya p1 = new TresEnRaya();
        // Se crea el tablero que es un array de 3x3
        String[][] tablero = new String[3][3];

        // se rellena el array tablero con guiones
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], "-");
        }

        // para que el bucle termine se tiene que dar la condicion de que uno de los jugadores gane o haya un empate
        while (true) {
            // metodo que muestra el tablero
            p1.mostrarTablero(tablero);

            // comprobamos que la posicion que quiere jugar el jugador 1 no esta ocupada
            while (p1.mal) {
                System.out.println("¿En que fila quiere el jugador 1 colocar una X?");
                p1.jugador1f = sc.nextInt();
                System.out.println("¿En que columna quiere el jugador 1 colocar una X?");
                p1.jugador1c = sc.nextInt();

                // si no esta ocupada marcamos esa posicion con una X
                if (tablero[p1.jugador1f][p1.jugador1c].equalsIgnoreCase("-")) {
                    tablero[p1.jugador1f][p1.jugador1c] = "X";
                    p1.mal = false;
                } else
                    System.err.println("Posicion ocupada");
            }

            // comprobamos si el jugador 1 ha hecho 3 en raya (filas, columnas y diagonales)
            if (tablero[0][0].equalsIgnoreCase("x") && tablero[0][1].equalsIgnoreCase("x") && tablero[0][2].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[1][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[1][2].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[2][0].equalsIgnoreCase("x") && tablero[2][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[0][0].equalsIgnoreCase("x") && tablero[1][0].equalsIgnoreCase("x") && tablero[2][0].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[0][1].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][1].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[0][2].equalsIgnoreCase("x") && tablero[1][2].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[0][0].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][2].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            } else if (tablero[0][2].equalsIgnoreCase("x") && tablero[1][1].equalsIgnoreCase("x") && tablero[2][0].equalsIgnoreCase("x")) {
                p1.victoria1 = true;
            }

            // si el jugador 1 gana
            if (p1.victoria1) {
                p1.mostrarTablero(tablero);
                System.out.println("El jugador 1 gana");
                break;
            }

            p1.mostrarTablero(tablero);
            p1.mal = true;

            // comprobamos que la posicion que quiere jugar el jugador 2 no esta ocupada
            while (p1.mal) {
                System.out.println("¿En que fila quiere el jugador 2 colocar una O?");
                p1.jugador2f = sc.nextInt();
                System.out.println("¿En que columna quiere el jugador 2 colocar una O?");
                p1.jugador2c = sc.nextInt();

                if (tablero[p1.jugador2f][p1.jugador2c].equalsIgnoreCase("-")) {
                    tablero[p1.jugador2f][p1.jugador2c] = "O";
                    p1.mal = false;
                } else
                    System.err.println("Posicion ocupada");
            }
            p1.mal = true;

            // comprobamos si el jugador 2 ha hecho 3 en raya
            if (tablero[0][0].equalsIgnoreCase("o") && tablero[0][1].equalsIgnoreCase("o") && tablero[0][2].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[1][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[1][2].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[2][0].equalsIgnoreCase("o") && tablero[2][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[0][0].equalsIgnoreCase("o") && tablero[1][0].equalsIgnoreCase("o") && tablero[2][0].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[0][1].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][1].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[0][2].equalsIgnoreCase("o") && tablero[1][2].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[0][0].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][2].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            } else if (tablero[0][2].equalsIgnoreCase("o") && tablero[1][1].equalsIgnoreCase("o") && tablero[2][0].equalsIgnoreCase("o")) {
                p1.victoria2 = true;
            }

            if (p1.victoria2) {
                p1.mostrarTablero(tablero);
                System.out.println("El jugador 2 gana");
                break;
            }

            // Verificar si hay empate
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j].equalsIgnoreCase("-")) {
                        p1.empate = false; // Si hay una celda vacía, no hay empate
                        break;
                    }
                }
                if (!p1.empate) break;
            }

            if (p1.empate) {
                p1.mostrarTablero(tablero);
                System.out.println("Empate.");
                break;
            }
        }
    }
}
