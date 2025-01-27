package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        String cadena;
        String buscar;
        boolean encontrado = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres:");
        cadena = sc.nextLine();
        System.out.println("Introduzca el carácter o palabra que desea buscar:");
        buscar = sc.nextLine();


        int posicion = cadena.indexOf(buscar);

        while (posicion != -1) {
            System.out.println("El carácter/cadena introducido se encuentra en la posición: " + posicion);
            encontrado = true;
            posicion = cadena.indexOf(buscar,posicion + 1);
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el carácter/cadena solicitado.");
        }
    }
}
