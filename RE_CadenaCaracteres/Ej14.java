package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        String web;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);


        while (!correcto) {
            System.out.println("Introduzca la direccion de la pagina web:");
            web = sc.nextLine();
            if (web.matches("(http)s?://(www.)?.*\\.com")) {
                System.out.println("Direccion correcta.");
                correcto = true;
            }else {
                System.err.println("La direccion introducida es incorrecta,pruebe de nuevo.");
            }
        }
    }
}
