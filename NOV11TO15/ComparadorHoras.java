package NOV11TO15;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparadorHoras {
    LocalTime hora;

//Constructores--------------------------------------------------------------------------------------------------------
    //1
    public ComparadorHoras (){
        this.hora=null;
    }

    //2
    public ComparadorHoras (LocalTime t){
        boolean correcto = false;
        do {
            try {
                this.hora=t;
                correcto = true;
            }catch (Exception e){
                System.err.println("ERROR");
            }
        }while (!correcto);

    }

//Métodos---------------------------------------------------------------------------------------------------------------
    //Getters...........................................................................................................
    //1
    public LocalTime getHora() {
        return hora;
    }
    //Setters...........................................................................................................
    //2
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    //Else..............................................................................................................
    //1
    public void imprimirHora(){
        System.out.println(this.hora);
    }
    //2
    public void horaMasTemprana (ComparadorHoras t){
      if (this.getHora().isBefore(t.getHora()) ){
          System.out.println("La hora mas temprana es "+this.getHora());

      } else if (t.getHora().isBefore(this.getHora())) {
          System.out.println("La hora mas temprana es "+t.getHora());

      }else {
          System.out.println("Ambas horas son iguales");
      }

    }

    //3
    public void horaMasTarde(ComparadorHoras t){
        if (this.getHora().isAfter(t.getHora()) ){
            System.out.println("La hora mas tarde es "+this.getHora());

        } else if (t.getHora().isAfter(this.getHora())) {
            System.out.println("La hora mas tarde es "+t.getHora());

        }else {
            System.out.println("Ambas horas son iguales");
        }

    }

    public long diferenciaMinutos(ComparadorHoras t){
       return ChronoUnit.MINUTES.between(t.getHora(),this.getHora());
    }

    //MAIN--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        ComparadorHoras h1=new ComparadorHoras(LocalTime.of(0,0));

        ComparadorHoras h2=new ComparadorHoras(LocalTime.of(10,0));

        h1.imprimirHora();

        h1.horaMasTemprana(h2);

        h1.horaMasTarde(h2);

        System.out.println("Hay una diferencia de "+Math.abs(h1.diferenciaMinutos(h2))+" minutos");

    }

}
