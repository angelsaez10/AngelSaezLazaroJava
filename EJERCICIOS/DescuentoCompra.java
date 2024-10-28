package EJERCICIOS;

import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        //Ejercicio 6:Calcula el descuento que se le hara a un cliente(20%) si su compra pasa de los 300 euros
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Cuanto es el total de su compra?");
        //BigDecimal se usa para calcular de la manera mas precisa posible un numero cuando este tiene decimales y se ha de operar con ese numero
        double totalCompra=sc.nextDouble();
        sc.nextLine();

        if (totalCompra>=300.00){
           double descuento=totalCompra*0.8;
            System.out.println("El precio final es de: "+ descuento+", y se ha ahorrado: "+totalCompra*0.2+"euros");

        }else {
            System.out.println("Su compra es inferior a 300euros por lo tanto no recibira nigun descuento y el precio final de su compra sera: "+totalCompra+"euros");
        }

    }
}
