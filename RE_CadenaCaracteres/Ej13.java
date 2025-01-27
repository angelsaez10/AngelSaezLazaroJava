package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        String p1, p2;
        StringBuilder p3 = new StringBuilder();
        int c1 = 0, c2 = 0;
        String[] partes1;
        String[] partes2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una palabra:");
        p1 = sc.nextLine();
        System.out.println("Introduzca otra palabra:");
        p2 = sc.nextLine();

        partes1 = p1.split("");
        partes2 = p2.split("");


        while (c1 < partes1.length || c2 < partes2.length) {

            if (c1 < partes1.length) {
                p3.append(partes1[c1]);
                c1++;
            }

            if (c2 < partes2.length) {
                p3.append(partes2[c2]);
                c2++;
            }
        }

        System.out.println("Palabra combinada: " + p3);
    }
}
