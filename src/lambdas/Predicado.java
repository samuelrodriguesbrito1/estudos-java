package lambdas;

import java.util.function.Predicate;

public class Predicado {

    static void main(String[] args) {

        Predicate<Produto> isCaro = (produto) -> {
          return (produto.preco * (1 - produto.desconto)) > 750;
        };

        Produto p1 = new Produto("Notebook", 3893.89, 0.15);

        System.out.println(isCaro.test(p1));
    }
}
