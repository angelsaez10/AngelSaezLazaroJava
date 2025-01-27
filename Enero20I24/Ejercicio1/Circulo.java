package Enero20I24.Ejercicio1;

public class Circulo extends Figura{

    private double radio;

    public double calcularArea() {
        return Math.PI*(radio*radio);
    }

    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
