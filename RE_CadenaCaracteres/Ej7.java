package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        String c1,cEsta="",cSust="";
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena:");
        c1 = sc.nextLine();

        correcto = false;

        System.out.println("Introduzca el caracter que quiere sustituir:");
        cEsta = sc.nextLine();

        System.out.println("Introduce el caracter por el que lo quiere sustituir:");
        cSust = sc.nextLine();

        c1 = c1.replaceAll(cEsta,cSust);
        System.out.println(c1);
    }
}
