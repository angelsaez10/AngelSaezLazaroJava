package EJERCICIOS;

import java.util.Scanner;

public class PrecioProductoBaseImponible {
    public static void main(String[] args) {
        //Ejercicio 18:Calcula el precio de un producto segun su tramo de IVA y su codigo promocional
        Scanner sc=new Scanner(System.in);

        //Variables
        double precioProducto;
        String IVA,descuento;

        System.out.println("¿Cual es el precio del producto?");
        precioProducto=sc.nextDouble();
        sc.nextLine();

        System.out.println("¿Que tipo de IVA se le aplica(general,reducido o superreducido)?");
        IVA=sc.nextLine();
        IVA=IVA.toLowerCase();

        System.out.println("¿Cual es el cogigo promocional(nopro,mitad,menos5 o descuento5)?");
        descuento=sc.nextLine();

        switch (IVA){
            case "general":
                precioProducto=precioProducto*0.79;
                break;

            case "reducido":
                precioProducto=precioProducto*0.90;
                break;

            case "superreducido":
                precioProducto=precioProducto*0.96;
                break;

            default:
                System.out.println("El valor introducido no es correcto");
        }

        switch (descuento){
            case "nopro":
                System.out.println("No hay ningun descuento activo.El precio del producto es de:"+precioProducto+"euros");
                break;

            case "mitad":
                precioProducto=precioProducto*0.5;
                System.out.println("Se ha activado el descuento mitad por lo que el precio de su producto sera de la mitad, es decir, de:"+precioProducto+"euros");
                break;

            case "menos5":
                precioProducto=precioProducto-5;
                System.out.println("Se ha activado el descuento menos5 por lo que el precio de su producto sera de 5 euros menos, es decir, de:"+precioProducto+"euros");
                break;

            case "descuento5":
                precioProducto=precioProducto*0.95;
                System.out.println("Se ha activado el descuento descuento5 por lo que el precio de su producto tendra un descuento del cinco porciento, es decir, de:"+precioProducto+"euros");
                break;

            default:
                System.out.println("El codigo promocional no es correcto por lo que el precio del producto no se vera mofificado");
                System.out.println("Total:"+precioProducto+"euros");
        }


    }
}
