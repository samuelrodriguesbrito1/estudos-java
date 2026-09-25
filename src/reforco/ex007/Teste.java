package reforco.ex007;

public class Teste {

    static void main() {

        Departamento dp1 = new Departamento("Financeiro", null);
        Departamento dp2 = new Departamento("Recursos Humanos", null);
        Departamento dp3 = new Departamento("Tecnologia da Informação", null);

        Funcionario f1 = new Funcionario("Samuel", 19, "Desenvolvedor de Software", null);
        Funcionario f2 = new Funcionario("Vitor", 20, "Administrador", null);
        Funcionario f3 = new Funcionario("Marcos", 43, "Operador", null);

        dp3.addFuncionario(f1);
        System.out.println(f1.getDepartamento().getNome());
    }
}
