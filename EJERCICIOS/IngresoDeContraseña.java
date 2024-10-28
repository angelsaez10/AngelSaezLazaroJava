package EJERCICIOS;

import java.util.Scanner;

public class IngresoDeContraseña {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Variables
        String contraseña,entrada;

        contraseña="Daw2425";

        entrada="";

        while (!entrada.equals(contraseña)){
            System.out.println("Introduzca la contraseña:");
            entrada= sc.nextLine();

            if (!entrada.equals(contraseña)){
                System.out.println("Incorrecto,pruebe de nuevo");
            }
        }
        System.out.println("Contraseña correcta.1");
    }
}
