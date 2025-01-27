package ArraysBi;

public class Ej5 {
    public static void main(String[] args) {
        int [][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i+j) %2 == 0){
                    array[i][j] = 1;
                }else  array[i][j] = 0;
            }
        }

        System.out.println("Array generado:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
