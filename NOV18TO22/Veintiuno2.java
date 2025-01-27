package NOV18TO22;

public class Veintiuno2 {
    public static void main(String[] args) {
        String cadena1="Los que me apetezca poner";
        String cadena2=cadena1.trim().toLowerCase();
        cadena1.replace("Los","Lo");
        System.out.println(cadena1);
        if (cadena2.startsWith("lo")){
            System.out.println("Empieza");
        }

        if (cadena2.endsWith("poner")){
            System.out.println("Acaba");
        }

        int valInt = Integer.valueOf("250");
        float valFloat = Float.valueOf("250");

        valInt +=2;
        valInt +=2.4;
        System.out.println(valInt);
        System.out.println(valFloat);
    }
}
