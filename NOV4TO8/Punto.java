package NOV4TO8;

public class Punto {
    double x;
    double y;

    //Constructores-----------------------------------------------------------------------------------------------------
   //1
    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }
    //2
    public Punto(){
        this.x=0;
        this.y=0;
    }

    //Metodos-----------------------------------------------------------------------------------------------------------
        //Getters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

        //Setters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

        //Else- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public double mueveDerecha(double sumar){
        this.x += sumar;
        return this.x+this.y;
    }

    public double mueveIzquierda(double restar){
        this.x -= restar;
        return this.x+this.y;
    }

    public double mueveArriba(double sumar){
        this.y += sumar;
        return this.x+this.y;
    }

    public double mueveAbajo(double restar){
        this.y -= restar;
        return this.x+this.y;
    }

    public String toString(){
        return "( "+this.x+",  "+this.y+" )";
    }



}