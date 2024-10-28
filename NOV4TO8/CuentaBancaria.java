package NOV4TO8;

import java.util.Random;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double limiteRetiro;
    private double retiroDiarioAcumulado;

    //Constructores
    public CuentaBancaria(String t, double s, double l) {
        this.titular = t;
        this.saldo = s;
        this.limiteRetiro = l;
        this.retiroDiarioAcumulado = 0; // Siempre empieza en 0
        this.numeroCuenta = generarNumeroCuenta();
    }

    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.saldo = 0;
        this.limiteRetiro = 0;
        this.retiroDiarioAcumulado = 0;
        this.numeroCuenta = generarNumeroCuenta();
    }


    //Metodos
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingresar(double dinero) {
        if (dinero < 0) {
            System.out.println("Error. La cantidad de dinero es negativa.");
        } else {
            this.saldo += dinero;
        }
    }

    public boolean retirar(double dinero) {
        if (dinero <= 0) {
            System.out.println("No se puede retirar una cantidad de dinero negativa.");
            return false;

        } else if (dinero > this.saldo) {
            System.out.println("No hay dinero suficiente en la cuenta.");
            return false;

        } else if (dinero > this.limiteRetiro) {
            System.out.println("La cantidad a retirar sobrepasa el límite de retiro.");
            return false;

        } else if (dinero + this.retiroDiarioAcumulado > this.limiteRetiro) {
            System.out.println("Se ha superado la cantidad límite diaria de retiro.");
            return false;
        }

        this.saldo -= dinero;
        this.retiroDiarioAcumulado += dinero;
        return true;
    }

    public boolean transferir(double dinero , CuentaBancaria destino){
        if (dinero <= 0) {
            System.out.println("No se puede transferir una cantidad de dinero negativa.");
            return false;

        } else if (dinero > this.saldo) {
            System.out.println("No hay dinero suficiente en la cuenta.");
            return false;
        }

        this.saldo -= dinero;
        destino.ingresar(dinero);
        return true;
    }

    private String generarNumeroCuenta() {
        Random random = new Random();
        int numero = 10000000 + random.nextInt(90000000);
        return String.valueOf(numero);
    }

    public static void main(String[] args) {
        CuentaBancaria origen = new CuentaBancaria("Juan", 10000, 1000);
        CuentaBancaria destino = new CuentaBancaria("Angel", 0, 1000);

        System.out.println("Saldo de cuenta origen:"+origen.getSaldo());
        System.out.println("Saldo de cuenta destino:"+destino.getSaldo());

       origen.transferir(50 , destino);

        System.out.println("Saldo de cuenta origen:"+origen.getSaldo());
        System.out.println("Saldo de cuenta destino:"+destino.getSaldo());
    }
}
