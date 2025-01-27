import java.time.LocalDate;

public class Arrancar {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        String diaDeLaSemana = String.valueOf(hoy.getDayOfWeek());
        if (diaDeLaSemana.equalsIgnoreCase("saturday")||diaDeLaSemana.equalsIgnoreCase("sunday")){
            System.out.println("Fin de semana");
        }
        System.out.println(diaDeLaSemana);
    }
}
