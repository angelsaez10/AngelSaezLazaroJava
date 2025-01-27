package R4U2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int num,cont = 0 ,impares = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantida de numeros impares que quiere imprimir:");
        num = sc.nextInt();

        System.out.println( num+" primeros numeros impares:");
        while (cont < num){
            System.out.print(impares+",");
            impares +=2;
            cont++;
        }
    }
}
