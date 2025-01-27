package SimulacroExamen2;

import java.util.Scanner;

public class VideoClub {
    Pelicula[] catalogo;
    Cliente[] clientes;
    int contPeliculas,contClientes;

    //Constructores----------------------------------------------------------------------------------------------------
    public VideoClub(){
        catalogo = new Pelicula[10];
        clientes = new Cliente[5];
        contClientes = 0;
        contPeliculas= 0;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters-----------------------------------------
    public Pelicula[] getCatalogo() {
        return catalogo;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getContPeliculas() {
        return contPeliculas;
    }

    public int getContClientes() {
        return contClientes;
    }
        //Setters-----------------------------------------
    public void setCatalogo(Pelicula[] catalogo) {
        this.catalogo = catalogo;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public void setContPeliculas(int contPeliculas) {
        this.contPeliculas = contPeliculas;
    }

    public void setContClientes(int contClientes) {
        this.contClientes = contClientes;
    }
        //Otros------------------------------------------
    public void agregarPelicula(){
        Scanner sc = new Scanner(System.in);
        if (contPeliculas < catalogo.length){
            System.out.println("Introduzca el nombre de la pelicula:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el nombre del director:");
            String director = sc.nextLine();
            System.out.println("Introduzca el año de estreno de la pelicula:");
            int añoEstreno = sc.nextInt();
            catalogo[contPeliculas] = new Pelicula(nombre,director,añoEstreno);
            System.out.println("Pelicula introducida correctamente.");
            contPeliculas++;
        }else System.out.println("El catalogo de peliculas esta completo.");
    }

    public void registrarCliente(){
        Scanner sc = new Scanner(System.in);
        if (contClientes < clientes.length){
            System.out.println("Introduzca el nombre del cliente:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el numero de telefono del cliente:");
            String telefono = sc.nextLine();
            clientes[contClientes] =new Cliente(nombre,telefono);
            System.out.println("Cliente registrado correctamente");
            contClientes++;
        }else System.out.println("La lista de clientes esta completa.");
    }

    public void mostrarPeliculas(){
        System.out.println("Catalogo de peliculas:");
        for (int i = 0; i < contPeliculas; i++) {
            System.out.println((i+1)+catalogo[i].toString());
        }
    }

    public void mostrarClientes(){
        System.out.println("Lista de clientes:");
        for (int i = 0; i < contClientes; i++) {
            System.out.println(clientes[i].toString());
        }
    }

    public void alquilarP(Cliente c,Pelicula p){
        c.alquilarPelicula(p);
    }

    public void devolverP(Cliente c,Pelicula p){
        c.devolverPelivula(p);
    }

    //Main--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        VideoClub vC1 = new VideoClub();
        System.out.println("Menu video club");
        while(opcion != 7){
            System.out.println("1 .Agregar una pelicula al catalogo.");
            System.out.println("2 .Registrar un nuevo cliente.");
            System.out.println("3 .Alquilar una pelicula a un cliente.");
            System.out.println("4 .Devolver una pelicula.");
            System.out.println("5 .Mostrar todas las peliculas.");
            System.out.println("6 .Mostrar clientes y peliculas alquiladas.");
            System.out.println("7 .Salir.");
            System.out.println("Introduzca la opcion que desee realizar:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    vC1.agregarPelicula();
                    break;

                case 2:
                    vC1.registrarCliente();
                    break;

                case 3:
                    //vC1.alquilarP();
                    System.out.println("Actualmente no se pueden alquilar pelis.");
                    break;

                case 4:
                    System.out.println("Actualmente no se pueden devolver pelis.");
                    break;

                case 5:
                    vC1.mostrarPeliculas();
                    break;

                case 6:
                    vC1.mostrarClientes();
                    break;

                case 7:
                    System.out.println("Saliendo del programa.");
            }
        }
    }

}
