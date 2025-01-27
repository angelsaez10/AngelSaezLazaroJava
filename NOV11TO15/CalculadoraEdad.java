package NOV11TO15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraEdad {
    LocalDate fechaNacimiento;

    //Constructores-----------------------------------------------------------------------------------------------------
    //1
    public CalculadoraEdad (LocalDate fN){
            this.fechaNacimiento=fN;
    }

    //2
    public CalculadoraEdad (){
        this.fechaNacimiento=null;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getter--------------------------------------------------------------------------------------------------------
    //1
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
        //Setters-------------------------------------------------------------------------------------------------------
    //1
        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        //Else----------------------------------------------------------------------------------------------------------
    //1
        public void pedirFecha() {
            Scanner sc = new Scanner(System.in);
            String fNacimiento;
            boolean correcta = false;

            do {
                System.out.println("Introduzca su fecha de nacimiento (YYYY-MM-DD):");
                fNacimiento = sc.nextLine();
                try {
                    this.fechaNacimiento = LocalDate.parse(fNacimiento);
                    correcta = true;
                } catch (Exception e) {
                    System.err.println("El formato de la fecha es erróneo. Intente de nuevo.");
                }
            } while (!correcta);

            System.out.println("Su fecha de nacimiento es: " + this.fechaNacimiento);
        }


    //2
    public long edad(){
        return ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now());
    }

    //3
    public long diasParaCumple(){
        return ChronoUnit.DAYS.between(LocalDate.now(),fechaNacimiento.plusYears(edad()+1));
    }

//MAIN------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
    CalculadoraEdad angel =new CalculadoraEdad();

    angel.pedirFecha();

    System.out.println("Su edad es de "+angel.edad()+" años");

    System.out.println("Quedan "+angel.diasParaCumple()+" dias para tu cumleaños");

    }
}
