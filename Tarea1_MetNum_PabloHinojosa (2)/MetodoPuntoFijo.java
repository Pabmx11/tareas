package PROGRAMAS;

public class MetodoPuntoFijo {

    public static void ejecutar(double x0, double epsilon, int maxIter) {
        double xActual = x0;
        double xAnterior;
        double errorPorcentual = 1.0; // Inicialización para asegurar el ingreso al bucle
        int iteracion = 0;


        System.out.println("Iteración |      x_actual      |   Error Porcentual (|x_act - x_ant| / |x_act| * 100)");

        while (errorPorcentual > epsilon && iteracion < maxIter) {
            xAnterior = xActual;

            // Llamada modular a la función g(x) de la otra clase
            xActual = Evaluador.g(xAnterior);
            iteracion++;

            // Cálculo del Error Porcentual: diferencia relativa a x_actual, expresada en %
            errorPorcentual = Math.abs(xActual - xAnterior) / Math.abs(xActual) * 100;

            System.out.printf("   %2d     |   %.8f   |   %.8f%n", iteracion, xActual, errorPorcentual);
        }
        System.out.println("---------------------------------------------------------------");
        if (errorPorcentual <= epsilon) {
            System.out.println("-> Convergencia alcanzada en la iteración " + iteracion);
            System.out.printf("-> Raíz aproximada: %.8f%n", xActual);
        } else {
            System.out.println("-> Se alcanzó el límite máximo de iteraciones sin lograr la tolerancia.");
        }
    }
}






