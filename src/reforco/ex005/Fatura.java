package reforco.ex005;

public class Fatura implements Pagavel {

    private double valor;
    private int qtdVendidas;

    Fatura(double valor, int qtdVendidas) {
        this.valor = valor;
        this.qtdVendidas = qtdVendidas;
    }

    @Override
    public double calcularValor() {
        return valor * qtdVendidas;
    }
}
