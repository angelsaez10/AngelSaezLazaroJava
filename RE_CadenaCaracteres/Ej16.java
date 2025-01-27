package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej16 {
    public static void main(String[] args) {
        String frase, caracter;
        StringTokenizer st;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de palabras:");
        frase = sc.nextLine();

        do {
            System.out.println("Introduzca el carácter que quiere contar:");
            caracter = sc.nextLine();
            if (caracter.length() != 1) {
                System.err.println("Debe ingresar un solo carácter.");
            }
        } while (caracter.length() != 1);

        char c = Character.toLowerCase(caracter.charAt(0));

        st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();

            for (int i = 0; i < palabra.length(); i++) {
                char letra = Character.toLowerCase(palabra.charAt(i));
                if (letra == c) {
                    contador++;
                }
            }
        }

        System.out.println("El carácter '" + c + "' aparece " + contador + " veces en la frase.");
    }
}
