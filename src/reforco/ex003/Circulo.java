package reforco.ex003;

public class Circulo extends FormaGeometrica {

    private double raio;

    Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double valor) {
        if (valor > 0) {
            raio = valor;
        } else {
            throw new IllegalArgumentException("Raio não pode ser menor ou igual a 0");
        }
    }

    @Override
    void calcularArea() {
        area = Math.pow(raio, 2) * 3.14;
    }
}
