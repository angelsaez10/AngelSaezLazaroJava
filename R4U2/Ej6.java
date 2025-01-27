package R4U2;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        String guess="";
        String correcta= "Angel";
        Scanner sc = new Scanner(System.in);
        while (!guess.equals(correcta)){
            System.out.println("Introduce la contraseña:");
            guess = sc.nextLine();

            if (!guess.equals(correcta)){
                System.out.println("Oooooh vaya esa no era la contraseña correcta,");
            }
        }
        System.out.println("Has adivinado la contraseña correcta.");
    }
}
