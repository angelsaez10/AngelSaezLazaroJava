public class Funciones {
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && (año % 100 != 0 || (año % 100 == 0 && año % 400 == 0)));
    }

    public static int obtenerDiasMes(String mes, int año) {
        switch (mes) {
            case "febrero":
                return esBisiesto(año) ? 29 : 28;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                return 30;
            default:
                return 31;
        }
    }

    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Verificar divisores solo hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // No es primo si tiene divisores
            }
        }

        return true; // Es primo si no se encontró ningún divisor
    }
    
}
