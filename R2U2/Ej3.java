package R2U2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        String c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter:");
        c = sc.nextLine();

        String cMin=c.substring(0,1).toLowerCase();

        if (cMin.equals(c.substring(0,1))){
            System.out.println("El caracter se encuentra en minuscula.");
        }else System.out.println("El caracter se encuentra en mayuscula.");

    }
}
