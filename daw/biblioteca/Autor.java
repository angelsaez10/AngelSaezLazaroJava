package daw.biblioteca;

public class Autor {
    private String nombre;
    private String nacionalidad;

    //Constructores

    public Autor(String no,String na ){
        this.nombre=no;
        this.nacionalidad=na;
    }


    //Métodos
        //Getters
    public String getInfoAutor(){
        return this.nombre+" - "+this.nacionalidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

        //Setters

    public void setNombre(String nombre){
       this.nombre=nombre;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }

    public static void main(String[] args) {
    }
}
