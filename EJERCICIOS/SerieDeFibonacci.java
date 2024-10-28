package EJERCICIOS;

import java.util.Scanner;

public class SerieDeFibonacci {
    public static void main(String[] args) {

        //Variables
        long  terminos,a = 0,b = 1,c = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el numero de terminos:");
            terminos = sc.nextInt();
        }while ( terminos < 0);

        System.out.print(a+","+b);


        for (long i=3 ; terminos > c ; i++){
                    c = a + b;
                    System.out.print("," + c);
                    a = b;
                    b = c;
        }
    }
}