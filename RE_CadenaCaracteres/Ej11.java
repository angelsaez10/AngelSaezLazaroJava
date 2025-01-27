package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        String cadena1,cadena2;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de cacteres:");
        cadena1 = sc.nextLine();
        System.out.println("Introduzca otra cadena de caracteres");
        cadena2 = sc.nextLine();

        resultado = cadena1.compareTo(cadena2);

        if (resultado < 0){
            System.out.println("''"+cadena1 + "''" + " va antes que " + "''" +cadena2 + "''");
        } else if (resultado > 0) {
            System.out.println("''"+cadena2 + "''" + " va antes que " + "''" +cadena1 + "''");
        }else System.out.println("Las cadenas son identicas.");
    }
}
