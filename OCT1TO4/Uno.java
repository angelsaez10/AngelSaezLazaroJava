package OCT1TO4;
import java.util.Scanner;

public class Uno {
//public enumm sirve para una enumeracion que despues llamas como si fuera una funcion

    public enum DIAS{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Hola mundo");
        System.out.println("Dime tu Nombre:");
        String nombreT;
        nombreT= keyboard.next();
        int edad=20;
        double estatura=1.87;
        char inicial='A';
        String nombre="Angel Saez Lazaro";
        System.out.println("Nombre:"+nombre+"\nEdad:"+edad+"\nInicial del nombre:"+inicial+"\nEstatura:"+estatura);
        //System.out.println("El nombre proporcionado es:"+nombreT);
        DIAS diaLibre=DIAS.SABADO;
        System.out.println("Dia libre de la semana:"+diaLibre);
        System.out.println("Dime tu nombre:");
        nombreT= keyboard.next();
        String textoDeBienvenida="Hola ";
        String bienvenidaAlumno=textoDeBienvenida+nombreT;
        System.out.println(bienvenidaAlumno);
        int notaMates=10;
        int notaIngles=7;
        int notaLengua=5;
        int notaEconomia=8;
        int notaHistoria=10;
        int notaFilosofia=10;
        int media=(notaFilosofia+notaEconomia+notaMates+notaIngles+notaHistoria+notaLengua)/6;
        System.out.println("Nota de mates:"+notaMates+
                           "\nNota de Ingles:"+notaIngles+
                            "\nNota de Lengua:"+notaLengua+
                            "\nNota de Economia:"+notaEconomia+
                            "\nNota de Historia:"+notaHistoria+
                            "\nNota de Filosofia:"+notaFilosofia
                          );
        System.out.println("La nota media es:"+media);



    }
}
