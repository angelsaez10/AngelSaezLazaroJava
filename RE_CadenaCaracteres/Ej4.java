package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej4 {
    public static void main(String[] args) {
        String frase,prefijo,subfijo;
        int contador=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        frase = sc.nextLine();

        System.out.println("Introduzca el prefijo que quiere buscar:");
        prefijo = sc.nextLine();

        System.out.println("Introduzca el subfijo que quiere buscar:");
        subfijo = sc.nextLine();

        StringTokenizer st = new StringTokenizer( frase);
        while ( st.hasMoreTokens()){
            String temporal= st.nextToken();
            if (temporal.startsWith(prefijo)){
                System.out.println("Palabras que empiezan por '"+ prefijo+"':"+temporal);
            }
            if (temporal.endsWith(subfijo)){
                System.out.println("Palabras que terminan por '"+ subfijo+"':"+temporal);
            }
        }
    }
}
