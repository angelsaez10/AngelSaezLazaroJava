package RepasoPOO;

import java.util.Scanner;

public class CalculadoraDeFracciones {
    double numerador;
    double denominador;

    //Constructores-----------------------------------------------------------------------------------------------------
    public CalculadoraDeFracciones(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca el numerador:");
        this.numerador=sc.nextDouble();
        System.out.println("Introduzca el denominador:");
        this.denominador=sc.nextDouble();
        while (denominador == 0){
            if (this.denominador == 0){
                System.err.println("El denominador no puede ser 0.Introduzca un numerador diferente.");
                System.out.println("Introduzca el denominador:");
                this.denominador=sc.nextDouble();
            }
        }
        System.out.println(this.toString());
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters
        //1
    public double getNumerador() {
        return numerador;
    }
        //2
    public double getDenominador() {
        return denominador;
    }
        //Setters
        //1
    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }
        //2
    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }
        //Else
        //1
    public String sumarFraccion(CalculadoraDeFracciones fraccion){
        if (this.denominador == fraccion.denominador){
            return "El resultado de la suma es: "+(this.numerador+fraccion.numerador)+"/"+this.denominador;
        }else {
            return "Los denominadores de ambas fracciones deben ser iguales para que ambas fracciones puedan sumarse.";
        }
    }

        //2
        public String restarFraccion(CalculadoraDeFracciones fraccion){
            if (this.denominador == fraccion.denominador){
                return "El resultado de la resta es: "+(this.numerador-fraccion.numerador)+"/"+this.denominador;
            }else {
                return "Los denominadores de ambas fracciones deben ser iguales para que ambas fracciones puedan restarse.";
            }
        }

        //3
        public String multiplicarFraccion(CalculadoraDeFracciones fraccion){
            return "El resultado de la multiplicacion es: "+(this.numerador*fraccion.numerador)+"/"+(this.denominador*fraccion.denominador);
        }

        //4
        public String dividirFraccion(CalculadoraDeFracciones fraccion){
            return "El resultado de la division es: "+(this.numerador*fraccion.denominador)+"/"+(this.denominador*fraccion.numerador);
        }

        //5
        public String toString(){
        return "Fraccion: "+this.numerador+"/"+this.denominador;
        }
    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        CalculadoraDeFracciones f1= new CalculadoraDeFracciones();
        CalculadoraDeFracciones f2= new CalculadoraDeFracciones();
        CalculadoraDeFracciones f3= new CalculadoraDeFracciones();

        System.out.println( f1.sumarFraccion(f2));
        System.out.println( f1.restarFraccion(f2));
        System.out.println(f1.multiplicarFraccion(f3));
        System.out.println(f1.dividirFraccion(f3));
    }

}
