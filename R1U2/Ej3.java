package R1U2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int fuerza,ira;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nivel de fuerza de Hulk:");
        fuerza = sc.nextInt();

        System.out.println("Introduce el nivel de ira de Hulk:");
        ira = sc.nextInt();

        if (ira >= 70){
            fuerza *=2;
        }

        if (fuerza >= 90){
            System.out.println("Felicidades, Hulk ha derrotado a Thanos.");
        }else System.out.println("Malas noticias, Thanos gana la pelea.");
    }
}
