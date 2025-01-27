package Enero20I24;

public class Coche extends Vehiculo{

    public void arrancar(){
        System.out.println("El coche se ha endencido.");
    }

    public void detener() {
        System.out.println("El coche se ha detenido.");
    }

    public static void main(String[] args) {
        Vehiculo [] lVehiculos = new Vehiculo[10];
        Coche c1 = new Coche();
        Motocicleta m1 = new Motocicleta();
        Coche c2 = new Coche();
        Motocicleta m2 = new Motocicleta();
        Coche c3 = new Coche();
        Motocicleta m3 = new Motocicleta();

        lVehiculos[0] = c1;
        lVehiculos[1] = m1;
        lVehiculos[3] = c2;
        lVehiculos[4] = m2;
        lVehiculos[5] = c3;
        lVehiculos[6] = m3;

    }
}
