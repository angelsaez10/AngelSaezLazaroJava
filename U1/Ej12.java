package U1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej12 {
    public static void main(String[] args) {
        String nombreCompleto,nombre,apellido1,apellido2;
        StringTokenizer st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        nombreCompleto = sc.nextLine();

        st = new StringTokenizer(nombreCompleto);

       nombre = st.nextToken();
       apellido1 = st.nextToken();
       apellido2 = st.nextToken();

        if ( nombre.substring(0,1).equalsIgnoreCase(nombre.substring(nombre.length()-1)) && apellido1.length() == apellido2.length()){
            System.out.println("Apto/a");
        }else System.out.println("No apto/a");

    }
}
