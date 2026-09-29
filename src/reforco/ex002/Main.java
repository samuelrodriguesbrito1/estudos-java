package reforco.ex002;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    static void main(String[] args) {

        List<String> palavras = List.of("banana", "abacate", "casa", "uva2", "melão", "elefante", "pera", "kiwi5", "laranja");

        Predicate<String> temMaisDe4Letras = string -> string.length() > 4;

        Predicate<String> comecaComVogal = string -> string.substring(0, 1).matches("[aeiouAEIOU]");

        Predicate<String> contemNumero = string -> string.chars().anyMatch(Character::isDigit);

        List<String> novasPalavras = palavras.stream().filter(temMaisDe4Letras.and(comecaComVogal.negate().or(contemNumero))).toList();

        novasPalavras.forEach(System.out::println);
    }
}
