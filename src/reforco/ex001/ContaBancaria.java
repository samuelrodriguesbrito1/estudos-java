package reforco.ex001;

public class ContaBancaria {

    private double saldo;

    protected void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Impossível depositar valor negativo");
        }
    }

    protected void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            if (valor <= 0) {
                throw new IllegalArgumentException("Valor de saque menor que o mínimo permitido");
            } else {
                throw new IllegalArgumentException("Valor de saque maior que o saldo disponível");
            }
        }
    }
}
