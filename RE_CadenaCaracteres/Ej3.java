package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de caracteres con espacios tanto al principio como al final.");
        frase = sc.nextLine();

        frase = frase.trim();
        System.out.println(frase);
    }
}
