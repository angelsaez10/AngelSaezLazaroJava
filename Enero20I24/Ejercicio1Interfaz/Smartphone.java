package Enero20I24.Ejercicio1Interfaz;

public class Smartphone implements Conectividad,Multitarea{
    //Atributos
    String marca;
    String modelo;
    String [] aplicacionesAbiertas = new String[5];

    String redWifi;
    boolean conectado = false;

    //Constructor
    public Smartphone(String marca,String modelo){
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

    // Método que abre una aplicación
    @Override
    public void abrirAplicacion(String nombre) throws IllegalArgumentException {
        boolean espacioDisponible = false;

        // Verificar si hay espacio disponible para abrir la aplicación
        for (int i = 0; i < aplicacionesAbiertas.length; i++) {
            if (aplicacionesAbiertas[i] == null) {
                espacioDisponible = true;
                aplicacionesAbiertas[i] = nombre; // Abrir la aplicación en la primera posición vacía
                break; // Salir del bucle una vez que se ha abierto la aplicación
            }
        }

        // Si no hay espacio disponible, lanzar una excepción
        if (!espacioDisponible) {
            throw new IllegalArgumentException("Se ha alcanzado el número máximo de aplicaciones abiertas. Para abrir una nueva debe cerrar alguna aplicación.");
        }
    }

    // Método para cerrar una aplicación
    @Override
    public void cerrarAplicacion(String nombre) {
        boolean encontrado = false;

        // Buscar la aplicación a cerrar
        for (int i = 0; i < aplicacionesAbiertas.length; i++) {
            if (aplicacionesAbiertas[i] != null && aplicacionesAbiertas[i].equalsIgnoreCase(nombre)) {
                System.out.println("Cerrando aplicación: " + nombre + "...");
                aplicacionesAbiertas[i] = null; // Cerrar la aplicación encontrada
                encontrado = true;
                break; // Salir del bucle una vez que se ha cerrado la aplicación
            }
        }

        // Si no se encontró la aplicación, lanzar una excepción
        if (!encontrado) {
            throw new IllegalArgumentException("No se ha encontrado esa aplicación abierta.");
        }
    }

    // Método que muestra las aplicaciones abiertas
    @Override
    public void mostrarAplicacionesAbiertas() {
        boolean hayAplicaciones = false;

        // Iterar sobre el array de aplicaciones abiertas
        for (String aplicacionesAbierta : aplicacionesAbiertas) {
            int contador = 0;
            if (aplicacionesAbierta == null) {
                System.out.println((contador + 1) + "Vacio");
            } else {
                System.out.println((contador + 1) + aplicacionesAbierta);
                hayAplicaciones = true;
            }

        }

        // Si no hay aplicaciones abiertas, imprimir "Vacio"
        if (!hayAplicaciones) {
            System.out.println("Vacio");
        }
    }


    //MAIN
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Iphone","12 mini");

        s1.conectar("Movistar wifi.");
        s1.conectar("Orange wifi.");

        s1.desconectar();
        try {
            s1.desconectar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        s1.abrirAplicacion("Camara");
        s1.abrirAplicacion("Galeria");
        s1.abrirAplicacion("Instagram");

        try {
            s1.cerrarAplicacion("WhatsApp");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        s1.cerrarAplicacion("Camara");

        s1.mostrarAplicacionesAbiertas();




    }

}
