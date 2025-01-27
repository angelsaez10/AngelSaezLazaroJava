package NOV11TO15;

public class Hora {
    int horas;
    int minutos;
    int segundos;

    //Constructores-----------------------------------------------------------------------------------------------------
    //1
    public Hora (int h, int m, int s){
        validar();
        this.horas=h;
        this.minutos=m;
        this.segundos=s;
    }

    //2
    public Hora (){
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
    }

    //Métodos-----------------------------------------------------------------------------------------------------------
        //Getters - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public int getHoras() {
        return horas;
    }

    //2
    public int getMinutos() {
        return minutos;
    }

    //3
    public int getSegundos() {
        return segundos;
    }

        //Setters - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void setHoras(int horas) {
        this.horas = horas;
    }

    //2
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    //3
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

        //Else - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //1
    public void leer(int h, int m, int s){
        this.horas=h;
        this.minutos=m;
        this.segundos=s;
    }

    //2
    public void validar(){
        if (this.horas>=0&&this.horas<24){
           // System.out.println("Horas correctas");

            if (this.minutos>=0&&this.minutos<60){
               // System.out.println("Minutos correctos");

                if (this.segundos>=0&&this.segundos<60){
                 //   System.out.println("Segundos correctos");

                }else {
                    System.out.println("Segundos incorrectos");
                    this.segundos=0;
                }

            }else {
                System.out.println("Minutos incorrectos");
                this.minutos=0;
            }

        }else {
            System.out.println("Horas incorrectas");
            this.horas=0;
        }
    }

    //3
    public void print(){
        validar();
        System.out.println("("+this.horas+":"+this.minutos+":"+this.segundos+")");
    }

    //4
    public int aSegundos(){
        return (this.horas*60*60) + this.minutos * 60 + this.segundos;
    }

    //5
    public void deSegundos(int s){
        int hora=0,minuto=0,segundo=0;
        hora = (s/60)/60;
        s = s - (hora * 3600);
        minuto = s / 60;
        s = s - (minuto * 60);
        segundo = s;
        System.out.println("Horas:"+hora+" - "+"Minutos:"+minuto+" - "+"Segundos:"+segundo) ;
    }

    //6
    public void segundosDesdeHoras(Hora h){
        int diferencia = aSegundos() - h.aSegundos();
        System.out.println("Hay "+Math.abs(diferencia)+" segundos de diferencia entre ambas horas");
    }

    //7
    public void siguiente() {
        this.segundos += 1;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.minutos += 1;

            if (this.minutos == 60) {
                this.minutos = 0;
                this.horas += 1;

                if (this.horas == 24) {
                    this.horas = 0;
                }
            }
        }
    }


    //8
    public void anterior() {
        this.segundos -= 1;
        if (this.segundos == 0) {
            this.segundos = 59;
            this.minutos -= 1;

            if (this.minutos == 0) {
                this.minutos = 59;
                this.horas -= 1;

                if (this.horas == 0) {
                    this.horas = 23;
                }
            }
        }
    }

    //9
    public void clonar(){
        Hora nuevaHora = new Hora();
        nuevaHora = this;
        System.out.println("Hora clonada correctamente:");
        nuevaHora.print();
    }

    //10
    public boolean igualQue(Hora h){
        if (h.aSegundos() == this.aSegundos()){
            System.out.println("Misma hora.");
            return true;
        }else {
            System.out.println("Hora diferente");
            return false;
        }
    }

    //11
    public boolean menorQue(Hora h){
        if (h.aSegundos() < this.aSegundos()){
            System.out.println("La hora introducida es menor");
            return true;
        }else return false;
    }

    //12
    public boolean mayorQue(Hora h){
        if (h.aSegundos() > this.aSegundos()){
            System.out.println("La hora introducida es mayor");
            return true;
        }else return false;
    }


}
