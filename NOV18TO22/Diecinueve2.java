package NOV18TO22;

import java.util.Scanner;

public class Diecinueve2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2;
        float resultado;
        boolean division= false;

        while (!division) {
            try {
                System.out.println("Introduce un numero:");
                n1 = sc.nextInt();

                System.out.println("Introduce otro numero:");
                n2 = sc.nextInt();

                resultado = (float) n1 / n2;
                System.out.println("El resultado es " + n1 / n2);
                division = true;

            } catch (ArithmeticException a) {
                System.err.println("Error haciendo la division: " + a.getMessage());
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
