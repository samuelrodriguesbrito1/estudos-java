package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconnto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconnto ? "sim" : "não";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
