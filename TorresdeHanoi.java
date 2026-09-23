// Definición de la clase principal TorresdeHanoi
public class TorresdeHanoi {

    /**
     * Método recursivo para resolver el problema de las Torres de Hanoi.
     * 
     * @param n Cantidad de discos a mover
     * @param origen Torre o poste de origen
     * @param auxiliar Torre o poste auxiliar/temporal
     * @param destino Torre o poste de destino final
     */
    public static void resolverHanoi (int n, char origen, char auxiliar, char destino) {
        // Caso base: Si no hay discos por mover (n == 0), se detiene la recursión
        if (n == 0) {
            return; // Termina la llamada recursiva actual
        }

        // Paso 1: Mover recursivamente los n - 1 discos superiores desde 'origen' hacia 'auxiliar', usando 'destino' como apoyo
        resolverHanoi(n - 1, origen, destino, auxiliar);

        // Paso 2: Mover el disco más grande restante (disco n) directamente de 'origen' a 'destino'
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Paso 3: Mover recursivamente los n - 1 discos que quedaron en 'auxiliar' hacia 'destino', usando 'origen' como apoyo
        resolverHanoi(n - 1, auxiliar, origen, destino);
    }

    // Método principal: punto de entrada del programa
    public static void main(String [] args) {
        // Definición del número de discos iniciales a resolver
        int discos = 4;

        // Imprime un mensaje indicando el inicio del proceso y la cantidad de discos
        System.out.println("Resolviendo Torres de Hanoi para " + discos + " discos:\n");

        // Llamada inicial al algoritmo con 4 discos: origen en torre 'A', auxiliar 'B' y destino 'C'
        resolverHanoi(discos, 'A', 'B', 'C');
    }
}
