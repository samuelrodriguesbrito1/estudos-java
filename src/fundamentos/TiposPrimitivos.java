package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do Funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpesa = 23; // 1 byte -128 até 127
		short numeroDeVoos = 542; // 2 bytes -32768 até 32767
		int id = 56789; // 4 bytes -2147483648 a 2147483647
		long pontosAcumulados = 3_134_845_223L; // 8 bytes -9223372036854775808 a 9223372036854775807
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // 4 bytes até sete casas decimais
		double vendasAcumuladas = 2_991_797_103.01; // 8 bytes até 16 casas decimais
		
		// Tipo booleano
		boolean estaDeFerias = true; // 1 bit true or false
		
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpesa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
