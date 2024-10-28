package EJERCICIOS;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        //Ejercicio 12:Calcula el area de un cuadrado,rectangulo,ciculo o triangulo
        Scanner sc=new Scanner(System.in);
        String figura;
        double lado,base,altura,radio;
        final double pi=3.14159;
        System.out.println("De que figura geometrica deseas averiguar el area");
        figura= sc.nextLine();

        if (figura.equalsIgnoreCase("cuadrado")){
            System.out.println("¿Cual es la medida de uno de los lados(cm)?");
            lado=sc.nextDouble();

            System.out.println("El area del cuadrado es de:"+lado*lado+" cm2");

        } else if (figura.equalsIgnoreCase("rectangulo")) {
            System.out.println("¿Cual es la medida de la base(cm)?");
            base=sc.nextDouble();

            System.out.println("¿Cual es la medida de la altura(cm)?");
            altura=sc.nextDouble();

            System.out.println("El area del cuadrado es de:"+base*altura+" cm2");

        }else if (figura.equalsIgnoreCase("circulo")){
            System.out.println("¿Cual es el radio del circulo?");
            radio=sc.nextDouble();
            sc.nextLine();

            System.out.println("El area del circulo es de:"+pi*(radio*radio)+" cm2");

        }else if (figura.equalsIgnoreCase("triangulo")){
            System.out.println("¿Cual es la medida de la base(cm)?");
            base=sc.nextDouble();

            System.out.println("¿Cual es la medida de la altura(cm)?");
            altura=sc.nextDouble();

            System.out.println("El area del triangulo es de:"+(base*altura)/2+" cm2");
        }
    }
}
