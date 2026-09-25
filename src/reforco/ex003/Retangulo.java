package reforco.ex003;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public void setAltura(double valor) {
        if (valor > 0) {
            altura = valor;
        } else {
            throw new IllegalArgumentException("Altura não pode ser menor que 0");
        }
    }

    public void setBase(double valor) {
        if (valor > 0) {
            base = valor;
        } else {
            throw new IllegalArgumentException("Base não pode ser menor que 0");
        }
    }

    @Override
    void calcularArea() {
        area = base * altura;
    }
}
