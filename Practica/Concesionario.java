package Practica;

public class Concesionario {
    private String nombre;
    Vehiculos vehiculo;

    public Concesionario (String n){
        this.nombre=n;
        this.vehiculo=null;
    }

    public void agregarVehiculo(Vehiculos v){
        this.vehiculo = v;
    }

    public String mostrarInfoVehiculo(){
        return vehiculo.toString();
    }


    public static void main(String[] args) {
        Concesionario c1 = new Concesionario("El concesionario de Angel");

        Vehiculos v1= new Vehiculos("Honda","Civic",2022,14500,false);
        Vehiculos v2= new Vehiculos("Toyota","Hilux",2024,35000,true);
        Vehiculos v3= new Vehiculos("Bmw","E30",1999,54000,false);
        Vehiculos v4= new Vehiculos("Honda","Civic",2012,5000,false);
        Vehiculos v5= new Vehiculos("Rolls Royce","Cullinan",2023,135000,true);
        Vehiculos v6= new Vehiculos("Toyota","Supra",2004,36700,true);

        c1.agregarVehiculo(v1);
        c1.agregarVehiculo(v2);
        c1.agregarVehiculo(v3);
        c1.agregarVehiculo(v4);
        c1.agregarVehiculo(v5);
        c1.agregarVehiculo(v6);


    }
}