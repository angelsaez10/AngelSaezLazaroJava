package Enero09I10;

public class Vehiculo {
    private final int CAPACIDAD_DEPOSITO = 50;
    boolean estadoMotor;
    public static int nEncendidos;

    public Vehiculo (){
    }
    public void encender(){
        if (!estadoMotor){
            estadoMotor = true;
            System.out.println("Vehiculo encendido.");
            nEncendidos++;
        }else System.out.println("El vehiculo ya esta encendido.");
    }

    public void apagar(){
        if (estadoMotor){
            estadoMotor = false;
            System.out.println("El vehiculo se ha apagado.");
        }else {
            System.out.println("El vehiculo no esta encendido.");
        }
    }

    public static void main(String[] args) {
        Vehiculo v1 =new Vehiculo();
        Vehiculo v2 =new Vehiculo();
        Vehiculo v3 =new Vehiculo();

        System.out.println(nEncendidos);
        v1.encender();
        v1.encender();
        v1.apagar();
        v2.apagar();
        System.out.println(nEncendidos);

    }
}
