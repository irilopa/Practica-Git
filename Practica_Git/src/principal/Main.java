package principal;

public class Main {
	 /**
     * Método principal que muestra ejemplos de uso de la calculadora.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
	public static void main(String[] args) {
		// Ejemplos de uso de la calculadora
		int num1 = 10;
		int num2 = 5;

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
