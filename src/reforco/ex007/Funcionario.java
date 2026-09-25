package reforco.ex007;

public class Funcionario {

    private String nome;
    private int idade;
    private String cargo;
    private Departamento departamento;

    Funcionario(String nome, int idade, String cargo, Departamento departamento) {
        setNome(nome);
        setIdade(idade);
        setCargo(cargo);
        setDepartamento(departamento);
        if (departamento != null) {
            departamento.addFuncionario(this);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválida");
        }
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
