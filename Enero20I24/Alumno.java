package Enero20I24;

import java.time.LocalDate;

public class Alumno extends Persona{
    private String grupo;
    private String curso;
    private double notaMedia;
    static LocalDate hoy = LocalDate.now();

    public Alumno(String n, String a, LocalDate fN,String g,String c,double nM){
        super(n, a,fN);
        grupo = g;
        curso = c;
    }

    public String toString(){
        return "Nombre:"+getNombre()+"\tApellidos:"+getApellidos()+"\tFecha de nacimiento:"+getFechaNacimiento()+"\tCurso:"
                +curso+"\tGrupo:"+grupo+"\tNota media:"+notaMedia;
    }

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Angel","Saez Lazaro",hoy,"b","4",7.8);

        System.out.println(a1);
    }
}
