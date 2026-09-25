package lambdas;

public class CalculoTeste {

    static void main() {

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));
    }

}
