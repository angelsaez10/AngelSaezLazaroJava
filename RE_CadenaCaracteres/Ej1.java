package RE_CadenaCaracteres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej1 {
    public static void main(String[] args) {
        String nombreCompleto,nombre,apellido1,apellido2,apellido3;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca su nombre completo:");
        nombreCompleto = sc.nextLine();

        StringTokenizer sT = new StringTokenizer(nombreCompleto);
        nombre = sT.nextToken();
        apellido1 = sT.nextToken();
        apellido2 = sT.nextToken();

        if (sT.hasMoreTokens()){
            apellido3 = sT.nextToken().toUpperCase();
            System.out.println(nombre.toUpperCase().substring(0,1)+apellido1.toUpperCase().substring(0,1)+apellido2.toUpperCase().substring(0,1)+apellido3.toUpperCase().substring(0,1));
        }
        else {
            System.out.println(nombre.toUpperCase().substring(0,1)+apellido1.toUpperCase().substring(0,1)+apellido2.toUpperCase().substring(0,1));
        }










    }
}
