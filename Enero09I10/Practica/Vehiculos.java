package Enero09I10.Practica;

import Enero09I10.Vehiculo;

public class Vehiculos {
    // Atributos del objeto vehiculo que no podran cambiar
    private final double CAPACIDAD_DEPOSITO_COMBUSTIBLE;
    private final double CONSUMO_MEDIO_VEHICULO;

    // Atributos del objeto vehiculo que podran variar siempre
    private boolean estadoMotor;
    private double nivelActualConbustible;
    private double kmsRecorridosDesdeUltimoArranque;
    private double consumoDesdeUltimoArranque;
    private double cantidadTotalKms;
    private double consumoTotal;

    // Atributos del objeto vehiculo que no podran cambiar
    private final double MINIMO_CONSUMO_MEDIO = 2.0;
    private final double MAXIMO_CONSUMO_MEDIO = 20.0;
    private final double MINIMA_CAPACIDAD_MEDIO = 10.0;
    private final double MAXIMA_CAPACIDAD_MEDIO = 120.0;
    private final double CONSUMO_ARRANQUE = 0.02;
    private final double VALOR_DEFECTO_CONSUMO_MEDIO = 5.0;
    private final double VALOR_DEFECTO_CAPACIDAD_DEPOSITO = 50.0;

    // Atributos de la clase que contendran informacion de todos los objetos
    private static double kmsTotalTodosVehiculos;
    private static double consumoTotalTodosVehiculos;
    private static int cochesEncendidosALaVez;

    // Constructor por defecto
    public Vehiculos() {
        this.CAPACIDAD_DEPOSITO_COMBUSTIBLE = VALOR_DEFECTO_CAPACIDAD_DEPOSITO;
        this.CONSUMO_MEDIO_VEHICULO = VALOR_DEFECTO_CONSUMO_MEDIO;
    }

    // Constructor parametrizado
    public Vehiculos(double capacidad, double consumo) throws IllegalArgumentException {
        if ((capacidad < MINIMA_CAPACIDAD_MEDIO || capacidad > MAXIMA_CAPACIDAD_MEDIO) ||
                (consumo < MINIMO_CONSUMO_MEDIO || consumo > MAXIMO_CONSUMO_MEDIO)) {
            throw new IllegalArgumentException("Argumentos para crear el vehículo con valores erróneos.");
        }

        this.CAPACIDAD_DEPOSITO_COMBUSTIBLE = capacidad;
        this.CONSUMO_MEDIO_VEHICULO = consumo;
    }

    // GETTERS -----------------------------------------------------------------------------------------------------------
    public boolean isArrancado() {
        return estadoMotor;
    }

    public double getCAPACIDAD_DEPOSITO_COMBUSTIBLE() {
        return CAPACIDAD_DEPOSITO_COMBUSTIBLE;
    }

    public double getCONSUMO_MEDIO_VEHICULO() {
        return CONSUMO_MEDIO_VEHICULO;
    }

    public double getNivelActualConbustible() {
        return nivelActualConbustible;
    }

    public double getKmsRecorridosDesdeUltimoArranque() {
        return kmsRecorridosDesdeUltimoArranque;
    }

    public double getCantidadTotalKms() {
        return cantidadTotalKms;
    }

    public double getConsumoDesdeUltimoArranque() {
        return consumoDesdeUltimoArranque;
    }

    public double getConsumoTotal() {
        return consumoTotal;
    }

    public static double getKmsTotalTodosVehiculos() {
        return kmsTotalTodosVehiculos;
    }

    public static double getConsumoTotalTodosVehiculos() {
        return consumoTotalTodosVehiculos;
    }

    public static int getCochesEncendidosALaVez() {
        return cochesEncendidosALaVez;
    }

