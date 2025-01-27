package RE2_ArraysUni.Ej7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Alumno implements Comparable<Alumno> {
    String nombre;
    String cElectronico;

    // Constructores-----------------------------------------------------------------------------------------------------
    public Alumno() {
        this.nombre = null;
        this.cElectronico = null;
    }

    public Alumno(String n, String cE) {
        this.nombre = n;
        this.cElectronico = cE;
    }

    // Métodos------------------------------------------------------------------------------------------------------------
    // Getters-------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getcElectronico() {
        return cElectronico;
    }

    // Setters-------------------------------------------------------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcElectronico(String cElectronico) {
        this.cElectronico = cElectronico;
    }

    public int compareTo(Alumno otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    // Else----------------------------------------------------------------------------------------------------------
    public String toString() {
        return "Nombre: " + this.nombre + " - - - " + "Correo electronico: " + this.cElectronico;
    }

    // MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Alumno[] primero = new Alumno[5];
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        while (contador < 5) {
            System.out.println("Alumno: " + (contador + 1));

            System.out.println("Introduzca el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Introduzca el correo electronico:");
            String correo = sc.nextLine();


            boolean existe = false;
            for (int i = 0; i < contador; i++) {
                if (primero[i].getcElectronico().equalsIgnoreCase(correo)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.err.println("El correo introducido ya existe, por favor introduzca uno diferente.");
            } else {

                primero[contador] = new Alumno(nombre, correo);
                contador++;
            }
        }

        Arrays.sort(primero);

        System.out.println("Clase de primer curso:");
        for (Alumno alumno : primero) {
            System.out.println(alumno.toString());
        }
    }
}
