package reforco.ex005;

public interface Pagavel {

    double calcularValor();

    default void exibirValorFormatado() {
        System.out.println(calcularValor());
    }
}
