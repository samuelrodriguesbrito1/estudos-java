package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    private ArrayList<Item> itens;

    public Compra() {
        itens = new ArrayList<Item>();
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double obterValorTotal() {
        double total = 0;
        for (Item item: itens) {
            total += item.getQuantidade() * item.getProduto().getPreco();
        }
        return total;
    }
}
