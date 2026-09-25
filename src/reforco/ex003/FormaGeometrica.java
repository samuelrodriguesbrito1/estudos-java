package reforco.ex003;

public abstract class FormaGeometrica {

    protected double area;

    abstract void calcularArea();

    public double exibirArea() {
        return area;
    }
}
