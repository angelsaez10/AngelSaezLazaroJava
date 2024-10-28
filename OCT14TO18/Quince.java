package OCT14TO18;

import java.util.Scanner;

public class Quince {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String diaSemana;
        String diaSemanaS;
        System.out.println("Dime un dia de la semana:");
        diaSemana=keyboard.nextLine();
        if (diaSemana.equalsIgnoreCase("sabado")){
            System.out.println("No laborable");
        } else if (diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("No laborable");
        }else {
            System.out.println("Laborable");
        }

        System.out.println("Dime un dia de la semana:");
        diaSemanaS= keyboard.nextLine();
        switch (diaSemanaS){
            case "sabado":
                System.out.println("No laborable");
                break;

            case "domingo":
                System.out.println("No laborable");
                break;

            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                break;

            default:
                String error = "ERROR";
        }


        //Ejercicio 1:Número entero múltiplo de 10
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int num= sc.nextInt();
        sc.nextLine();
        if (num%10==0){
            System.out.println("El numero es multiplo de 10.");
        }else {
            System.out.println("El numero no es multiplo de 10");
        }

        //Ejercicio 2:Dos numeros y compararlos
        System.out.println("Dime un numero");
        int num1= sc.nextInt();
        sc.nextLine();
        System.out.println("Dime otro numero:");
        int num2= sc.nextInt();
        sc.nextLine();
        if (num1>num2){
            System.out.println("El numero 1 es mayor que el numero 2.");
        } else if (num1<num2) {
            System.out.println("El numero 1 es menor que el numero 2.");
        }else if (num1==num2){
            System.out.println("Los numeros 1 y 2 son iguales.");
        }

        //Ejercicio 3:Carcater mayuscula o no
        System.out.println("Dame una letra en minuscula o en mayuscula.");
        char caracter = sc.next().charAt(0);
        if (caracter>='A'&&caracter<='Z'){
            System.out.println("El caracter es mayuscula.");
        } else if (caracter>='a'&&caracter<='z') {
            System.out.println("El caracter es minuscula");
        }else {
            System.out.println("El caracter introducido no es correcto");
        }

        //Ejercicio 4:Horario saludo
        System.out.println("¿Que hora es?");
        int hora= sc.nextInt();
        if (hora>=6&&hora<=12){
            System.out.println("Buenos dias.");
        } else if (hora>12&&hora<=20) {
            System.out.println("Buenas tardes.");
        }else {
            System.out.println("Buenas noches.");
        }


        //Ejercicio 5:Horoscopo
        System.out.println("Dime el dia en el que naciste:");
        int dia= sc.nextInt();
        sc.nextLine();
        System.out.println("¿De que mes?");
        String mes= sc.nextLine();
    if (dia>0&&dia<=19&&mes.equalsIgnoreCase("Enero")){
            System.out.println("Capricornio");
        }else if (dia>=20&&dia<=31&&mes.equalsIgnoreCase("Enero")){
            System.out.println("Acuario");
        } else if (dia>0&&dia<=18&&mes.equalsIgnoreCase("Febrero")) {
            System.out.println("Acuario");
        } else if (dia>18&&dia<=29&&mes.equalsIgnoreCase("Febrero")) {
            System.out.println("Piscis");
        } else if (dia>0&&dia<=20&&mes.equalsIgnoreCase("Marzo")) {
            System.out.println("Piscis");
        } else if (dia>20&&dia<=31&&mes.equalsIgnoreCase("Marzo")) {
            System.out.println("Aries");
        } else if (dia>0&&dia<=19&&mes.equalsIgnoreCase("Abril")) {
            System.out.println("Aries");
        }else if (dia>19&&dia<=30&&mes.equalsIgnoreCase("Abril")){
            System.out.println("Tauro");
        } else if (dia>0&&dia<=20&&mes.equalsIgnoreCase("Mayo")) {
            System.out.println("Tauro");
        }else if (dia>20&&dia<=31&&mes.equalsIgnoreCase("Mayo")) {
            System.out.println("Géminis");
        }else if (dia>0&&dia<=20&&mes.equalsIgnoreCase("Junio")) {
            System.out.println("Géminis");
        }else if (dia>20&&dia<=30&&mes.equalsIgnoreCase("Junio")) {
            System.out.println("Cáncer");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Julio")) {
            System.out.println("Cáncer");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Julio")) {
            System.out.println("Leo");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Agosto")) {
            System.out.println("Leo");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Agosto")) {
            System.out.println("Virgo");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Septiembre")) {
            System.out.println("Virgo");
        }else if (dia>22&&dia<=30&&mes.equalsIgnoreCase("Septiembre")) {
            System.out.println("Libra");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Octubre")) {
            System.out.println("Libra");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Octubre")) {
            System.out.println("Escorpio");
        }else if (dia>0&&dia<=21&&mes.equalsIgnoreCase("Noviembre")) {
            System.out.println("Escorpio");
        }else if (dia>21&&dia<=30&&mes.equalsIgnoreCase("Noviembre")) {
            System.out.println("Sagitario");
        }else if (dia>0&&dia<=21&&mes.equalsIgnoreCase("Diciembre")) {
            System.out.println("Sagitario");
        }else if (dia>21&&dia<=31&&mes.equalsIgnoreCase("Diciembre")) {
            System.out.println("Capricornio");
        }else if (dia>20&&dia<=31&&mes.equalsIgnoreCase("Mayo")) {
            System.out.println("Géminis");
        }else if (dia>0&&dia<=20&&mes.equalsIgnoreCase("Junio")) {
            System.out.println("Géminis");
        }else if (dia>20&&dia<=30&&mes.equalsIgnoreCase("Junio")) {
            System.out.println("Cáncer");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Julio")) {
            System.out.println("Cáncer");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Julio")) {
            System.out.println("Leo");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Agosto")) {
            System.out.println("Leo");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Agosto")) {
            System.out.println("Virgo");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Septiembre")) {
            System.out.println("Virgo");
        }else if (dia>22&&dia<=30&&mes.equalsIgnoreCase("Septiembre")) {
            System.out.println("Libra");
        }else if (dia>0&&dia<=22&&mes.equalsIgnoreCase("Octubre")) {
            System.out.println("Libra");
        }else if (dia>22&&dia<=31&&mes.equalsIgnoreCase("Octubre")) {
            System.out.println("Escorpio");
        }else if (dia>0&&dia<=21&&mes.equalsIgnoreCase("Noviembre")) {
            System.out.println("Escorpio");
        }else if (dia>21&&dia<=30&&mes.equalsIgnoreCase("Noviembre")) {
            System.out.println("Sagitario");
        }else if (dia>0&&dia<=21&&mes.equalsIgnoreCase("Diciembre")) {
            System.out.println("Sagitario");
        }else if (dia>21&&dia<=31&&mes.equalsIgnoreCase("Diciembre")) {
            System.out.println("Capricornio");
        }


    }

}

