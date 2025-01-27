package Enero20I24.Ejercicio1;

public class Triangulo extends Figura{

    private double base,altura;
    private double lado1,lado2,lado3;

    public double calcularArea() {
        return (base*altura)/2;
    }

    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }
}
