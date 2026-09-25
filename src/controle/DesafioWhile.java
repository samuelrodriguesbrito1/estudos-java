package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		System.out.println("Turma escolar\n");
		
		do {
			System.out.print("Entre com uma nota de 0 a 10 [-1 para sair] : ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total = total + nota;
				quantidadeDeNotas++;
			}
			
			else if (nota != -1){
				System.out.println("Nota inválida, entre com um número de 0 a 10");
			}
		} while(nota != -1);
		
		// Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("A média da turma é : " + media);
		
		entrada.close();
	}
}
