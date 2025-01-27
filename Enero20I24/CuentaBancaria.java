package Enero20I24;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double s) throws IllegalArgumentException{
        if (s < 0){
            throw new IllegalArgumentException("El saldo de la cuenta no puede ser negativo");
        }else saldo = s;
    }

    public void depositar(double cantidad) throws IllegalArgumentException{
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad a ingresar no puede ser negativa.");
        }else {
            saldo += cantidad;
            System.out.println("Se han ingresado "+cantidad+" euros correctamente");
        }
    }

    public void retirar(double cantidad) throws IllegalArgumentException{
        if (cantidad > saldo){
            throw new IllegalArgumentException("La cantidad a retirar excede la cantidad de saldo actual.");
        }else {
            saldo -= cantidad;
            System.out.println("Se han retirado "+cantidad+" euros correctamente");
        }
    }
}
