package NOV18TO22;

import java.util.Scanner;

public class Diecinueve3 {
    public static void main(String[] args) {
        String palabra,min,reverse;
        boolean palindromo= false;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una palabra para commprobar si es palindromo:");
        palabra = sc.nextLine();
        min = palabra.toLowerCase();

        for (int i= 0 ; i < min.length() ; i++){
            if ((min.charAt(i) >= 'a' && min.charAt(i) <= 'z') &&
                    (min.charAt(i) != 'ñ' || min.charAt(i) != 'Ñ')){
                i++;
            }else {
                System.out.println("La palabra contiene caracteres especiales.Introduzca un palabra que solo contenga letras ");
                return;
            }
        }

        reverse = new StringBuilder(min).reverse().toString();

        if (min.equals(reverse)){
            palindromo = true;
            System.out.println("La palabra es palindroma.");
        }else System.out.println("La palabra no es palindroma.");
    }
}
