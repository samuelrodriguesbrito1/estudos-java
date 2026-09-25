package lambdas;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = this.preco * (1 - this.desconto);
        return this.nome + " tem preço de R$" + precoFinal;
    }
}
