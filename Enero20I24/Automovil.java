package Enero20I24;

public class Automovil {
    private Motor motor;

    public Automovil(Motor m){
        motor = m;
    }

    public String mostrarInfoMotor(){
        return motor.mostrarDetalles();
    }


}
