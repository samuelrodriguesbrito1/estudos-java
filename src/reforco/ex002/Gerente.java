package reforco.ex002;

public class Gerente extends Funcionario {

    @Override
    double calcularBonus() {
        return salario;
    }
}
