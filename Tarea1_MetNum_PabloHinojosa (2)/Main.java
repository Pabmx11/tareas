package PROGRAMAS;

public class Main {
    public static void main(String[] args) {
        double x0 = 1.0;          // Valor inicial (semilla)
        double epsilon = 0.001;   // Criterio de paro (tolerancia)
        int maxIteraciones = 100; // Límite de seguridad

        // Ejecución modular
        MetodoPuntoFijo.ejecutar(x0, epsilon, maxIteraciones);
    }
}