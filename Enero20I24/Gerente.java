package Enero20I24;

public class Gerente extends Empleado {
    protected double bono;

    public Gerente(String n, double s,double b) {
        super(n, s);
        bono = b;
    }

    public double calcularSalario(){
         return super.calcularSalario()+bono;
    }
}
