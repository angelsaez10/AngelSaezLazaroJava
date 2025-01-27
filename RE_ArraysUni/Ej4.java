package RE_ArraysUni;

public class Ej4 {
    public static void main(String[] args) {
        int[] primero = {1,1,1,3,3,3,5,5,5,7,7,7};
        int[] segundo = {2,2,2,4,4,4,6,6,6,8,8,8};
        int[] mezcla = new int[24];
        int indice = 0;

        for (int i = 0; i < 12; i += 3) {
            mezcla[indice++] = primero[i];
            mezcla[indice++] = primero[i + 1];
            mezcla[indice++] = primero[i + 2];

            mezcla[indice++] = segundo[i];
            mezcla[indice++] = segundo[i + 1];
            mezcla[indice++] = segundo[i + 2];
        }

        System.out.println("Números mezclados:");
        for (int num : mezcla) {
            System.out.print(num + " - ");
        }
    }
}
