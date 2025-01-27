package R1U2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        String c1,c2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una condicion del capi:");
        c1 = sc.nextLine();

        System.out.println("Introduce otra condicion del capi:");
        c2 = sc.nextLine();

        if ((c1.equalsIgnoreCase("valiente") && c2.equalsIgnoreCase("honesto"))
                || (c1.equalsIgnoreCase("honesto") && c2.equalsIgnoreCase("valiente"))){
            System.out.println("El capi es digno de liderar a los vengadores.");
        }else System.out.println("El capi no esta listo para liderar a los vengadores.");
    }
}
