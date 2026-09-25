package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    static void main(String[] args) {

        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> isTresDigitos =
                numero -> numero >= 100 && numero <= 999;

        System.out.println(isPar.and(isTresDigitos).test(2));
        System.out.println(isPar.or(isTresDigitos).test(101));
    }
}
