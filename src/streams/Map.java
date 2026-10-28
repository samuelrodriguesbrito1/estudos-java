package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    static void main(String[] args) {

        Consumer<String> print = System.out::print;
        UnaryOperator<String> maiscula = String::toUpperCase;
        UnaryOperator<String> primeiraLetra = string -> string.charAt(0) + "";
        UnaryOperator<String> grito = string -> string + "!!!";

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        System.out.println("\n\nUsando composição...");
        marcas.stream()
                .map(maiscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);
    }
}
