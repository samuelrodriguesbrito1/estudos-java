package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> somar = (acumulador, num) -> acumulador + num;

        Integer soma = nums.stream().reduce(somar).get();
        System.out.println(soma);

        Integer soma2 = nums.parallelStream().reduce(100, somar); // parallelStream influencia no resultado
        System.out.println(soma2);

        nums.stream()
                .filter(n -> n > 5)
                .reduce(somar)
                .ifPresent(System.out::println);
    }
}
