package reforco.ex007;

import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto("Pomada", 30.0),
                new Produto("Shampoo", 20.0),
                new Produto("Navalha", 50.0)
        );

        List<String> nomesProdutos = produtos.stream().map(produto -> produto.nome).toList();
        List<Double> precosDescontados = produtos.stream().map(produto -> produto.preco * 0.9).toList();
        List<String> produtosFormatados = produtos.stream().map(produto -> String.format(Locale.US, "%s - R$ %.2f", produto.nome, produto.preco)).toList();
        List<Produto> novaLista = produtos.stream().map(produto -> new Produto(produto.nome.toUpperCase(), produto.preco * 1.05)).toList();

        System.out.println(nomesProdutos);
        System.out.println(precosDescontados);
        System.out.println(produtosFormatados);

        for (Produto produto: novaLista) {
            System.out.println(produto.nome);
            System.out.println(produto.preco);
        }

    }
}
