package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        String palabra1,palabra2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un palabra:");
        palabra1 = sc.nextLine();

        System.out.println("Introduzca otra palabra:");
        palabra2 = sc.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras son distintas");
        }

    }
}
