package NOV4TO8;

public class Producto {
    private String nombre;
    private String codigoProducto;
    private float precio;
    private int stock;
    private String categoria;
    private float descuento;


    //Constructores
    public Producto (String n,float p,int s,String c,float d){
        this.nombre=n;
        this.precio=p;
        this.stock=s;
        this.categoria=c;
        this.descuento=d;

        this.codigoProducto=crearCodigo();
    }

    public Producto (String n,float p,int s){
        this.nombre=n;
        this.precio=p;
        this.stock=s;
        this.categoria="Sin categoria";
        this.descuento=0;

        this.codigoProducto=crearCodigo();
    }

    //Metodo

    private String crearCodigo(){
        return nombre.substring(0,3).toUpperCase()+String.valueOf(precio);
    }

    public float getPrecio(){
        return this.precio;
    }

    public String getCodigoProducto(){
        return this.codigoProducto;
    }

    public float aplicarDescuento(float porcentaje){
        if (porcentaje > 0 && porcentaje <= 100){
            this.precio = this.precio*(1-(porcentaje/100));
            return this.precio;
        }else {
            return this.precio;
        }
    }

    public void actualizarStock(int cantidad) {
        if (cantidad == 0) {
            System.out.println("La cantidad introducida es 0, por lo que el stock no cambia.");
        } else if (this.stock + cantidad < 0) {
            System.out.println("No hay suficiente stock para reducir la cantidad solicitada.");
        } else {
            this.stock += cantidad;
            System.out.println("El stock se ha actualizado correctamente. Nuevo stock: " + this.stock);
        }
    }


    public String consultarStock(){

        if (this.stock > 0 && this.stock < 10){
            return  "Stock bajo.";
        } else if (this.stock > 10 && this.stock < 50) {
            return "Stock medio.";
        } else if (this.stock >= 50) {
            return "Stock alto.";
        }else
            return "No hay stock";
    }

    public void mostrarInformacionProducto(){
        System.out.println(this.nombre+" - "+this.precio+" - "+this.codigoProducto+" - "+this.stock+" - "+this.categoria);
    }

    public String toString(){
        return this.nombre+" - "+this.precio+" - "+this.codigoProducto+" - "+this.stock+" - "+this.categoria;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Legía",10,12,"Limpieza",5);
        //getPrecio
        System.out.println(p1.getPrecio());
        //getCodidoProducto
        System.out.println(p1.getCodigoProducto());
        //aplicarDescuento
        System.out.println(p1.aplicarDescuento(10));
        //consultarStock
        System.out.println(p1.consultarStock());
        //actualizarStock
        System.out.println(p1.stock);
        p1.actualizarStock(-13);
        System.out.println(p1.stock);
        //mostrarInformacionProducto
        p1.mostrarInformacionProducto();
        //toString
        System.out.println(p1.toString());
    }
}


