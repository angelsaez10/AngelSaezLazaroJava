package SimulacroExamen;

public class Libro {
    String titulo,autor;
    boolean prestado;

    public Libro(String t,String a){
        this.titulo = t;
        this.autor = a;
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestar(){
        this.prestado = true;
    }

    public void devolver(){
        this.prestado = false;
    }

    public String toString(){
        return "Titulo:"+this.titulo+" - "+"Autor:"+this.autor+" - "+"Prestado:"+this.prestado;
    }
}
