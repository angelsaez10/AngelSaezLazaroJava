package daw.biblioteca;


public class dawtest {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("IES Jorge Guillen");
        Autor a1= new Autor("Lamin Yamal","Español");
        Autor a2= new Autor("Leo Messi","Argentino");

        Libro l1 = new Libro("Teo va al parque","TVAP",a1,19);

        Libro l2 = new Libro("Teo va al zoo","TVAZ",a1,10);

        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);

        biblio.imprimeBiblioteca();
    }
}
