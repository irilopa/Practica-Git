package principal;

public class Calculadora {
	/**
	 * Realiza la suma de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return La suma de los dos números.
	 */
	public static int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Realiza la resta de dos números enteros.
	 *
	 * @param a El primer número entero (minuendo).
	 * @param b El segundo número entero (sustraendo).
	 * @return La diferencia entre los dos números.
	 */
	public static int restar(int a, int b) {
		return a - b;
	}

	/**
	 * Realiza la multiplicación de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El producto de los dos números.
	 */
	public static int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * Realiza la división de dos números.
	 *
	 * @param a El numerador (dividendo).
	 * @param b El denominador (divisor).
	 * @return El cociente de la división como un número de punto flotante.
	 * @throws IllegalArgumentException Si el divisor es igual a cero.
	 */
	public static double dividir(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir por cero");
		}
		return a / b;
	}
}
