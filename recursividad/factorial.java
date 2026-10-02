import java.math.BigInteger;

// Definición de la clase principal factorial
public class factorial {

    /**
     * Método recursivo para calcular el factorial de un número.
     * Utiliza BigInteger para soportar números y resultados de más de 32 bits (y 64 bits) sin desbordamiento.
     * 
     * @param n Número del cual se desea calcular el factorial como BigInteger
     * @return El factorial de n como BigInteger
     */
    public static BigInteger factorial(BigInteger n) {
        // Caso base: el factorial de 0 o 1 es igual a 1
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE; // Detiene la recursión y retorna 1
        }

        // Caso recursivo: n! = n * (n - 1)!
        // Multiplica el valor actual 'n' por el resultado de factorial(n - 1)
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    /**
     * Sobrecarga de conveniencia para calcular el factorial a partir de un entero largo (long).
     * 
     * @param n Número entero del cual se desea calcular el factorial
     * @return El factorial de n como BigInteger
     */
    public static BigInteger factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        return factorial(BigInteger.valueOf(n));
    }

    // Método principal: punto de entrada de la aplicación
    public static void main(String[] args) {
        // Número de prueba (ejemplo: 30, cuyo factorial supera los 32 y 64 bits)
        long numero = 30;

        // Llamada al método recursivo y almacenamiento del resultado en una variable BigInteger
        BigInteger resultado = factorial(numero);

        // Imprime el resultado en la consola
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
