package RE2_ArraysUni;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej5 {
    public static void main(String[] args) {
        //String [] frase = new String[];
        String cadena;
        StringTokenizer st;
        int tokens=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        cadena = sc.nextLine();

        st = new StringTokenizer(cadena);
        tokens = st.countTokens();

        String [] frase = new String[tokens];

        for (int i = 0; i < tokens ; i++) {
            String temporal = st.nextToken();
            frase[i] = temporal;
        }

        System.out.println("Contenido del array:");
        for (String p : frase){
            System.out.print(p + ",");
        }



    }
}
