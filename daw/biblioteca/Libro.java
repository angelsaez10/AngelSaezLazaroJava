package daw.biblioteca;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private int paginas;

    //Constructores
    public Libro(String t,String i,Autor a,int p){
        this.titulo=t;
        this.isbn=i;
        this.autor=a;
        this.paginas=p;

    }


    //Métodos
        //Getters
    public String getInfoLibro(){
        return this.titulo+" - "+this.isbn+" - "+this.autor.getInfoAutor()+" - "+this.paginas;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public int getPaginas(){
        return this.paginas;
    }


        //Setters

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public void setAutor(Autor autor){
        this.autor=autor;
    }

    public void setPaginas(int paginas){
        this.paginas=paginas;
    }

    public static void main(String[] args) {
    }
}
