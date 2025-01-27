package RE_CadenaCaracteres;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        String c1,c2;
        int i1,i2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena:");
        c1 = sc.nextLine();

        System.out.println("Introduzca un indice desde el que quiere que comience la cadena:");
        i1 = sc.nextInt();
        System.out.println("Introduzca un indice hasta el que quiere que termine la cadena:");
        i2 = sc.nextInt();

        c2 = c1.substring(i1,i2);
        System.out.println("Cadena resultante:"+c2);
    }
}
