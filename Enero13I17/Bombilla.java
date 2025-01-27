package Enero13I17;

public class Bombilla {
    //Atributos privados de los objetos bobilla
    private boolean estadoBombilla;
    private int vecesEncendidaDesdeCreacion;

    //Atributos estaticos de la clase bombilla
    private static int totalBombillasCreadas;
    private static int totalEncendidasALaVez;

    //Constructor que crea un objeto con el estado de la bombilla que introduzca el usuario
    private Bombilla(boolean estado){
        estadoBombilla = estado;
        totalBombillasCreadas++;
        if (isEstadoBombilla()){
            totalEncendidasALaVez++;
            vecesEncendidaDesdeCreacion++;
        }
    }

    //Constructor que crea un objeto sin parametros introducidos por el ususario con el valor por defecto
    // de estado de la bombilla en false
    private Bombilla(){
        this(false);
        totalBombillasCreadas++;
    }

    //GETTERS-----------------------------------------------------------------------------------------------------------
    //Estado de la bombilla
    public boolean isEstadoBombilla() {
        return estadoBombilla;
    }

    //Veces que se ha encendido la bombilla desde que fue creada
    public int getVecesEncendidaDesdeCreacion() {
        return vecesEncendidaDesdeCreacion;
    }

    //La cantidad de bombillas que han sido creadas hasta el momento
    public static String getTotalBombillasCreadas() {
        return "Se han creado un total de:"+totalBombillasCreadas+" bombillas.";
    }

    //La cantidad de bombillas que hay encendidas a la vez
    public static String getTotalEncendidasALaVez() {
        return "Hay una cantidad de:"+totalEncendidasALaVez+" bombillas encendidas a la vez.";
    }

    //Metodo para imprimir el estado de la bombilla y cuantas veces se ha encendido desde que fue creada
    public String toString(){
        if (isEstadoBombilla()){
            if (getVecesEncendidaDesdeCreacion() == 1){
                return "Bombilla: Encendida"+"\t"+"Se ha encendido:"+getVecesEncendidaDesdeCreacion()+" vez";
            }else return "Bombilla: Encendida"+"\t"+"Se ha encendido:"+getVecesEncendidaDesdeCreacion()+" veces";
        }else{
            if (getVecesEncendidaDesdeCreacion() == 1){
                return "Bombilla: Apagada"+"\t"+"Se ha encendido:"+getVecesEncendidaDesdeCreacion()+" vez";
            }else return "Bombilla: Apagada"+"\t"+"Se ha encendido:"+getVecesEncendidaDesdeCreacion()+" veces";
        }
    }

    //Metodo para encender una bombilla
    private void encenderBombilla() throws IllegalStateException{
        if (isEstadoBombilla()){
            throw new IllegalStateException("La bombilla ya esta encendida por lo que no se puede volver a encender.");
        }else {
            System.out.println("Bombilla encendida.");
            vecesEncendidaDesdeCreacion++;
            estadoBombilla = true;
            totalEncendidasALaVez++;
        }
    }

    //Metodo para apagar la bombilla
    private void apagarBombilla() throws IllegalStateException{
        if (!isEstadoBombilla()){
            throw new IllegalStateException("La bombilla ya esta apagada por lo que no se puede apagar de nuevo.");
        }else {
            System.out.println("Bombilla apagada.");
            estadoBombilla = false;
            totalEncendidasALaVez--;
        }
    }

    //Metodo para conmutar el estado de la bombilla
    private void conmutarEstadoBombilla(){
        if (isEstadoBombilla()){
            estadoBombilla = false;
            System.out.println("Bombilla apagada.");
            totalEncendidasALaVez--;
        }else {
            estadoBombilla = true;
            System.out.println("Bombilla encendida.");
            totalEncendidasALaVez++;
            vecesEncendidaDesdeCreacion++;
        }
    }

    //MAIN
    public static void main(String[] args) {
        System.setErr(System.out);
        //Imprime el numero de bombillas creadas en total
        System.out.println(getTotalBombillasCreadas());
        //Imprime el numero de bombillas encendidas a la vez
        System.out.println(getTotalEncendidasALaVez());

        //Creamos 3 objetos bombilla
        Bombilla b1,b2,b3;

        b1 = new Bombilla();
        System.out.println("b1:"+b1.toString());

        b2 = new Bombilla(true);
        System.out.println("b2:"+b2.toString());

        //Conmutamos el estado de la bombilla 3 veces imprimiendo el resultado
        for (int i = 0; i < 3; i++) {
            b2.conmutarEstadoBombilla();
            System.out.println("b2:"+b2.toString());
        }

        //Encendemos una vez la bombilla
        System.out.println("Encendido 1");
        try {
            b2.encenderBombilla();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Encendemos otra vez la bombilla
        System.out.println("Encendido 2");
        try {
            b2.encenderBombilla();
        }catch (Exception e){
            System.err.println("-----"+e.getMessage()+"-----");
        }

        //Apagamos la bombilla
        System.out.println("Apagado 1");
        try {
            b2.apagarBombilla();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Encendemos la bombilla
        System.out.println("Encendido 3");
        try {
            b2.encenderBombilla();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        //Imprime el numero de bombillas creadas en total
        System.out.println(getTotalBombillasCreadas());
        //Imprime el numero de bombillas encendidas a la vez
        System.out.println(getTotalEncendidasALaVez());

    }
}
