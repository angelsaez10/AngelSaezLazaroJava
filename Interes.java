public class Interes {
    public static void main(String[] args) {
        String aleatorio ,reverse ,insertada;
        aleatorio= "marica";


        StringBuilder sb = new StringBuilder();

        //No lo guarda en una variable pero es como si lo guardara en un String
        sb.append("Hola mundo");
        System.out.println(sb.toString());

        //Puede dar la vuelta a una cadena String
        reverse = new StringBuilder(aleatorio).reverse().toString();
        System.out.println(reverse);

        //Puedes meter una cadena en otra cadena en la posicion que te de la gana
        StringBuilder sB= new StringBuilder("Hola mundo");
        sB.insert(5, "gran ");//El numero es la posicion en la que metes la cadena y el texto es lo que metes a la cadena
        System.out.println(sB.toString());


    }
}