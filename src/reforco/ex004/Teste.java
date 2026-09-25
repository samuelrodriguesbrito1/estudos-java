package reforco.ex004;

public class Teste {

    static void main() {

        Nadador p1 = new Pato();
        Voador p2 = new Pato();
        Aviao a1 = new Aviao();
        Voador a2 = new Aviao();

        System.out.println(p1.nadar());
        System.out.println(p2.voar());
        System.out.println(a1.voar());
        System.out.println(a2.voar());
    }
}
