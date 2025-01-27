package RepasoPOO;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Coche {
    String marca;
    String modelo;
    int año;
    double kilometraje;
    String color;

    //Constructores-----------------------------------------------------------------------------------------------------
    //1
    public Coche(){
        this.marca=null;
        this.modelo=null;
        this.año=0;
        this.kilometraje=0;
        this.color=null;
    }

    //2
    public Coche(String ma,String mo){
        this.marca=ma;
        this.modelo=mo;
        this.año=0;
        this.kilometraje=0;
        this.color=null;
    }

    //3
    public Coche(String ma,String mo,int a,String co){
        this.marca=ma;
        this.modelo=mo;
        this.año=a;
        this.kilometraje=0;
        this.color=co;
    }


    //4
    public Coche(String ma,String mo,int a,double k,String co){
        this.marca=ma;
        this.modelo=mo;
        this.año=a;
        this.kilometraje=k;
        this.color=co;
    }

//Métodos---------------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------------------------------------------------------------------
    //1
    public String getMarca() {
        return marca;
    }

    //2
    public String getModelo() {
        return modelo;
    }

    //3
    public int getAño() {
        return año;
    }

    //4
    public double getKilometraje() {
        return kilometraje;
    }

    //5
    public String getColor() {
        return color;
    }

        //Setters-------------------------------------------------------------------------------------------------------
    //1
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //2
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //3
    public void setAño(int año) {
        this.año = año;
    }

    //4
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    //5
    public void setColor(String color) {
        this.color = color;
    }

        //Else----------------------------------------------------------------------------------------------------------
    //1
    public String conducir(double km){
        if (km > 0){
            this.kilometraje += km;
        }else {
            System.err.println("Los kilometros introducidos son una cantidad negativa.Introduzca un cantidad positiva.");
        }
        return "Se han añadido "+km+"kms de conducion.Ahora el total es de "+this.kilometraje+"kms";
    }

    //2
    public String pintarCoche(String color){
        this.color = color;
        return "El color del coche ahora es "+this.color ;
    }

    //3
    public String mostrarInfo(){
        return this.marca+" - "+this.modelo+" - "+this.año+" - "+this.kilometraje+" - "+this.color;
    }

    //4
    public String esAntiguo(){
        boolean antiguo= false;
        int añoActual= Year.now().getValue();

        if (añoActual - this.año > 10 ){
            antiguo = true;
            return "El coche es mayor de 10 años por lo que se considera un coche antiguo";
        }else return "El coche es menor de 10 años por lo que no se considera un coche antiguo";
    }

    //5
    public  String revision(){
        if (this.kilometraje > 100000){
            return "El coche necesita revision";
        }else return "El coche no necesita revision";
    }

    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Coche c1= new Coche("Toyota","Corolla",2022,54000,"Azul");

        System.out.println(c1.mostrarInfo());

        System.out.println(c1.conducir(-300));

        System.out.println(c1.pintarCoche("Negro"));

        System.out.println(c1.esAntiguo());

        System.out.println(c1.revision());

        System.out.println( c1.mostrarInfo());
    }

}
