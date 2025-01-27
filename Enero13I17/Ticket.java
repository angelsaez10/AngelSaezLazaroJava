package Enero13I17;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    LocalDate hoy = LocalDate.now();
    LocalDate sacadoFecha;
    LocalDate validez;
    LocalTime ahora = LocalTime.now();
    LocalTime sacadoHora;
    LocalTime usadoA;
    private int añoActual = hoy.getYear();
    private static int nTickets = 0; // Contador de tickets emitidos
    private static final int MAX_TICKETS = 99999999; // Límite máximo de tickets
    private String ID;
    private boolean usado;

    // Constructor sin parámetros
    public Ticket() {
        if (nTickets >= MAX_TICKETS) {
            throw new IllegalStateException("No se pueden emitir más tickets. Se ha alcanzado el número máximo permitido.");
        }
        System.out.println("Ticket creado.");
        sacadoFecha = hoy;
        sacadoHora = ahora;
        validez = hoy.plusDays(1); // Por defecto, válido hasta mañana
        nTickets++;
        ID = añoActual + "-" + String.format("%08d", nTickets); // Formateo con 8 dígitos
    }

    // Constructor con fecha de validez
    public Ticket(String f) throws IllegalArgumentException {
        if (nTickets >= MAX_TICKETS) {
            throw new IllegalStateException("No se pueden emitir más tickets. Se ha alcanzado el número máximo permitido.");
        }
        LocalDate fecha = LocalDate.parse(f);
        if (fecha.isBefore(hoy)) {
            throw new IllegalArgumentException("La fecha de validez no puede ser anterior a la fecha actual");
        }
        System.out.println("Ticket creado.");
        sacadoFecha = hoy;
        validez = fecha;
        nTickets++;
        ID = añoActual + "-" + String.format("%08d", nTickets); // Formateo con 8 dígitos
    }

    // Métodos
    public boolean isFinDeSemana() {
        String diaDeLaSemana = String.valueOf(hoy.getDayOfWeek());
        return diaDeLaSemana.equalsIgnoreCase("saturday") || diaDeLaSemana.equalsIgnoreCase("sunday");
    }

    public void usar() throws IllegalArgumentException, IllegalStateException {
        if (usado) {
            throw new IllegalStateException("El ticket ya ha sido usado.");
        } else if (hoy.isAfter(validez)) {
            throw new IllegalArgumentException("La validez del ticket ha expirado.");
        }
        System.out.println("Ticket usado.");
        usadoA = ahora;
        usado = true;
    }

    public String toString() {
        String validezStr = (validez != null) ? validez.toString() : "Sin validez";
        return "ID:" + ID + "\t" + "Fecha:" + validezStr + "\t" + "Usado:" + (usado ? usadoA : "NO");
    }

    public static void main(String[] args) {
        try {
            // Prueba: Crear varios tickets y alcanzar el límite
            for (int i = 0; i < 10; i++) { // Cambia 10 a un valor mayor para probar el límite real
                Ticket ticket = new Ticket("2025-12-31");
                System.out.println(ticket);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
