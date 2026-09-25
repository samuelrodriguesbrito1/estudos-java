package reforco.ex003;

public class Teste {

    static void main() {

        Circulo c1 = new Circulo(10);

        c1.calcularArea();

        System.out.println(c1.exibirArea());

        Retangulo r1 = new Retangulo(10, 2);

        r1.calcularArea();

        System.out.println(r1.exibirArea());
    }
}
