package reforco.ex006;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // Exercício 4

        Function<Double, String> formatarPreco = preco -> String.format(Locale.US, "R$ %.2f", preco);

        List<Double> precos = List.of(10.0, 25.5, 99.9);

        List<String> precosFormatados = precos.stream().map(formatarPreco).toList();

        System.out.println(precosFormatados);

        // Exercício 5

        List<String> numerosTexto = List.of("10", "20", "30");

        List<Integer> numerosMethodReference = numerosTexto.stream().map(Integer::parseInt).toList();
        List<Integer> numerosLambdas = numerosTexto.stream().map(numero -> Integer.parseInt(numero)).toList();

        System.out.println(numerosMethodReference);
        System.out.println(numerosLambdas);

        // Exercício 6

        UnaryOperator<Integer> converter = grausCelsius -> grausCelsius * 9 / 5 + 32;

        List<Integer> celsius = List.of(0, 25, 100);
        List<Integer> fahrenheit = celsius.stream().map(converter).toList();

        System.out.println(fahrenheit);
    }
}
