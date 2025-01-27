package Enero20I24;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String n,double s){
        nombre = n;
        salario = s;
    }

    public double calcularSalario(){
        return salario;
    }

}
