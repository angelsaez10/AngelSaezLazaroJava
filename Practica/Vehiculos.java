package Practica;

public class Vehiculos {
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private boolean vendido;

    //Constructores-----------------------------------------------------------------------------------------------------
    //1
    public Vehiculos(String ma,String mo,int a,double p,boolean v){
        this.marca=ma;
        this.modelo=mo;
        this.año=a;
        this.precio=p;
        this.vendido=v;
    }

    //2
    public Vehiculos(){
        this.marca=null;
        this.modelo=null;
        this.año=0;
        this.precio=0;
        this.vendido=false;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
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
    public double getPrecio() {
        return precio;
    }

    //5
    public boolean isVendido() {
        return vendido;
    }
        //Setters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
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
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //5
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    //Else- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void venderCoche(boolean v){
        if (v = true){
            this.vendido = true;
            System.out.println("Coche vendido");
        }else {
            this.vendido=false;
        }
    }

    public  void rebajarPrecioVehiculo(int descuento){
        if (this.vendido = false){
            this.precio =  this.precio*(1-(descuento/100));
        }else {
        }
    }

    public String toString(){
        return this.marca+" - "+this.modelo+" - "+this.año+" - "+this.precio+" - "+this.vendido;
    }


    public static void main(String[] args) {
        Vehiculos v1= new Vehiculos("Honda","Civic",2022,14500,false);

        v1.toString();
    }
}
