package oo.encapsulamento;

public class PessoaTeste {

    static void main() {

        Pessoa p1 = new Pessoa(-30);
        p1.setIdade(-30);

        System.out.println(p1.getIdade()); // Ler a variável
    }
}
