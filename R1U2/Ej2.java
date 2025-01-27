package R1U2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int energia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de energia que le queda al traje de IronMan:");
        energia = sc.nextInt();

        if (energia >= 20){
            System.out.println("A tope jefe de equipo.");
        }else System.out.println("El traje no tiene suficiente energia para funcionar.");
    }
}
