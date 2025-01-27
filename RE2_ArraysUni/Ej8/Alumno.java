package RE2_ArraysUni.Ej8;

import java.util.Scanner;

public class Alumno {
    String nombre;
    String cElectronico;

    //Constructores-----------------------------------------------------------------------------------------------------
    public Alumno() {
        this.nombre = null;
        this.cElectronico = null;
    }

    public Alumno(String n, String cE) {
        this.nombre = n;
        this.cElectronico = cE;
    }

    //Metodos-----------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getcElectronico() {
        return cElectronico;
    }

    //Setters-----------------------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcElectronico(String cElectronico) {
        this.cElectronico = cElectronico;
    }

        //Else----------------------------------------------------------------------------------------------------------

    public String toString() {
        String nombreStr = (nombre != null) ? nombre : "Sin nombre";
        String correoStr = (cElectronico != null) ? cElectronico : "Sin correo";
        return "Nombre: " + nombreStr + " - Correo electrónico: " + correoStr;
    }

    //MAIN--------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Alumno[] primero = new Alumno[5];
        boolean[] asiento = new boolean[5];
        int contador = 0, silla;

        Scanner sc = new Scanner(System.in);

        while (contador < 5) {
            System.out.println("Alumno: " + (contador + 1));

            do {
                System.out.println("¿En qué asiento va a sentarse el alumno " + (contador + 1) + " (0-4)?");
                silla = sc.nextInt();
                sc.nextLine();

                if (silla < 0 || silla >= asiento.length) {
                    System.err.println("Número de asiento inválido. Por favor, elija un número entre 0 y 4.");
                } else if (asiento[silla]) {
                    System.err.println("Ese número de asiento ya está ocupado, elija otro asiento.");
                } else {
                    asiento[silla] = true;
                    break;
                }
            } while (true);

            System.out.println("Introduzca el nombre:");
            String nombre = sc.nextLine();

            String correo;
            boolean existe;

            do {
                System.out.println("Introduzca el correo electrónico:");
                correo = sc.nextLine();
                existe = false;

                for (int i = 0; i < contador; i++) {
                    if (primero[i].getcElectronico().equalsIgnoreCase(correo)) {
                        System.err.println("El correo introducido ya existe, por favor introduzca uno diferente.");
                        existe = true;
                        break;
                    }
                }
            } while (existe);

            primero[contador] = new Alumno(nombre, correo);
            contador++;
        }

        System.out.println("Clase de primer curso:");
        for (Alumno alumno : primero) {
            System.out.println(alumno.toString());
        }
    }
}
