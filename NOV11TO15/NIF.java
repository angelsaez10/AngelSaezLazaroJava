package NOV11TO15;

import java.util.Scanner;

public class NIF {
    private int DNI;
    private char letra;

    //Constructores-----------------------------------------------------------------------------------------------------
    // 1
    public NIF(int d){
        this.DNI=d;
        this.letra=obtenerLetra(this.DNI);
    }

    //2
    public NIF (){
        this.DNI=0;
        this.letra=' ';
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public int getDNI() {
        this.letra=obtenerLetra(DNI);
        this.letra=obtenerLetra(this.DNI);
       return DNI;
    }

    //2
    public char getLetra() {
        this.letra=obtenerLetra(DNI);
        return this.letra;
    }
        //Setters- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void setDNI(int DNI){
        this.DNI = DNI;
        this.letra=obtenerLetra(DNI);
    }

        //Else- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
        private static char obtenerLetra(int DNI) {
            int resto = DNI % 23;

            if (resto == 0) {
                return 'T';

            } else if (resto == 1) {
                return 'R';

            } else if (resto == 2) {
                return 'W';

            } else if (resto == 3) {
                return 'A';

            } else if (resto == 4) {
                return 'G';

            } else if (resto == 5) {
                return 'M';

            } else if (resto == 6) {
                return 'Y';

            } else if (resto == 7) {
                return 'F';

            } else if (resto == 8) {
                return 'P';

            } else if (resto == 9) {
                return 'D';

            } else if (resto == 10) {
                return 'X';

            } else if (resto == 11) {
                return 'B';

            } else if (resto == 12) {
                return 'N';

            } else if (resto == 13) {
                return 'J';

            } else if (resto == 14) {
                return 'Z';

            } else if (resto == 15) {
                return 'S';

            } else if (resto == 16) {
                return 'Q';

            } else if (resto == 17) {
                return 'V';

            } else if (resto == 18) {
                return 'H';

            } else if (resto == 19) {
                return 'L';

            } else if (resto == 20) {
                return 'C';

            } else if (resto == 21) {
                return 'K';

            } else if (resto == 22) {
                return 'E';

            }

            return ' ';
        }

        //2
    public void leer(){
        System.out.print("Introduzca su numero de DNI:");
        Scanner sc =new Scanner(System.in);
        this.DNI=sc.nextInt();
        letra= obtenerLetra(this.DNI);
        System.out.println("Su DNI completo es:"+this.DNI+this.letra);
    }

       //3
    public String mostrarDNI(){
        return this.DNI+" - "+this.letra;
    }


        //MAIN----------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        NIF dni1=new NIF();

        dni1.setDNI(54237750);

        System.out.println(dni1.getDNI());

        System.out.println(obtenerLetra(dni1.getDNI()));

        System.out.println(dni1.mostrarDNI());

       dni1.leer();
    }
}

