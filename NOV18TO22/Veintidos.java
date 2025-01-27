package NOV18TO22;

import java.util.Scanner;

public class Veintidos {
    public static void main(String[] args) {
        String correo,hora;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su correo electronico:");
        correo = sc.nextLine();

        //Validar correo
        if (correo.matches("[a-zA-Z][A-Za-z0-9\\.\\-\\_]{2,14}@[a-zA-Z][A-Za-z0-9\\.\\-\\_]{0,59}\\.[a-zA-Z]{2,6}")){
            System.out.println("true");
        }else System.out.println("No es un correo electronico.");

        System.out.println("Introduzca una hora(hh:mm:ss).");
        hora = sc.nextLine();

        //Validar hora
        if (hora.matches("(2[0-3]|[0-1][0-9])+:([0-5][0-9])+:([0-5][0-9])")){
            System.out.println("La hora es correcta.");
        }else System.out.println("La hora es incorrecta");


    }
}
