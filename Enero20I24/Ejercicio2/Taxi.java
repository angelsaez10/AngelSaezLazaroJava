package Enero20I24.Ejercicio2;

public class Taxi extends VehiculosTransporte{
    private final double tarifaFija=10;

    public Taxi(String id,int ca,int pa,double co){
        super(id,ca,pa,co);
    }

    public double calcularCostoViaje() {
        return super.calcularCostoViaje()+tarifaFija;
    }

    public String mostrarInfoBasica() {
        return super.mostrarInfoBasica();
    }
}
