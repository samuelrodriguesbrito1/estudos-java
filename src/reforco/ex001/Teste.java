package reforco.ex001;

public class Teste {

    static void main() {

        ContaBancaria conta = new ContaBancaria();

        try {
            conta.depositar(1000);
            conta.sacar(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }
}
