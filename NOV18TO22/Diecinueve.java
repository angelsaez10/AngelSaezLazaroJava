package NOV18TO22;

import java.util.Scanner;

public class Diecinueve {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        boolean valido = false;

        while (!valido){

            System.out.println("Introduce un nombre con un espacio");
            String palabras = sc.nextLine();

            if (!palabras.isEmpty() && palabras.indexOf(" ") > 0 && palabras.charAt(palabras.length()-1) != ' ' ){
                System.out.println("Nombre valido.");
                valido = true;

            }else System.err.println("Nombre no valido.");
        }

    }

}
