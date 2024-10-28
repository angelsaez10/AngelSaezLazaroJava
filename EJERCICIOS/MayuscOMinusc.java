package EJERCICIOS;

import java.util.Scanner;

public class MayuscOMinusc {
    public static void main(String[] args) {
        //Ejercicio 3:Carcater mayuscula o no
        Scanner sc=new Scanner(System.in);

        System.out.println("Dame una letra en minuscula o en mayuscula.");
        char caracter = sc.next().charAt(0);

        if (caracter>='A'&&caracter<='Z'){
            System.out.println("El caracter es mayuscula.");

        } else if (caracter>='a'&&caracter<='z') {
            System.out.println("El caracter es minuscula");

        }else {
            System.out.println("El caracter introducido no es correcto");
        }
    }
}
