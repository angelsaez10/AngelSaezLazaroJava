package RepasoPOO;

import java.util.Scanner;

import static EJERCICIOS.PedirFechaCorrecta.esBisiesto;

public class Fecha {
    int dia;
    int mes;
    int año;

    //Constructores-----------------------------------------------------------------------------------------------------
   //1
    public Fecha(){
        this.dia=1;
        this.mes=1;
        this.año=1900;
    }

    //2
    public Fecha(int d,int m,int a){
        this.dia=d;
        this.mes=m;
        this.año=a;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------------------------------------------------------------------
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    //Setters-------------------------------------------------------------------------------------------------------
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
        //Else----------------------------------------------------------------------------------------------------------
    //1
    public void leer(int d,int m){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dia:");
        d = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el mes");
        m = sc.nextInt();

        if (d > 0 && d < 32){
            this.dia = d;
            System.out.println("Dia correcto");
            if (m > 0 && m < 13){
                this.mes = m;
                System.out.println("Mes correcto");
                System.out.println();
            }else {
                this.mes = 0;
                System.err.println("El numero del mes debe ser un numero del 1 al 12");
            }
        }else {
            this.dia = 0;
            System.err.println("El numero del dia debe ser un numero del 1 al 31");
        }
    }

    //2
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && (año % 100 != 0 || (año % 100 == 0 && año % 400 == 0)));
    }
    //3
    public int diaMes(int mes){
        System.out.println("Mes:"+mes);
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.print("Dias:");
            return 31;
        } else if (mes == 2) {
            if (esBisiesto(mes)) {
                System.out.print("Dias:");
                   return 29;
            } else {
                System.out.print("Dias:");
                    return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.print("Dias:");
                return 30;
        }else return 0;
    }
    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Fecha f1= new Fecha(25,7,2004);

       f1.leer(25,07);

        esBisiesto(f1.año);
        System.out.println(f1.diaMes(5));
    }
}
