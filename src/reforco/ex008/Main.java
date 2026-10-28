package reforco.ex008;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Exercício 11

        List<String> frases = List.of("java é legal", "stream é útil");

        List<Integer> tamanhoFrase = frases.stream().map(frase -> frase.replace(" ", "")).map(String::length).toList();

        System.out.println(tamanhoFrase);

        // Exercício 12

        Function<Integer, Integer> dobro = num -> num * 2;

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> numerosMap = numeros.stream().map(dobro).map(numero -> numero + 1).toList();

        System.out.println(numerosMap);
    }
}
