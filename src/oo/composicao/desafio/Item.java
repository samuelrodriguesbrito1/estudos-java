package oo.composicao.desafio;

public class Item {

    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        setQuantidade(quantidade);
        setProduto(produto);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
