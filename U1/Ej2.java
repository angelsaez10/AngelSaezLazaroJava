package U1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double uno,dos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        uno = sc.nextDouble();

        System.out.println("Introduce otro numero:");
        dos = sc.nextDouble();

        System.out.println("El doble del segundo numero es:"+(dos*2));
        System.out.println("La tercera parte del primer numero eso:"+(uno/3));
        System.out.println("El cuadrado de la suma de ambos numero es:"+(uno+dos)*(uno+dos));
        System.out.println("La decima parte de la suma de los cuadrados de ambos numero es:"+((uno*uno)+(dos*dos))/10);
    }
}
