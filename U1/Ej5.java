package U1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int largos,lCrol,lEspalda;
        double mPiscina,mTotales,mCrol,mEspalda;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de largos realizados:");
        largos = sc.nextInt();

        System.out.println("Introduzca el largo total de la piscina:");
        mPiscina = sc.nextInt();

        mTotales = largos * mPiscina;

        if (largos %2 == 0){
            lCrol = largos /2;
            lEspalda = largos /2;
        }else {
            lCrol = largos /2 +1;
            lEspalda = largos /2;
        }

        mCrol = lCrol*mPiscina;
        mEspalda = lEspalda*mPiscina;

        System.out.println("Se han nadado " +largos+" largos en una piscina de "+mPiscina + " metros.");
        System.out.println("Se han recorrido un total de "+mTotales + " metros totales."+mCrol+" metros a Crol y "+mEspalda+" metros a espalda");
    }
}
