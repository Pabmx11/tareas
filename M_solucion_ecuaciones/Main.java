package M_solucion_ecuaciones;

public class Main {
    public static void main(String[] args) {
        // Ejecuta la bisección en el intervalo [1.0, 1.6] con una tolerancia de 0.00001 y 100 iteraciones máx.
        double raiz = MetodoBiseccion.biseccion(1.0, 2.0, 1e-5, 100);
        System.out.println("Raíz aproximada: " + raiz);
    }
}