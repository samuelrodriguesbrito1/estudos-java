package fundamentos;

import java.util.Scanner;

import java.util.Locale;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler número 1
		// Ler número 2
		// Escolher + - * / %
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o valor 1 : ");
		String num1 = entrada.nextLine().replace(",", ".");
		double valor1 = Double.parseDouble(num1);
		
		System.out.print("Entre com a operação desejada [+ - x / %] : ");
		String operador = entrada.nextLine();
		operador = operador.trim();
		
		System.out.print("Entre com o valor 2 : ");
		String num2 = entrada.nextLine().replace(",", ".");
		double valor2 = Double.parseDouble(num2);
		
		double resultado = operador.equals("+") ? valor1 + valor2
				: operador.equals("-") ? valor1 - valor2
				: operador.equals("x") ? valor1 * valor2
				: operador.equals("/") ? valor1 / valor2 
				: operador.equals("%") ? valor1 % valor2
				: 0;
		
		System.out.printf("O resultado de %.1f %s %.1f é igual a : %.2f", valor1, operador, valor2, resultado);
		
		entrada.close();
	}
}
