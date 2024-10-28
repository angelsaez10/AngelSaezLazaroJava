package EJERCICIOS;

import java.util.Random;
public class NumeroAleatorioContarDigitos {
    public static void main(String[] args) {
        int aleatorio;
        int digitos;

        System.out.println("Generando numero aleatorio...");
        Random rm=new Random();
        aleatorio= rm.nextInt(100000);

        digitos=contarDigitos(aleatorio);
        System.out.println("El numero aleatorio es:"+aleatorio+" y tiene:"+digitos+" digitos");
    }

    //Hacemos una funcion para que nos calcule el numero de digitos que tiene nuestro numero aleatorio
    public static int contarDigitos(int aleatorio) {
        //Si el numero aleatorio es 0 solo puede tener un digito
        if (aleatorio==0){
            return 1;
        }

        //Iniciamos un entero contador que sera el encargado de llevar la cuenta de cuantas veces se puede dividir nuestro numero entre 10
        int contador=0;

        //Mientras el numero aleatorio sea mayor que 0 se dividira el numero entre 10 para ir eliminando el ultimo digito hasta llegar a 0
        //y sumara 1 al contador cada vez que el numero aleatorio se divida entre 10
        while (aleatorio>0){
            aleatorio /=10;
            contador++;
        }
        //return devolvera el valor almacenado en contador que sera la cantidad de digitos que hay en el numero aleatorio
        return contador;
    }
}
