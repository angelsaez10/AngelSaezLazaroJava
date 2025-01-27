package RepasoPOO;

public class Excursion {
    String nombreExcursion;
    double totalGastos;
    int numeroAsistentes;


    //Constructores-----------------------------------------------------------------------------------------------------
    //1
    public Excursion(){
        this.nombreExcursion="Excursion sin nombre";
        this.totalGastos=0;
        this.numeroAsistentes=0;
    }

    //2
    public Excursion(String no){
        this.nombreExcursion=no;
        this.totalGastos=0;
        this.numeroAsistentes=0;
    }

    //3
    public Excursion(String no,double tg){
        this.nombreExcursion=no;
        this.totalGastos=tg;
        this.numeroAsistentes=0;
    }

    //4
    public Excursion(String no,double tg,int na){
        this.nombreExcursion=no;
        this.totalGastos=tg;
        this.numeroAsistentes=na;
    }


    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters-------------------------------------------------------------------------------------------------------
    //1
    public String getNombreExcursion() {
        return nombreExcursion;
    }

    //2
    public double getTotalGastos() {
        return totalGastos;
    }

    //3
    public int getNumeroAsistentes() {
        return numeroAsistentes;
    }
        //Setters-------------------------------------------------------------------------------------------------------
    //1
    public void setNombreExcursion(String nombreExcursion) {
        this.nombreExcursion = nombreExcursion;
    }

    //2
    public void setTotalGastos(double totalGastos) {
        this.totalGastos = totalGastos;
    }

    //3
    public void setNumeroAsistentes(int numeroAsistentes) {
        this.numeroAsistentes = numeroAsistentes;
    }
        //Else----------------------------------------------------------------------------------------------------------
    //1
    public double añadirgasto(double gasto){
        if (gasto > 0){
            this.totalGastos += gasto;
        }else System.err.println("Los gastos a añadir no pueden ser un numero negativo.Por favor introduzca una cantidad positiva");
        System.out.print("Total gastos actualizado:");
    return this.totalGastos;
    }

    //2
    public void establecerNumeroAsistentes(int asistentes){
        if (asistentes > 0){
            System.out.println("El numero de asistentes es mayor que 0.Todo correcto.");
        }else System.out.println("El numero de asistentes no es mayor que 0.Añada algun asistente");
    }

    //3
    public double calcularCostoPorPersona(){
        double precioPorPersona;
        if (this.numeroAsistentes > 0){
            precioPorPersona= this.totalGastos / this.numeroAsistentes;
            System.out.print("El costo por persona es de:");
            return precioPorPersona;
        }else {
            System.err.println("El numero de personas es 0 por lo tanto no se puede calcular el costo por persona");
            return 0;
        }
    }

    //4
    public String mostrarResumen(){
        return this.nombreExcursion+" - Total de gastos:"+this.totalGastos +" euros - Asistentes:"+this.numeroAsistentes+" -  Costo por presona:"+calcularCostoPorPersona()+" euros";
    }

    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Excursion e1 = new Excursion("El monte Chilliad", 1000, 5);

        System.out.println(e1.mostrarResumen());

        System.out.println(e1.añadirgasto(500));

        e1.establecerNumeroAsistentes(10);

        System.out.println(e1.calcularCostoPorPersona());

        System.out.println(e1.mostrarResumen());
    }

}
