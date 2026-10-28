package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    static void main(String[] args) {

        UnaryOperator<String> inverter = string -> new StringBuilder(string).reverse().toString();

        Function<String, Integer> inteiro = string -> Integer.parseInt(string, 2);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(inteiro)
                .forEach(System.out::println);
    }
}
