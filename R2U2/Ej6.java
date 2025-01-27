package R2U2;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        double precioCompra,precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el importe total de su compra:");
        precioCompra = sc.nextDouble();

        if (precioCompra >= 300){
           precioFinal = precioCompra * 0.8;
            System.out.println("Su compra superaba los 300euros por lo cual ha recibido un desuento del 20% y el precio de" +
                    "su compra pasa de "+precioCompra+"euros a "+precioFinal+"euros.");
        }else  {
            precioFinal = precioCompra;
            System.out.println("Su compra no superaba los 300euros por lo que no se le ha aplicado ningun descuento y el " +
                    "total de su compra es de "+precioCompra+"euros.");
        }

    }
}
