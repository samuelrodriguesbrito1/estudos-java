package reforco.ex005;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<String> nomes = List.of("ana", "bruno", "carla");

        List<Integer> numerosTriplicados = numeros.stream().map(num -> num * 3).toList();
        List<String> nomesMaiusculos = nomes.stream().map(String::toUpperCase).toList();
        List<Integer> lista = nomes.stream().map(String::length).toList();

        System.out.println(numerosTriplicados);
        System.out.println(nomesMaiusculos);
        System.out.println(lista);
    }
}
