package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej5 {
    public static void main(String[] args) {
        String frase;
        StringTokenizer st;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de palabras:");
        frase = sc.nextLine();

        st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();

            for (int i = 0; i < palabra.length(); i++) {
                char letra = Character.toLowerCase(palabra.charAt(i));
                if ("aeiou".indexOf(letra) != -1) {
                    contador++;
                }
            }
        }

        System.out.println("La cantidad de vocales en la frase es: " + contador);
    }
}
