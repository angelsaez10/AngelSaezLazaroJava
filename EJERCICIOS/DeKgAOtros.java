package EJERCICIOS;

import java.util.Scanner;

public class DeKgAOtros {
    public static void main(String[] args) {
        //Variables
        String medida;
        double kilos;

        Scanner sc=new Scanner(System.in);

        System.out.println("---Programa para pasar Kg---");
        System.out.println("--kg--hg--dag----g----dg--cg--mg--");
        System.out.println("¿A que unidad quieres pasar los kilos?");
        medida= sc.nextLine();
        medida=medida.toLowerCase();

        System.out.println("¿Cuantos kilos quieres pasar a "+medida);
        kilos= sc.nextInt();
        sc.nextLine();

        switch (medida){
            case "hg":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*10+"hg");
                break;

            case "dag":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*100+"dag");
                break;

            case "g":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*1000+"g");
                break;

            case "dg":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*10000+"dg");
                break;

            case "cg":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*100000+"cg");
                break;

            case "mg":
                System.out.println("La conversion de "+kilos+"kg a "+medida+" es de "+kilos*1000000+"mg");
                break;

            case "kg":
                System.out.println("La medida introducida es igual a la medida requerida, por favor eliga otra unidad de medida para la conversion");

            default:
                System.out.println("La medida introducida no es correcta");
        }


    }
}
