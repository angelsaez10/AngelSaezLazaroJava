package SimulacroExamen;

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {
    Libro [] libros;
    int contadorLibros;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Biblioteca(int capacidad){
        libros =new Libro[capacidad];
        contadorLibros = 0;
    }

    //Metodos-----------------------------------------------------------------------------------------------------------
    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        if (contadorLibros < libros.length){
            libros [contadorLibros] = libro;
            contadorLibros++;
            System.out.println("Libro introducido correctamente.");
        }else System.out.println("La biblioteca esta llena.");
    }

    public void mostrarLibros(){
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("Libro "+(i+1));
            System.out.println(libros[i].toString());
        }
    }

    public void buscarPorAutor(String autor){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libros[i].toString());
            }
        }
    }

    public void prestarLibro(int indice){
        if (libros[indice].isPrestado()){
            System.out.println("El libro actualmente ya ha sido prestado.");
        }else {
            libros[indice].prestar();
            System.out.println("El libro esta disponible.Prestando..."+libros[indice].toString());

        }
    }

    public void devolverLibro(int indice){
        if (libros[indice].isPrestado()){
            System.out.println("El libro de ha devuelto con exito.");
            libros[indice].devolver();
        }else {
            System.out.println("No hay constancia de que ese libro haya sido prestado.");
        }
    }

    public void mostrarEstadisticas() {
        boolean hayPrestados = false;
        boolean hayNoPrestados = false;

        System.out.println("Estadísticas de la biblioteca:");
        System.out.println("Libros prestados:");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].isPrestado()) {
                System.out.println(libros[i].toString());
                hayPrestados = true;
            }
        }
        if (!hayPrestados) {
            System.out.println("No hay ningún libro prestado.");
        }

        System.out.println("\nLibros no prestados:");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && !libros[i].isPrestado()) {
                System.out.println(libros[i].toString());
                hayNoPrestados = true;
            }
        }
        if (!hayNoPrestados) {
            System.out.println("No hay libros que no estén prestados.");
        }
    }

    //----------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=800;
        System.out.println("De que tamaño desea realizar la biblioteca:");
        int tamaño = sc.nextInt();
        Biblioteca b1 = new Biblioteca(tamaño);
        System.out.println("Bienvenido al menu de la biblioteca:");
        while (opcion != 7){
            System.out.println();
            System.out.println("1 .Agregar un nuevo libro a la biblioteca.");
            System.out.println("2 .Mostrar todos los libros disponibles.");
            System.out.println("3 .Buscar libros por autor.");
            System.out.println("4 .Prestar un libro.");
            System.out.println("5 .Devolver un libro.");
            System.out.println("6 .Ver estadisticas.");
            System.out.println("7 .Salir del programa.");
            System.out.println("Introduzca la accion que desea realizar:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    sc.nextLine();
                    String titulo, autor;
                    System.out.print("Introduzca el título del libro: ");
                    titulo = sc.nextLine();
                    System.out.print("Introduzca el autor del libro:");
                    autor = sc.nextLine();
                    b1.agregarLibro(new Libro(titulo, autor));
                    break;

                case 2:
                    b1.mostrarLibros();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Introduzca el nombre del autor:");
                    String a = sc.nextLine();
                    b1.buscarPorAutor(a);
                    break;


                case 4:
                    System.out.println("Introduzca el indice del libro que quiere tomar prestado:");
                    int ind = sc.nextInt();
                    b1.prestarLibro(ind);
                    break;

                case 5:
                    System.out.println("Introduzca el indice del libro que quiere tomar prestado:");
                    int indice = sc.nextInt();
                    b1.devolverLibro(indice);
                    break;

                case 6:
                    b1.mostrarEstadisticas();
                    break;

                case 7:
                    System.out.println("Saliendo el sistema...");
                    break;

                default:
                    System.out.println("La opcion introducida es incorrecta, por favor pruebe de nuevo.");
            }
        }
    }
}
