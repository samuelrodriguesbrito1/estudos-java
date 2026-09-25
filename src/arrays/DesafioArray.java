package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		System.out.println("Notas");
		System.out.print("Quantas notas serão registradas? : ");
		
		Scanner entrada = new Scanner(System.in);

		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.printf("Informe a %dª nota : ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		entrada.close();
		
		double total = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / qtdNotas;
		
		System.out.printf("A média é : %.2f", media);
	}
}
