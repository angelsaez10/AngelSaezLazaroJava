package U1;

public class Ej1 {
    public enum partesPC{
        MONITOR,TECLADO,RATON,IMPRESORA
    }

    public static void main(String[] args) {
        System.out.println("Partes de un pc:");
        System.out.println("-------------------");
        System.out.println("Componente 1:"+partesPC.MONITOR);
        System.out.println("Componente 2:"+partesPC.TECLADO);
        System.out.println("Componente 3:"+partesPC.RATON);
        System.out.println("Componente 4:"+partesPC.IMPRESORA);

    }
}
