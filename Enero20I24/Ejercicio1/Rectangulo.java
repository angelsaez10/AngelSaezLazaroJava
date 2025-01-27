package Enero20I24.Ejercicio1;

public class Rectangulo extends Figura{

    private double base,altura;

    public double calcularArea() {
        return base*altura;
    }

    public Rectangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double calcularPerimetro() {
        return base*2+altura*2;
    }

}
