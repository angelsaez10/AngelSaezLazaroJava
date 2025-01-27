package Enero20I24.Ejercicio2;

public class Tren extends VehiculosTransporte{
    private double distanciaRecorrida;

    public Tren(String id,int ca,int pa,double co,double dR){
        super(id,ca,pa,co);
        distanciaRecorrida = dR;
    }

    public double calcularCostoViaje() {
        return super.calcularCostoViaje()*distanciaRecorrida;
    }

    public String mostrarInfoBasica() {
        return super.mostrarInfoBasica()+" | Distancia recorrida"+distanciaRecorrida;
    }


//MAIN-----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        VehiculosTransporte [] vehiculosTransportes = new VehiculosTransporte[5];

        Autobus a1 = new Autobus("Bus001",50,25,2);
        Taxi ta1 = new Taxi("Taxi001",4,3,5);
        Taxi ta2 = new Taxi("Taxi002",4,1,5);
        Tren tr1 = new Tren("Tren001",200,125,1.5,12.5);
        Autobus a2 = new Autobus("Bus002",50,40,2);

        vehiculosTransportes[0]=a1;
        vehiculosTransportes[1]=a2;
        vehiculosTransportes[2]=ta1;
        vehiculosTransportes[3]=ta2;
        vehiculosTransportes[4]=tr1;

        for (int i = 0; i < vehiculosTransportes.length ; i++) {
            System.out.println(vehiculosTransportes[i].mostrarInfoBasica());
        }



    }
}
