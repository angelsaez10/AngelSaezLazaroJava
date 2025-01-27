package RE_ArraysUni;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        boolean arrancado = true,correcta = false;
        int opcion;
        Scanner sc = new Scanner(System.in);
        int[] primer= new int[5];
        int[] segundo= new int[5];
        int[] tercero= new int[5];

        System.out.println("MENU");
        System.out.println("======");
        System.out.println("1)Introducir notas del primer trimestre.");
        System.out.println("2)Introducir notas del segundo trimestre.");
        System.out.println("3)Introducir notas del tercer trimestre.");
        System.out.println("4)Mostrar la nota media de todos los alumnos.");
        System.out.println("5)Mostrar la nota media de un alumno en concreto.");
        System.out.println("6)Salir.");

        do {
            System.out.println("Introduzca la accion que necesite(1-5):");
            opcion = sc.nextInt();

            if (opcion == 1) {
                for (int i = 0; i < 5; i++) {
                    int temporal;
                    correcta = false;
                    while (!correcta) {
                        System.out.println("Introduzca la nota:");
                        temporal = sc.nextInt();
                        if (temporal >= 0 && temporal <= 10) {
                            primer[i] = temporal;
                            correcta = true;
                        } else {
                            System.err.println("La nota a introducir tiene que tener un valor entre 0 y 10.");
                        }
                    }
                }
            }
            else if (opcion == 2) {
                for (int i = 0; i < 5; i++) {
                    int temporal;
                    correcta = false;
                    while (!correcta) {
                        System.out.println("Introduzca la nota:");
                        temporal = sc.nextInt();
                        if (temporal >= 0 && temporal <= 10) {
                            segundo[i] = temporal;
                            correcta = true;
                        } else {
                            System.err.println("La nota a introducir tiene que tener un valor entre 0 y 10.");
                        }
                    }
                }
            }else if (opcion == 3) {
                for (int i = 0; i < 5; i++) {
                    int temporal;
                    correcta = false;
                    while (!correcta) {
                        System.out.println("Introduzca la nota:");
                        temporal = sc.nextInt();
                        if (temporal >= 0 && temporal <= 10) {
                            tercero[i] = temporal;
                            correcta = true;
                        } else {
                            System.err.println("La nota a introducir tiene que tener un valor entre 0 y 10.");
                        }
                    }
                }
            }else if (opcion == 4) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Alumno " + i + ": " + ((primer[i] + segundo[i] + tercero[i]) / 3.0));
                }

            }else if (opcion == 5) {
                System.out.println("Introduzca el número del alumno que desea conocer (1-5):");
                sc.nextLine();
                String alumno = sc.nextLine();

                switch (alumno) {
                    case "1":
                        System.out.println("1er trimestre: " + primer[0] + " - 2o trimestre: " + segundo[0] + " - 3er trimestre: " + tercero[0]);
                        break;
                    case "2":
                        System.out.println("1er trimestre: " + primer[1] + " - 2o trimestre: " + segundo[1] + " - 3er trimestre: " + tercero[1]);
                        break;
                    case "3":
                        System.out.println("1er trimestre: " + primer[2] + " - 2o trimestre: " + segundo[2] + " - 3er trimestre: " + tercero[2]);
                        break;
                    case "4":
                        System.out.println("1er trimestre: " + primer[3] + " - 2o trimestre: " + segundo[3] + " - 3er trimestre: " + tercero[3]);
                        break;
                    case "5":
                        System.out.println("1er trimestre: " + primer[4] + " - 2o trimestre: " + segundo[4] + " - 3er trimestre: " + tercero[4]);
                        break;
                    default:
                        System.out.println("Número de alumno inválido. Por favor, ingrese un número entre 1 y 5.");
                }
            }else if (opcion == 6) {
                System.out.println("Finalizando programa.");
                arrancado = false;
            }

        }while (arrancado);
    }
}
