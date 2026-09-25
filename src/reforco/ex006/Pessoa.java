package reforco.ex006;

public class Pessoa {

    private String nome;
    private int idade;
    private CarteiraIdentidade carteiraIdentidade;

    Pessoa(String nome, int idade, CarteiraIdentidade carteiraIdentidade) {
        this.nome = nome;
        this.idade = idade;
        this.carteiraIdentidade = carteiraIdentidade;
        if (carteiraIdentidade != null) {
            carteiraIdentidade.setPessoa(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public CarteiraIdentidade getCarteiraIdentidade() {
        return carteiraIdentidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCarteiraIdentidade(CarteiraIdentidade carteiraIdentidade) {
        this.carteiraIdentidade = carteiraIdentidade;
    }
}
