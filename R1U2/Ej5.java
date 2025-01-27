package R1U2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int sigilo;
        String disfraz;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nivel de sigilo de la viuda negra:");
        sigilo = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Tiene la viuda negra un disfraz de hydra?");
        disfraz = sc.nextLine();

        if (sigilo >= 85 || disfraz.equalsIgnoreCase("si")){
            System.out.println("Felicidades, la viuda negra se ha infiltrado en hydra.");
        }else System.out.println("Malas noticias, han descubierto a la viuda negra.");
    }
}
