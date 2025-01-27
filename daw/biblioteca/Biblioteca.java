package daw.biblioteca;

public class Biblioteca {
    private String nombre;
    private Libro libro1;
    private Libro libro2;

    //Constructores
    public Biblioteca(String n){
        this.nombre=n;
        this.libro1=null;
        this.libro2=null;
    }

    //Métodos
    public  void agregarLibro(Libro libro){
         if (libro1 == null){
             libro1=libro;
         } else if (libro2 == null) {
             libro2=libro;
         }else System.out.println("Ya se han asignado el numero maximo de libros para esta biblioteca");
    }

    public void imprimeBiblioteca(){
        if (libro1 != null){
            System.out.println(this.libro1.getInfoLibro());
        }

        if (libro2 != null ) {
            System.out.println(this.libro2.getInfoLibro());

        }if (libro1 == null && libro2 == null){
            System.out.println("No hay informacion de ningun libro en la biblioteca.");
        }
    }

        //Getters

    public String getNombre() {
        return nombre;
    }


    public Libro getLibro1() {
        return libro1;
    }


    public Libro getLibro2() {
        return libro2;
    }

        //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setLibro1(Libro libro1) {
        this.libro1 = libro1;
    }


    public void setLibro2(Libro libro2) {
        this.libro2 = libro2;
    }
}
