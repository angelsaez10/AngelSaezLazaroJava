package OCT7TO11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        //Ejercicio 7.1:Obten el primer y el ultimo caracter
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Escribe una cadena por teclado:");
        String cadena= keyboard.nextLine();
        System.out.println("Este es el primer caracter:"+cadena.charAt(0)+" y este es el ultimo: "+cadena.charAt(cadena.length()-1));

        //Ejercicio 7.2:longitud de una cadena
        System.out.println("Imprime una cadena de la longitud que quieras:");
        String cadena1= keyboard.nextLine();
        System.out.println("La longitud de la cadena es de "+cadena1.length()+" caracteres");

        //Ejercicio 7.3:Convertir a mayusculas y minusculas
        System.out.println("Escribe una cadena por teclado:");
        String cadena2= keyboard.nextLine();
        System.out.println("La cadena en mayusculas es: "+ cadena2.toUpperCase());
        System.out.println("La cadena en minusculas es: "+ cadena2.toLowerCase());

        //Ejercicio 7.3:Extraer una subcadena
        System.out.println("Escribe una cadena por teclado:");
        String cadena3= keyboard.nextLine();
        System.out.print("Dame el numero desde el que quieres que empiece la subcadena:");
        int num1= keyboard.nextInt();
        System.out.print("Dame el numero hasta el que quieres que coja la subcadena:");
        int num2= keyboard.nextInt();
        //.substring(,) coge una subcadena de la cadena original desde la posicion que le pongas antes de la coma hasta la que le pongas despues de la coma
        String subcadena=cadena3.substring(num1,num2);
        String valido=(num2 < cadena3.length() && num1 < num2)? "La subcadena es: "+subcadena:"Los parametros introducidos son incorrectos";
        System.out.println( valido);

        //Ejercicio 7.4:Eliminar espacios en blanco
        System.out.println("Escribe una cadena con mas de dos palabras:");
        String cadena4= keyboard.nextLine();
        //.replaceAll sirve para reemplazar el caracter que pongas antes de la coma por el que pongas despues de la coma
        String cadenaSinEspacios=cadena4.replaceAll(" ", "");
        System.out.println(cadenaSinEspacios);

    }
}
