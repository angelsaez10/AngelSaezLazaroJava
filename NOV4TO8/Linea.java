package NOV4TO8;

public class Linea {
    Punto inicio;
    Punto fin;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Linea (Punto p1,Punto p2){
        this.inicio=p1;
        this.fin=p2;
    }

    public Linea (){
        this.inicio=null;
        this.fin=null;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public Punto getInicio() {
        return inicio;
    }
    //2
    public Punto getFin() {
        return fin;
    }
        //Setters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }
    //2
    public void setFin(Punto fin) {
        this.fin = fin;
    }

        //Else- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public String mostrarLinea(){
        return "["+inicio.toString()+","+fin.toString()+"]";
    }

    //Main--------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        //Declaración de los puntos que van a conformar la linea1
        Punto p1=new Punto(1.0,2.0);
        Punto p2=new Punto(5.0,1.0);

        //Declaración de la linea1
        Linea l1 = new Linea(p1,p2);


        p1.mueveIzquierda(1);
        p2.mueveIzquierda(1);

        p1.mueveAbajo(1);
        p2.mueveAbajo(1);

        //Mostrar las coordenadas de la linea
        System.out.println(l1.mostrarLinea());


    }
}
