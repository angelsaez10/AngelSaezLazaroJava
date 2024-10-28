package OCT14TO18;

import java.util.Scanner;

public class Catorce {
    public static void main(String[] args) {

        //Ejercicio 1:¿Puede thor levantar su martillo?
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Introduce la caracteristica de tu personaje:");
        String caracteristica= keyboard.nextLine();
        caracteristica=caracteristica.toLowerCase();
        if (caracteristica.equals("digno")){
            System.out.println("Tu personaje es digno de levantar el Mjolnir.");
        }else{
            System.out.println("No eres digno de levantar el Mjolnir.");
        }

        //Ejercicio 2:¿Tony Stark tiene suficiente energia en su traje?
        System.out.print("Introduce la cantidad de energia que le queda a Tony en su traje:");
        int energia= keyboard.nextInt();
        if (energia<20){
            System.out.println("La energia es menor al 20% por lo tanto el traje no funciona.");
        }else {
            System.out.println("Estupendo, todo listo para que Tony utilice su traje.");
        }

        //Ejercicio 3:¿Es Hulk suficientemente fuerte para detener a Thanos?
        System.out.print("¿Que porcentaje de fuerza tiene Hulk?");
        int fuerza= keyboard.nextInt();
        System.out.print("¿Que porcentaje de ira tiene Hulk?");
        int furia=keyboard.nextInt();
        if (furia>70){
            fuerza=fuerza*2;
            if (fuerza>90){
                System.out.println("Hulk es mas fuerte que Thanos.");
            }else {
                System.out.println("Hulk no es mas fuerte que Thanos");
            }
        }else{
            if (fuerza>90){
                System.out.println("Hulk es mas fuerte que Thanos.");
            }else {
                System.out.println("Hulk no es mas fuerte que Thanos");
            }
        }

        //Ejercicio 4:¿Capitan America es digno de liderar a los Vengadores?
        System.out.print("¿Es el capitan honesto?");
        String honesto= keyboard.nextLine();
        keyboard.nextLine();
        System.out.print("¿Es el capitan valiente?");
        String valiente= keyboard.nextLine();
        valiente=valiente.toLowerCase();
        honesto=honesto.toLowerCase();
        if (honesto.equals("si")&&valiente.equals("si")){
            System.out.println("El Capitan America es digno de liderar a los Vengadores.");
        }else{
            System.out.println("El Capitan America no es digno de liderar a los Vengadores.");
        }

        //Ejercicio 5:¿Viuda Negra logra infiltrarse en la base de Hydra?
        System.out.println("¿Que nivel de sigilo tiene la Viuda Negra?");
        int sigilo= keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("¿Tiene la Viuda Negra un disfraz de Hydra?");
        String disfraz= keyboard.nextLine();
        disfraz=disfraz.toLowerCase();
        if (sigilo>85||disfraz.equals("si")){
            System.out.println("La Viuda Negra ha logrado infiltrarse.");
        }else {
            System.out.println("La Viuda Negra no ha conseguido infiltrarse.");
        }

    }
}
