package classe.desafio;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nome, double peso) {
		this.nomePessoa = nome;
		this.pesoPessoa = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá, eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " kgs.";
	}
}