    // ----------------------------------------------------------------------------------------------------------------------
    // Método para reponer combustible
    public void repostarCombustible(double litros) throws IllegalArgumentException {
        if (isArrancado()) {
            throw new IllegalArgumentException("No es posible reponer combustible mientras el coche esté encendido.");
        }
        if (litros < 0) {
            throw new IllegalArgumentException("No se puede repostar una cantidad negativa.");
        }
        if ((litros + nivelActualConbustible) > CAPACIDAD_DEPOSITO_COMBUSTIBLE) {
            double sobra = (litros + nivelActualConbustible) - CAPACIDAD_DEPOSITO_COMBUSTIBLE;
            double llena = CAPACIDAD_DEPOSITO_COMBUSTIBLE - nivelActualConbustible;
            nivelActualConbustible = CAPACIDAD_DEPOSITO_COMBUSTIBLE;
            throw new IllegalArgumentException("La cantidad que se desea repostar excede la capacidad máxima del depósito. Se han añadido " + llena + " litros y sobran " + sobra + " litros.");
        }

        nivelActualConbustible += litros;
        System.out.println("Se han repuesto " + litros + " litros de combustible.");
    }

    // Método para arrancar el coche
    public void arrancar() throws IllegalArgumentException {
        if (isArrancado()){
            throw new IllegalArgumentException("El vehiculo ya esta arrancado.");
        }
        estadoMotor = true;
        nivelActualConbustible -= CONSUMO_ARRANQUE;
        consumoTotal += CONSUMO_ARRANQUE;
        System.out.println("Vehículo arrancado.");
    }

    // Método para realizar un trayecto
    public void realizarTrayecto(double kms) throws IllegalArgumentException {
        if (kms < 0) {
            throw new IllegalArgumentException("Se ha introducido un parámetro erróneo. Cantidad de kilómetros negativa.");
        } else if (!isArrancado()) {
            throw new IllegalArgumentException("El motor del vehículo está apagado, no se puede realizar el viaje.");
        } else {
            double consumoRequerido = CONSUMO_MEDIO_VEHICULO * (kms / 100);

            if (consumoRequerido > nivelActualConbustible) {
                double kmsPosibles = (nivelActualConbustible / CONSUMO_MEDIO_VEHICULO) * 100;
                double kmsSinRecorrer = kms - kmsPosibles;
                nivelActualConbustible = 0;
                throw new IllegalArgumentException("El nivel actual del depósito no permite hacer el viaje completo. Recorrerá " + kmsPosibles + " kms y le faltarán " + kmsSinRecorrer + " kms por recorrer.");
            } else {
                nivelActualConbustible -= consumoRequerido;
                kmsRecorridosDesdeUltimoArranque += kms;
                consumoDesdeUltimoArranque += consumoRequerido;
                System.out.println("Trayecto realizado con éxito.");
            }
        }
    }

    // Método para reiniciar indicadores
    public void reiniciarIndicadores() throws IllegalArgumentException {
        if (!isArrancado()) {
            throw new IllegalArgumentException("El motor ya está apagado, no se llevará a cabo ninguna acción.");
        } else {
            estadoMotor = false;
            kmsRecorridosDesdeUltimoArranque = 0;
            consumoDesdeUltimoArranque = 0;
        }
    }

    // Método que muestra toda la información de un vehículo
    public String toString() {
        if (isArrancado()) {
            return "1. Estado del motor: encendido\t2. Nivel del depósito: " + getNivelActualConbustible() +
                    "\t3. Distancia recorrida: " + getKmsRecorridosDesdeUltimoArranque() +
                    "\t4. Consumo realizado: " + getConsumoDesdeUltimoArranque();
        } else {
            return "1. Estado del motor: apagado\t2. Nivel del depósito: " + getNivelActualConbustible() +
                    "\t3. Distancia recorrida: 0\t4. Consumo realizado: 0";
        }
    }


    // Método main
    public static void main(String[] args) throws IllegalArgumentException {
        Vehiculos v1 = new Vehiculos();

        v1.repostarCombustible(20);
        v1.arrancar();
        v1.realizarTrayecto(100);
        System.out.println(v1.toString());
    }
}
