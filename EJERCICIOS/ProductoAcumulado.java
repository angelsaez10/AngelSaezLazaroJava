package EJERCICIOS;

import java.util.Scanner;

public class ProductoAcumulado {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        int num=1,contador=1;

        while (num!=0){
            num=num-1;
            System.out.print("introduzca un numero:");
            num=sc.nextInt();
            sc.nextLine();

            if (num!=0) {
                contador = contador * num;
            }
        }

        System.out.println("Producto acumulado:"+contador);
    }
}
