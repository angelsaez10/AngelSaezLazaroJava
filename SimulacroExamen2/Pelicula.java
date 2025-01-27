package SimulacroExamen2;

public class Pelicula {
    String titulo,director;
    int añoEstreno;
    boolean alquilado;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Pelicula(String t,String d,int a){
        this.titulo = t;
        this.director = d;
        this.añoEstreno = a;
        this.alquilado = false;
    }

//Métodos-----------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public boolean isAlquilado() {
        return alquilado;
    }
        //Setters--------------------------------------------
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
        //Otros----------------------------------------------------
    public void alquilar(){
        this.alquilado = true;
    }

    public void devolver(){
        this.alquilado = false;
    }

    public String toString(){
        return "Titulo:"+this.titulo+" - "+"Director:"+this.director+" - "+"Año de estreno:"+this.añoEstreno+" - "+"Alquilada:"+this.alquilado;
    }




}
