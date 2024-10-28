package OCT28To31;

public class Alumnos {

    private String nombre , apellidos;
    private int curso, edad;
    private float altura;

    public Alumnos(String n){
        this.nombre=n;
    }

    public Alumnos(String n, String a){
        this.nombre=n;
        this.apellidos=a;
    }

    public Alumnos(String n, String a, int e){
        this.nombre=n;
        this.apellidos=a;
        this.edad=e;
    }

    public void pintarNombreApellidos(){
        System.out.println(this.nombre+" "+this.apellidos);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void cumpleAños(){
        if(this.edad > 0){
            edad ++;
        }else {
            System.out.println("Este alumno no tiene la edad definida");
        }
    }



    public static void main(String[] args) {
        Alumnos a1= new Alumnos("Angel","Saez Lazaro",20);
        
    }
}
