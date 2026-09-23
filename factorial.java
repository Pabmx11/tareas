// Definición de la clase principal factorial
public class factorial {

    /**
     * Método recursivo para calcular el factorial de un número entero.
     * Utiliza el tipo primitivo 'int' (32 bits con signo), por lo que está
     * limitado a valores de n <= 12 antes de que ocurra un desbordamiento (overflow).
     * 
     * @param n Número entero del cual se desea calcular el factorial
     * @return El factorial de n como un entero de 32 bits
     */
    public static int factorial(int n) {
        // Caso base: el factorial de 0 o 1 es igual a 1
        if (n <= 1) {
            return 1; // Detiene la recursión y retorna el valor base
        }

        // Caso recursivo: n! = n * (n - 1)!
        // Multiplica el valor actual 'n' por el resultado del factorial de 'n - 1'
        return n * factorial(n - 1);
    }

    // Método principal: punto de entrada de la aplicación
    public static void main(String[] args) {
        // Número de prueba para calcular su factorial
        int numero = 5;

        // Llamada al método recursivo y almacenamiento del resultado en una variable de tipo int
        int resultado = factorial(numero);

        // Imprime el resultado en la consola
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
