package Enero20I24.Ejercicio2;

public abstract class VehiculosTransporte {
    private  final String identificador;
    private final int capacidadMaxima;
    private int pasajeros;
    private final double costoPasajero;

    protected VehiculosTransporte(String id,int ca,int pa,double co){
        identificador = id;
        capacidadMaxima = ca;
        pasajeros = pa;
        costoPasajero = co;
    }

    public double calcularCostoViaje(){
        return costoPasajero*pasajeros;
    }
    public String mostrarInfoBasica(){
        return "Identificador:"+identificador+" | Capacidad maxima:"+capacidadMaxima+" | Costo por pasajero:"+costoPasajero+" euros | Coste total:"+calcularCostoViaje()+" euros";
    }

}
