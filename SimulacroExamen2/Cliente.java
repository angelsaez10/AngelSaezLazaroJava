package SimulacroExamen2;

public class Cliente {
    String nombre,telefono;
    Pelicula[] peliculas ;
    int contadorPeliculas;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Cliente(String n,String t){
        this.nombre = n;
        this.telefono = t;
        peliculas = new Pelicula[3];
        contadorPeliculas = 0;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters--------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }
        //Setters--------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

        //Otros-----------------------------------------------
    public void alquilarPelicula(Pelicula p){
        if (contadorPeliculas < peliculas.length){
            p.alquilar();
            contadorPeliculas++;
            System.out.println("El alquiler se ha completado correctamente.");
        }else System.out.println("Actualmente tiene 3 peliculas alquiladas por lo que no puede alquilar ninguna mas hasta que devuelva algina pelicula primero.");
    }

    public void devolverPelivula(Pelicula p){
        p.devolver();
        contadorPeliculas--;
        System.out.println("La pelicula ha sido devuelta con exito.");
    }

    public String toString(){
        return "Nombre:"+this.nombre+" - "+"Telefono:"+this.telefono+" - "+"Peliculas alquiladas:"+contadorPeliculas;
    }
}
