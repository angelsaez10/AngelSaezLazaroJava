package Enero20I24;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String c,double r){
        super(c);
        radio = r;
    }

    public String mostrarDetalles(){
        return "Color:"+mostrarColor()+"\tRadio:"+radio;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo",12.5);

        System.out.println(c1.mostrarDetalles());
    }
}
