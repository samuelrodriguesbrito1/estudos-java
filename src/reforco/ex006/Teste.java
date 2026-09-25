package reforco.ex006;

public class Teste {

    static void main() {

        Pessoa p1 = new Pessoa("Samuel", 19, null);
        CarteiraIdentidade c1 = new CarteiraIdentidade(p1, "46241777890", "582074097");

        System.out.println(p1.getCarteiraIdentidade().getCpf());
    }
}
