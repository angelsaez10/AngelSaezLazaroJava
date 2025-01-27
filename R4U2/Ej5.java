package R4U2;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Ej5 {
    public static void main(String[] args) {
        int num = -1;
        Random r = new Random();
        int random = r.nextInt(10);
        Scanner sc = new Scanner(System.in);


        while (num != random){
            System.out.println("Adivina el numero aleatorio:");
            num = sc.nextInt();
            if (num != random){
                System.out.println("Oooooooooooh vaya fallaste");
            }
        }
        System.out.println("Cooooooorrectoooo.");
    }
}
