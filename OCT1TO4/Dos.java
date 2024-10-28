package OCT1TO4;
import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {

        int edadAlumno1=45;
        int edadAlumno2=40;
        boolean dniAlumno1=false;

        System.out.println("La suma de las dos edades: "+(edadAlumno1+edadAlumno2));
        System.out.println("La resta de las dos edades: "+(edadAlumno1-edadAlumno2));
        System.out.println("La multiplicacion de las dos edades: "+(edadAlumno1*edadAlumno2));
        System.out.println("La suma de las dos division: "+(edadAlumno1/edadAlumno2));
        System.out.println("El resto de la division de las dos edades: "+(edadAlumno1%edadAlumno2));


        if (edadAlumno1==edadAlumno2){
            System.out.println("\nLas edades coinciden");
        }else {System.out.println("\nLas edades no coinciden");
        }

        if (edadAlumno1<edadAlumno2){
            System.out.println("El alumno 1 es menor que el alumno 2");
        }else {
            System.out.println("El alumno 1 es mayor que el alumno 2");
        }

        if (edadAlumno1==edadAlumno2 && edadAlumno1>30){//&& para and(puerta logica)
            System.out.println("Los alumnos tienen la misma edad y esta es mayor de 30 años");
        }else {
            System.out.println("No tienen la misma edad");
        }

        boolean verdadero=true;
        boolean falso=false;
        System.out.println(verdadero);
        System.out.println(!verdadero);

        //Se tienen que cumplir que las dos sean iguales para que de true
        System.out.println(verdadero&&verdadero);

        //&& para and ; ! para not ; || para or ; ^ para XOR ; ? para un if

        String cadena= ((edadAlumno1>edadAlumno2) ? "El alumno 1 es mas viejo" : "El alumno 2 es mas viejo");
        System.out.println(cadena+"\n");


        if ((edadAlumno1>18)&&(dniAlumno1==true)){
            System.out.println("Puedes entrar");
        }else {
            System.out.println("No puedes entrar");
        }

        String entrar=((edadAlumno1>18)&&(dniAlumno1==true))? "Puedes entrar" : "No puedes entrar";
        System.out.println( entrar);

        Scanner keyboard= new Scanner(System.in);
        System.out.println("Escribe algo por teclado:");
        String teclado= keyboard.nextLine();

        System.out.println("Lo que has introducido es:" + teclado);

        System.out.println("Dame un numero:");
        int numero=keyboard.nextInt();
        System.out.println("El numero introducido es:"+ numero);

        System.out.println("Dame un numero con decimales:");
        double numeroD=keyboard.nextDouble();
        System.out.println("El numero introducido es:"+numeroD);


        //CALCULADORA

        System.out.println("Introduce el numero 1:");
        int numero1= keyboard.nextInt();
        System.out.println("Introduce el numero 2:");
        int numero2= keyboard.nextInt();

        System.out.println("La suma de el numero "+numero1+" mas el numero "+numero2 + " es igual a "+ (numero1+numero2));
        System.out.println("La resta de el numero "+numero1+" menos el numero "+numero2 + " es igual a "+ (numero1-numero2));
        System.out.println("La multiplicacion de el numero "+numero1+" por el numero "+numero2 + " es igual a "+ (numero1*numero2));
        System.out.println("La division de el numero "+numero1+" entre el numero "+numero2 + " es igual a "+ (numero1/numero2));


        System.out.println("Dame un numero:");
        double num1= keyboard.nextInt();
        System.out.println("Dame otro numero:");
        double num2= keyboard.nextInt();
        System.out.println("Dame otro numero:");
        double num3= keyboard.nextInt();
        System.out.println("La media de esos tres numeros es: "+(num1+num2+num3)/3);



    }
}
