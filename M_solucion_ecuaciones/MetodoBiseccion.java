package M_solucion_ecuaciones;

public class MetodoBiseccion {
    public static double biseccion(double a, double b, double tol, int maxIter) {
        if (FuncionMatematica.f(a) * FuncionMatematica.f(b) >= 0) {
            System.out.println("El método no se puede aplicar en el intervalo dado.");
            return Double.NaN;
        }

        double xr = a;

        // Encabezado de la tabla
        System.out.printf("%-5s %-10s %-10s %-10s %-12s%n", "Iter", "a", "b", "xr", "f(xr)");

        for (int i = 0; i < maxIter; i++) {
            xr = (a + b) / 2.0;
            double fxr = FuncionMatematica.f(xr);

            // Imprime la fila de esta iteración
            System.out.printf("%-5d %-10.6f %-10.6f %-10.6f %-12.6f%n", i + 1, a, b, xr, fxr);

            if (Math.abs(fxr) < tol || (b - a) / 2.0 < tol) {
                return xr;
            }

            if (FuncionMatematica.f(a) * fxr < 0) {
                b = xr;
            } else {
                a = xr;
            }
        }
        return xr;
    }
}
