package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    static void main(String[] args) {


        Function<Produto, Double> desconto = (produto) -> {
            return produto.preco * (1 - produto.desconto);
        };

        UnaryOperator<Double> imposto = preco -> {
            return preco >= 2500 ? preco * 1.085 : preco;
        };

        UnaryOperator<Double> frete = preco -> {
            return preco >= 3000 ? preco + 100 : preco + 50;
        };

        UnaryOperator<Double> arredondar = preco -> {
            return (double) (Math.round(preco * 100) / 100);
        };

        Function<Double, String> formatar = preco -> {
            return ("R$" + preco).replace(".", ",");
        };

        Produto p1 = new Produto("iPad", 3235.89, 0.13);

        String precoFinal = desconto
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p1);

        System.out.println("O preço final é " + precoFinal);
    }
}
