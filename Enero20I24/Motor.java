package Enero20I24;

public class Motor {
    private int potencia;
    private String tipo;


    public Motor(int p,String t){
        potencia = p;
        tipo = t;
    }

    public String mostrarDetalles(){
        return "Potencia:"+potencia+"cv\tTipo:"+tipo;
    }
}
