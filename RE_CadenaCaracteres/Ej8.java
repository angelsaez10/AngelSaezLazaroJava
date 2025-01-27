package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej8 {
    public static void main(String[] args) {
        String texto,find;
        StringBuilder results=new StringBuilder();
        StringTokenizer st;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un texto:");
        texto = sc.nextLine();
        System.out.println("Introduzca la palabra a buscar:");
        find = sc.nextLine();

        st=new StringTokenizer(texto);

        while (st.hasMoreTokens()) {

            String temporal= st.nextToken();

            if (temporal.contains(find)) {
                results.append(temporal).append(",");
            }
        }
        System.out.println(results);
    }
}
