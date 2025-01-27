package PiscinaMunicipal;

import java.time.LocalDate;
import java.time.LocalTime;

public class AbonoClaseNatacion {
    private String tipo;
    private static double precio;
    private LocalDate fecha;
    private LocalTime hora;

    public AbonoClaseNatacion (String tipo,String fecha,String hora)throws IllegalArgumentException{
        if (!tipo.equalsIgnoreCase("aquagym") || !tipo.equalsIgnoreCase("espalda") || !tipo.equalsIgnoreCase("estilos")){
            throw new IllegalArgumentException("El tipo de clase de natacion es incorrecto.Elija entre Aquagym, espalda o estilos.");
        }
        this.tipo = tipo;

        if (tipo.equalsIgnoreCase("aquagym")){
            precio = 30;
            this.fecha = LocalDate.parse(fecha);
            this.hora = LocalTime.parse(hora);
        }else {
            precio = 20;
            this.fecha = LocalDate.parse(fecha);
            this.hora = LocalTime.parse(hora);
        }

    }
}
