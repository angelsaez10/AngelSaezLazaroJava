package R2U2;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        num1 = sc.nextInt();

        System.out.println("Introduzca otro numero:");
        num2 = sc.nextInt();

        System.out.println("Introduzca otro numero mas:");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println("El orden es:"+num1+","+num2+","+num3);
            }else System.out.println("El orden es:"+num1+","+num3+","+num2);
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3){
                System.out.println("El orden es:"+num2+","+num1+","+num3);
            }else System.out.println("El orden es:"+num2+","+num3+","+num1);
        }else if (num3 > num1 && num3 > num2) {
            if (num2 > num1) {
                System.out.println("El orden es:" + num3 + "," + num2 + "," + num1);
            } else System.out.println("El orden es:" + num3 + "," + num1 + "," + num2);
        } else System.out.println("El orden es:"+num3 + "," + num2 + "," + num1);
    }
}
