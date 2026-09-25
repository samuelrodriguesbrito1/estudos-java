package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public boolean acelerar() {
        if (velocidadeAtual + getDelta() > this.VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
            return false;
        } else {
            this.velocidadeAtual += getDelta();
            return true;
        }
    }

    public boolean frear() {
        if (this.velocidadeAtual >= delta) {
            this.velocidadeAtual -= delta;
            return true;
        } else {
            this.velocidadeAtual = 0;
            return false;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
        return "A velocidade do carro é : " + velocidadeAtual + "km/h";
    }
}
