package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarArCondicionado;

    public Ferrari() {
        super(350);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarArCondicionado() {
        ligarArCondicionado = true;
    }

    @Override
    public void desligarArCondicionado() {
        ligarArCondicionado = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarArCondicionado) {
            return 35;
        } else if (ligarTurbo && ligarArCondicionado) {
            return 30;
        } else if (!ligarTurbo && !ligarArCondicionado) {
            return 20;
        } else {
            return 15;
        }
    }
}
