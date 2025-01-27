package PiscinaMunicipal;

import java.time.LocalDate;
import java.time.LocalTime;

public class AbonoNadoLibre {
    private static double precio = 2.50;
    private LocalDate fecha;
    private LocalTime hora;
    private int calle;

    public AbonoNadoLibre (String fecha,String hora,int calle) throws IllegalArgumentException{
        this.fecha = LocalDate.parse(fecha);
        this.hora = LocalTime.parse(hora);
        if (calle < 1 || calle > 6){
            throw new IllegalArgumentException("El numero de la calle no es valido.Introduzca un numero de calle entre 1 y 6.");
        }else this.calle = calle;
    }

    public static double getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String toString(){
        return "Precio:"+precio+" euros\tFecha:"+fecha+"\tHora:"+hora+"\tCalle:"+calle;
    }

    public static void main(String[] args) {
        AbonoNadoLibre a1 = new AbonoNadoLibre("2025-12-31","15:40:00",4);

        AbonoNadoLibre a2 = new AbonoNadoLibre("2023-01-01","00:00:00",1);

        System.out.println(a1);
    }
}
