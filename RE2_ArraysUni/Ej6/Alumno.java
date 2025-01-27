package RE2_ArraysUni.Ej6;

import java.util.Scanner;

public class Alumno {
    String nombre;
    String cElectronico;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Alumno(){
        this.nombre = null;
        this.cElectronico = null;
    }

    public Alumno(String n, String cE){
        this.nombre = n;
        this.cElectronico = cE;
    }

    //Métodos------------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getcElectronico() {
        return cElectronico;
    }
        //Setters-------------------------------------------------------------------------------------------------------
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    public void setcElectronico(String cElectronico) {
        this.cElectronico = cElectronico;
    }

        //Else----------------------------------------------------------------------------------------------------------
    public String toString(){
        String AlumnoC = "Nombre: "+this.nombre+" - - - "+"Correo electronico: "+this.cElectronico;
       return AlumnoC;
    }

    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        //Iniciamos array con valores null
        Alumno [] primero = new Alumno[5];
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        while(contador < 5){
            System.out.println("Alumno: "+(contador+1));

            System.out.println("Introduzca el nombre:");
            String nombre;
            nombre = sc.nextLine();

            System.out.println("Introduzca el correo electronico:");
            String correo;
            correo = sc.nextLine();

            boolean existe = false;

            for (int i = 0; i < contador ; i++) {
                if (primero[i].getcElectronico().equalsIgnoreCase(correo)){
                    existe = true;
                    break;
                }
            }

                if (existe){
                    System.err.println("El correo introducido ya existe,por favor introduzca uno diferente.");
                }else {
                    primero[contador] = new Alumno(nombre,correo);
                    contador++;
                }
        }

        System.out.println("Clase de primer curso:");
        for (int i = 0; i < 5; i++) {
            System.out.println(primero[i].toString());
        }
    }
}
