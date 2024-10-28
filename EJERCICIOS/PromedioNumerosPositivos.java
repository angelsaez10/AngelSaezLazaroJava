package EJERCICIOS;

import java.util.Scanner;

public class PromedioNumerosPositivos {
    public static void main(String[] args) {

        //Variables
        int numero=1,suma=0,promedio,contador=0;

        Scanner sc= new Scanner(System.in);

        while (numero > 0){
            System.out.println("Introduzca un numero;");
            numero =sc.nextInt();
            sc.nextLine();
            if (numero > 0) {
                suma = numero + suma;
                contador++;
            }
        }
        promedio= suma/contador;
        System.out.println("El promedio de la suma es: "+promedio);
    }
}
