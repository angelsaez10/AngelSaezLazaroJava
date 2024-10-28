package OCT7TO11;

import java.util.Scanner;
public class Ocho {
    public enum Componentes{Teclado,Raton,Pantalla,Impresora};
    public static void main(String[] args) {
        //Ejercicio 1:Partes de un PC
        System.out.println("Partes de un teclado:");
        System.out.println("--------------------------");
        System.out.println(Componentes.Pantalla);
        System.out.println(Componentes.Raton);
        System.out.println(Componentes.Teclado);
        System.out.println(Componentes.Impresora);

        //Ejercicio 2:Calculos aritmeticos
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Dame un numero real:");
        double num1= keyboard.nextDouble();
        System.out.print("Dame otro numero real:");
        double num2=keyboard.nextDouble();
        System.out.println("El doble del segundo numero es:"+num2*2);
        System.out.println("La tercera parte del primer numero es:"+num1/3);
        System.out.println("El cuadrado de la suma de los dos numeros es:"+(num1+num2)*(num1+num2));
        System.out.println("La decima parte de la suma de los cuadrados de ambos numeros:"+((num1*num1)+(num2*num2))/10);

        //Ejercicio 3:Volumen de la piramide
        System.out.print("Dame el largo de la base de la piramide:");
        double largoBase=keyboard.nextDouble();
        System.out.print("Dame el alto de la piramide:");
        double altura=keyboard.nextDouble();
        double base=largoBase*largoBase;
        double volumen=(1.0/3.0)*base*altura;
        System.out.println("El volumen de la piramide es:"+ volumen);
        System.out.println("Eso equivale aproximadamente a "+volumen/2500+" piscinas");

        //Ejercicio 4:Analisis de un numero
        System.out.print("Dame un numero entero:");
        int numEnt= keyboard.nextInt();
        String cero= ((numEnt==0) ? "El numero es cero" : "El numero no es cero");
        String positivo= ((numEnt>0) ? "El numero es positivo" : "El numero es negativo");
        String menor= ((numEnt<100) ? "El numero es menor que cien" : "El numero es mayor que cien");
        String par= ((numEnt%2==0) ? "El numero es par" : "El numero es impar");

        //Ejercicio 5:Entrenamiento de natacion
        System.out.println("Dime el numero de largos que has hecho:");
        int largos= keyboard.nextInt();
        System.out.println("Dime la longitud de la piscina:");
        int longitudPiscina= keyboard.nextInt();
        int largoEspalada=largos/2;
        int largoCrol=largos-largoEspalada;
        int longitudRecorrida=largos*longitudPiscina;
        System.out.println("Se han hecho un total de "+largos+ " largos en los que se han recorrido "+ longitudRecorrida/1000+ "kms en total");
        System.out.println("Se han hecho "+largoCrol+" largos a crol y se han recorrido "+largoCrol*longitudPiscina+" metros a crol");
        System.out.println("Se han hecho "+largoEspalada+" largos a espalda y se han recorrido "+ largoEspalada*longitudPiscina+" metros a espalda");

        //Ejercicio 6:Cuadernos de colores
        System.out.println("Dime el numero de hojas que tiene tu cuaderno");
        int numHojas=keyboard.nextInt();
        int hRojas=(numHojas%3==0)?numHojas/3:numHojas/3+1;
        int hVerdes=(numHojas%3==2)?numHojas/3+1:numHojas/3;
        int hAzules=numHojas/3;
        System.out.println("Numero de hojas rojas:"+ hRojas);
        System.out.println("Numero de hojas verdes:"+ hVerdes);
        System.out.println("Numero de hojas azules:"+ hAzules);

        //Ejercicio 7:Concurso de TV
        System.out.print("Dime tu nombre:");
        String nombre= keyboard.nextLine();
        System.out.print("Dime tu apellido:");
        String apellido1=keyboard.nextLine();
        System.out.print("Dime tu segundo apellido:");
        String apellido2= keyboard.nextLine();
        nombre=nombre.toLowerCase();
        String valido=(nombre.charAt(0)==nombre.charAt(nombre.length()-1)&&apellido1.length()==apellido2.length())?"Apto":"No apto";
        System.out.println(valido);
    }
}
