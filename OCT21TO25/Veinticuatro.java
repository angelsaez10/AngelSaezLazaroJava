package OCT21TO25;

import java.util.Scanner;

public class Veinticuatro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int inicio,fin;

        System.out.println("Introduzca el numero desde el cual quiere empezar a contar:");
        inicio= sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el numero hasta el que quiere contar:");
        fin= sc.nextInt();
        sc.nextLine();

        for (int i=inicio ; i<=fin ; i++ ){
            if (inicio %2 ==0){
                i +=2;
            }else {
                i++;
            }
                System.out.println(i);
        }

    }
}
