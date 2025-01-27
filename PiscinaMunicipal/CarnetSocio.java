package PiscinaMunicipal;

import java.time.LocalDate;
import java.util.Random;

public class CarnetSocio {
    private String nombre;
    private String correo;
    private String password;
    private static AbonoNadoLibre[] abonadosLibre = new AbonoNadoLibre[30];
    private static AbonoClaseNatacion[] abonadosClase = new AbonoClaseNatacion[20];
    private LocalDate caducidad = LocalDate.now().plusYears(1);
    private double monedero;
    private String tipo;

    Random random = new Random();
    int numeroAleatorio = random.nextInt(999) + 1;

    public CarnetSocio(String n, String c) {
        nombre = n;
        correo = c;
        password = n.substring(0, 2).toLowerCase() + "." + numeroAleatorio;
        monedero = 0;
    }

    public void pagarCarnet() {
        if (monedero < 30) {
            System.out.println("Saldo insuficiente para pagar el carnet.");
            return;
        }
        monedero -= 30;
        System.out.println("El pago del carnet de socio se ha completado.");
    }

    public void cargarMonedero(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a ingresar no puede ser negativa.");
        }
        monedero += cantidad;
        System.out.println("Se han añadido " + cantidad + " euros a su monedero.");
    }

    private boolean caducado() {
        return LocalDate.now().isAfter(caducidad);
    }

    public void AddAbonoNadoLibre(AbonoNadoLibre persona) {
        for (int i = 0; i < abonadosLibre.length; i++) {
            if (abonadosLibre[i] == null) {
                abonadosLibre[i] = persona;
                return;
            }
        }
        throw new IllegalArgumentException("No hay espacio disponible en el array abonadosLibre.");
    }

    public void AddAbonoNadoClase(AbonoClaseNatacion persona) {
        for (int i = 0; i < abonadosClase.length; i++) {
            if (abonadosClase[i] == null) {
                abonadosClase[i] = persona;
                return;
            }
        }
        throw new IllegalArgumentException("No hay espacio disponible en el array abonadosClase.");
    }

    public void listarAbonosNadoLibreAntesDe(String f) {
        for (AbonoNadoLibre abono : abonadosLibre) {
            if (abono != null && abono.getFecha().isBefore(LocalDate.parse(f))) {
                System.out.println(abono);
            }
        }
    }

    public void cancelarAbonoNadoLibre(String f) {
        for (int i = 0; i < abonadosLibre.length; i++) {
            if (abonadosLibre[i] != null && abonadosLibre[i].getFecha().equals(LocalDate.parse(f))) {
                abonadosLibre[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        CarnetSocio c1 = new CarnetSocio("Angel Saez Lazaro","saezlazaroangel@gmail.com");
        CarnetSocio c2 = new CarnetSocio("Fernando Saez Lazaro","saezlazarofernando@gmail.com");

        c1.AddAbonoNadoLibre(new AbonoNadoLibre("2025-01-01","00:00:00",1));
        c1.AddAbonoNadoLibre(new AbonoNadoLibre("2026-12-31","23:59:59",6));

        c1.listarAbonosNadoLibreAntesDe("2027-01-01");

        c1.AddAbonoNadoLibre(new AbonoNadoLibre("2024-01-01","00:00:00",6));
        c1.AddAbonoNadoLibre(new AbonoNadoLibre("2025-12-31","23:59:59",1));

        c1.cargarMonedero(50);
        
    }
}
