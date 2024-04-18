package principal;

public class Auxiliar {
	/**
	 * Realiza una operación utilizando la calculadora.
	 *
	 * @param num1 El primer número entero.
	 * @param num2 El segundo número entero.
	 */
	public static void realizarOperacion(int num1, int num2) {
		// Suma
		int resultSum = Calculadora.sumar(num1, num2);
		System.out.println("Suma de " + num1 + " y " + num2 + " es: " + resultSum);

		// Resta
		int resultSubtract = Calculadora.restar(num1, num2);
		System.out.println("Resta de " + num1 + " y " + num2 + " es: " + resultSubtract);

		// Multiplicación
		int resultMultiply = Calculadora.multiplicar(num1, num2);
		System.out.println("Multiplicación de " + num1 + " y " + num2 + " es: " + resultMultiply);

		// División
		double resultDivide = Calculadora.dividir(num1, num2);
		System.out.println("División de " + num1 + " entre " + num2 + " es: " + resultDivide);
	}
}
