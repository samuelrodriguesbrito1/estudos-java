package reforco.ex004;

public class Pato implements Nadador, Voador {

    @Override
    public String nadar() {
        return "Nadando...";
    }

    @Override
    public String voar() {
        return "Voando...";
    }
}
