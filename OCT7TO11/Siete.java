package OCT7TO11;
import java.util.Scanner;
public class Siete {
    public static void main(String[] args) {

        //Ejercicio 1:Partes de un PC
        System.out.println("Estas son las partes de un PC:");
        System.out.println("-------------------------");
        System.out.println("Componenete 1:Monitor");
        System.out.println("Componenete 2:Teclado");
        System.out.println("Componente 3:Raton");
        System.out.println("Componente 4:Impresora");

        //Ejercicio 2:Calculos aritmeticos
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Dame un numero real:");
        double num1= keyboard.nextByte();
        System.out.println("Dame otro numero real");
        double num2= keyboard.nextByte();
        System.out.println("Los numeros introducidos son: "+num1+","+num2);
        System.out.println("El doble del segundo numero es:"+(num2*2));
        System.out.println("La tercera parte del primer numero es:"+(num1/3));
        System.out.println("El cuadrado de la suma de ambos numeros es:"+((num1+num2)*(num1+num2)));
        System.out.println("La decima parte de la suma de los cuadrados de ambos numero es:"+((num1*num1)+(num2*num2))/10);

        //Ejercicio 3:Volumen de una piramide
        System.out.println("Dame la longitud del lado de la base de la piramide");
        double ladoBase=keyboard.nextDouble();
        System.out.println("Dale la altura de la piramide:");
        double altura= keyboard.nextDouble();
        double base=ladoBase*ladoBase;
        double unoTres=1.0/3.0;
        double volumen=unoTres*base*altura;
        System.out.println("El volumen de la piramide es igual a: "+volumen+" m³");
        System.out.println("Equivale aproximadamente a "+volumen/2500+" piscinas olimpicas");

        //Ejercicio 4:Analisis de un numero
        System.out.println("Dame un numero entero sin decimales:");
        int numEnt= keyboard.nextInt();
        if (numEnt==0){
            System.out.println("El numero es 0");
        }else {
            System.out.println("El numero no es 0");
        }
        if (numEnt>=0){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }
        if (numEnt<=100){
            System.out.println("El numero es menor que cien");
        }else {
            System.out.println("El numero es mayor que cien");
        }
        if (numEnt%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }

        //Ejercicio 5:Entrenamiento de natacion
        System.out.println("¿Cuantos largos has realizado?");
        int largos= keyboard.nextInt();
        System.out.println("¿Cuanto mide la piscina de largo en metros?");
        int longitudPiscina= keyboard.nextInt();
        int largoCrol=largos/2;
        int largoEspalda=largos/2;
        int longitudRecorrida=(largos*longitudPiscina)/100;
        int longitudCrol=largoCrol*longitudPiscina;
        int longitudEspalda=largoEspalda*longitudPiscina;
        System.out.println("La piscina mide:"+longitudPiscina+" metros");
        System.out.println("Los largos realizados ha sido un total de:"+largos);
        System.out.println("La cantidad de kms recorridos son:"+ longitudRecorrida+" kms");
        if (largos%2==0){
            System.out.println("Se han realizado un total de "+ largoCrol+ " largos a crol y se han recorrido un total de "+longitudCrol+" metros");
        }else { System.out.println("Se han realizado un total de "+ (largoCrol+1)+ " largos a crol y se han recorrido un total de "+longitudCrol+" metros");}
        System.out.println("Se han realizado un total de "+ largoCrol+ " largos a crol y se han recorrido un total de "+longitudCrol+" metros");
        System.out.println("Se han realizado un total de "+ largoEspalda+ " largos de espaldas y se han recorrido un total de" +longitudEspalda+" metros");


        //Ejercicio 6:Cuadernos de colores
        System.out.println("¿Cuantas hojas tiene el cuaderno?");
        int hojasCuaderno= keyboard.nextInt();
        if (hojasCuaderno%3==0){
            System.out.println("El cuaderno tendra "+(hojasCuaderno/3+1)+" hojas rojas,"+(hojasCuaderno/3+1)+" hojas verdes y "+(hojasCuaderno/3+1)+" hojas azules");
        } else if (hojasCuaderno%3==1) {
            System.out.println("El cuaderno tendra "+(hojasCuaderno/3+1)+" hojas rojas,"+hojasCuaderno/3+" hojas verdes y "+hojasCuaderno/3+" hojas azules");
        } else if (hojasCuaderno%3==2) {
            System.out.println("El cuaderno tendra "+(hojasCuaderno/3+1)+" hojas rojas,"+(hojasCuaderno/3+1)+" hojas verdes y "+hojasCuaderno/3+" hojas azules");
        }

        //Ejercicio 7:Concurso de TV
        System.out.println("Dame tu nombre:");
        String nombre= keyboard.nextLine();
        nombre=nombre.toLowerCase();
        System.out.println("Dame tu primer apellido:");
        String apellido1=keyboard.nextLine();
        System.out.println("Dame tu segundo apellido:");
        String apellido2=keyboard.nextLine();
        if (nombre.charAt(0)==nombre.charAt(nombre.length()-1)&&apellido1.length()==apellido2.length()){
            System.out.println("APTO");
        }else {
            System.out.println("NO APTO");
        }
    }
}
