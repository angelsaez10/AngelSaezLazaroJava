package U1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        double lado,base,altura,untercio= (double) 1 /3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el tamaño de un lado de la base de la piramide:");
        lado = sc.nextDouble();

        System.out.println("Introduzca la altura de la piramide:");
        altura = sc.nextDouble();

        base = lado * lado;

        System.out.println(untercio);
        System.out.println("La altura de la piramide es de: "+altura);
        System.out.println("La base de la piramide es de: "+altura);
        System.out.println("Volumen de la piramide:"+(untercio*base*altura));
        System.out.println("Equivale a unas "+((untercio*base*altura)/2500)+" piscinas olimpicas aproximadamente.");

    }
}
