package Enero20I24;

public class CuentaAhorros extends CuentaBancaria{
    protected double tasaDeIntereses;

    public CuentaAhorros(double s,double t){
        super(s);
        tasaDeIntereses = t;
    }

    public String calcularInterese(){
        return "El saldo final con los intereses aplicados es de "+(saldo-(saldo*tasaDeIntereses/100))+" euros";
    }

    public static void main(String[] args) {
        CuentaAhorros c1 = new CuentaAhorros(1200,10);

        System.out.println(c1.calcularInterese());
    }
}
