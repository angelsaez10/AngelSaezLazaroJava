package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej12 {
    public static void main(String[] args) {
        String cadena;
        StringTokenizer st;

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        cadena = sc.nextLine();

        st = new StringTokenizer(cadena);

        System.out.println("La cadena se divide en:"+st.countTokens()+" tokens/palabras.");
    }
}
