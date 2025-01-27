package Enero20I24;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona(String n, String a, LocalDate fN){
        nombre = n;
        apellidos = a;
        fechaNacimiento = fN;
    }

    public boolean esCumpleaños(LocalDate fecha){
        return fechaNacimiento.isEqual(fecha);
    }



}
