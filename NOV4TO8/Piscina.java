package NOV4TO8;

public class Piscina {
    int cantMaxima;
    int cantActual;

    //Constructores---------------------------------------------------------------------------------------------------------
    //1
    public Piscina(int max,int act){
        if (max > act) {
            this.cantMaxima = max;
            this.cantActual = act;
        }else {
            System.out.println("La cantidad actual no puede ser mayor a la cantidad maxima de agua.");
           }
    }

    //2
    public Piscina(){
        this.cantMaxima=5000;
        this.cantActual=0;
    }

    //3
    public Piscina(int act){
        this.cantMaxima=5000;
        if (this.cantMaxima > act) {
            this.cantActual = act;
        }else {
            System.out.println("La cantidad actual no puede ser mayor a la cantidad maxima de agua.");
            this.cantActual = this.cantMaxima;
        }
    }

//Metodos---------------------------------------------------------------------------------------------------------------
    //Getters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public int getCantMaxima() {
        return cantMaxima;
    }

    //2
    public int getCantActual() {
        return cantActual;
    }
    //Setters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    //2
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    //Else- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void llenarPiscina(){
        this.cantActual=this.cantMaxima;

    }

    //2
    public void extraerAgua(int cantidad){
        if (cantidad < 0) {
            System.out.println("No se puede extraer una cantidad de agua negativa.");

        }else if (this.cantActual >= cantidad){
            this.cantActual -= cantidad;
            System.out.println("Se ha extraido correctamente: "+ cantidad+" litros de agua.Quedando: "+this.cantActual+" litros");

        }else {
            System.out.println("No hay agua suficiente.La extraccion no se realizara.");;
        }
    }

    //3
    public void vaciarPiscina(){
        if (this.cantActual == 0){
            System.out.println("La piscina ya esta vacia");

        }else{
            this.cantActual =0;
            System.out.println("Piscina vaciada corectamente.");
        }
    }

    //4
    public void agregarAgua(int cantidad){
        if (cantidad < 0 ){
            System.out.println("No se puede agregar una cantidad de agua negativa");

        } else if (cantidad + this.cantActual > this.cantMaxima) {
            System.out.println("No se puede agregar tanta agua, superaria el limite de agua de la piscina.");

        }else {
            this.cantActual += cantidad;
        }
    }

    //5
    public String mostrarInfoPiscina(){
        return "Cantidad maxima: "+this.cantMaxima+"   Cantidad actual: "+this.cantActual;
    }

    public static void main(String[] args) {
        Piscina p1 = new Piscina(10000,2000);
        Piscina p2 = new Piscina(2000);
        Piscina p3 = new Piscina();

    }

}