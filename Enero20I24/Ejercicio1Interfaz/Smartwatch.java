package Enero20I24.Ejercicio1Interfaz;

public class Smartwatch implements Conectividad{
    //Atributos
    String marca;
    String modelo;

    String redWifi;
    boolean conectado = false;

    //Constructor
    public Smartwatch(String marca,String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodo que se conecta a una red wifi
    @Override
    public void conectar(String wifi) {
        if (conectado){
            System.out.println("Desconectandose de:"+redWifi+"...");
            redWifi = wifi;
            System.out.println("Conectandose a:"+redWifi+"...");
        }else {
            redWifi = wifi;
            System.out.println("Conectandose a:"+redWifi+"...");
            conectado = true;
        }

    }

    //Metodo que se desconecta de una red wifi
    @Override
    public void desconectar() throws IllegalArgumentException{
        if (conectado){
            System.out.println("Desconectandose de:"+redWifi+"...");
            conectado = false;
            redWifi = null;
        }else {
            throw new IllegalArgumentException("El dispositivo no esta conectado a ninguna red wifi");
        }
    }

    //MAIN
    public static void main(String[] args) {
        Smartwatch sw1 = new Smartwatch("Iphone","12 mini");

        sw1.conectar("Movistar wifi.");
        sw1.conectar("Orange wifi.");

        sw1.desconectar();
        try {
            sw1.desconectar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
