package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    ArrayList<Compra> compras;

    public Cliente(String nome) {
        setNome(nome);
        compras = new ArrayList<Compra>();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public double obterValorTotalCompra() {
        double total = 0;
        for (Compra compra: this.compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
