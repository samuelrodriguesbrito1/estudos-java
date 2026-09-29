package reforco.ex001;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args) {
        List<String> nomes = List.of(" ana ", "BRUNO", " Carla");

        Function<String, String> trim = String::trim;

        Function<String, String> toLowerCase = String::toLowerCase;

        Function<String, String> capitalize = string -> {
            if (string.isEmpty()) return string;
            char primeira = string.charAt(0);
            if (primeira >= 'a' && primeira <= 'z') {
                primeira = (char) (primeira - 'a' + 'A');
            }
            return primeira + string.substring(1);
        };

        List<String> nomesFormatados = nomes.stream().map(trim.andThen(toLowerCase).andThen(capitalize)).toList();

        for (String nome: nomesFormatados) {
            System.out.println(nome);
        }
    }
}
