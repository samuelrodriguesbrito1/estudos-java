package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2; 
		boolean comprouTV32 = trabalho1 ^ trabalho2; 
		boolean comprouSorvete = trabalho1 || trabalho2; 
		boolean maisSaudavel = !comprouSorvete; // Operador Unário
		
		System.out.println("TV de 50 polegadas? " + comprouTV50);
		System.out.println("TV de 32 polegadas? " + comprouTV32);
		System.out.println("Sorvete no final? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
