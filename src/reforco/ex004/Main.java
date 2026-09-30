package reforco.ex004;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    static void main(String[] args) {

        BiFunction<Double, Double, Double> aplicarDesconto = (preco, percentualDesconto) -> {
          return preco * (1 - percentualDesconto / 100);
        };

        Function<Double, String> formatar = preco -> {
            Locale localBr = Locale.forLanguageTag("pt-br");
            NumberFormat formatarMoeda = NumberFormat.getCurrencyInstance(localBr);
            return formatarMoeda.format(preco);
        };

        System.out.println(aplicarDesconto.andThen(formatar).apply(100.0, 10.0));
        System.out.println(aplicarDesconto.andThen(formatar).apply(99.9, 10.0));
    }
}
