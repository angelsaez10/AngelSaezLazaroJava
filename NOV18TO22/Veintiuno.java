package NOV18TO22;

public class Veintiuno {
    public static void main(String[] args) {
        String cadena1 ="Lo que esta mal de la gente es la maldad mala y malos son los que hacen maldades";
        String cadena2=cadena1.toLowerCase();
        int posicion=cadena2.indexOf("mal");
        int contador =0;

        while (posicion >= 0){
            contador++;
            cadena2=cadena2.substring(posicion+1);
            posicion=cadena2.indexOf("mal");
        }
        System.out.println("La palabra 'mal' aparece un total de "+contador+" veces");
    }
}
