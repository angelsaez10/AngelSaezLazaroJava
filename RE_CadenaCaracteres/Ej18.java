package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej18 {
    public static void main(String[] args) {
        String cadena;
        StringBuilder recortada = new StringBuilder();
        int max, contador = 0, restantes;
        StringTokenizer st;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();
        System.out.println("Introduzca un numero maximo de caracteres:");
        max = sc.nextInt();
        restantes = max;

        st = new StringTokenizer(cadena);

        while (st.hasMoreTokens() && contador < max) {
            String temporal = st.nextToken();

            if (temporal.length() <= restantes) {
                recortada.append(temporal).append(" ");
                restantes -= (temporal.length() + 1);
                contador += (temporal.length() + 1);
            } else {
                break;
            }
        }

        if (!recortada.isEmpty()) {
            recortada.setLength(recortada.length() - 1);
        }

        System.out.println(recortada);
    }
}
