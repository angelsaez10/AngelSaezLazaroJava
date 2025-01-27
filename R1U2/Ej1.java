package R1U2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        String condicion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la condicion de tu personaje:");
        condicion = sc.nextLine();

        if (condicion.equalsIgnoreCase("digno")){
            System.out.println("Puede levantar el Mjolnir,");
        }else System.out.println("No puede levantar el Mjolnir.");
    }
}
