package reforco.ex009;

import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        // Exercício 1

        Predicate<Integer> ehPar = numero -> numero % 2 == 0;

        System.out.println(ehPar.test(4));
        System.out.println(ehPar.test(7));

        // Exercício 2

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Boolean> listaEhPar = numeros.stream().map(ehPar::test).toList();

        System.out.println(listaEhPar);

        // Exercícios 3

        List<String> nomes = List.of("ana", "bruno", "carla", "jo");
        Predicate<String> ehLonga = palavra -> palavra.length() > 4;

        List<Boolean> nomesLongos = nomes.stream().map(ehLonga::test).toList();

        System.out.println(nomesLongos);

        // Exercício 4

        Supplier<String> olaJava = () -> "Olá, Java!";
        Supplier<Double> numeroAleatorio = Math::random;

        System.out.println(olaJava.get());
        System.out.println(numeroAleatorio.get());
        System.out.println(numeroAleatorio.get());

        // Exercício 5

        BiFunction<Integer, Integer, Integer> somar = Integer::sum;

        System.out.println(somar.apply(3, 4));

        // Exercício 6

        BiFunction<String, Integer, String> repetir = String::repeat;

        List<String> letras = List.of("a", "b", "c");

        System.out.println(letras.stream().map(letra -> repetir.apply(letra, 3)).toList());

        // Exercício 7

        BinaryOperator<Integer> maior = (numero1, numero2) -> numero1 > numero2 ? numero1 : numero2; // Usei ternário

        System.out.println(maior.apply(10, 25));

        // Exercício 8

        Consumer<String> imprimirComSeta = (texto) -> System.out.println(">> " + texto);

        List<String> nomesImprimir = List.of("ana", "bruno");

        nomesImprimir.stream().map(String::toUpperCase).forEach(imprimirComSeta);
    }
}
