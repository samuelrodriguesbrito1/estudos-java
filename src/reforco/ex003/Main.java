package reforco.ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    static void main(String[] args) {

        List<String> frutas = Arrays.asList("banana", null, "kiwi");

        Consumer<String> toUpperCase = string -> {
            System.out.println(string.toUpperCase());
        };

        Consumer<String> length = string -> {
            System.out.println(string.length());
        };

        frutas.forEach(length.andThen(toUpperCase));
    }
}
