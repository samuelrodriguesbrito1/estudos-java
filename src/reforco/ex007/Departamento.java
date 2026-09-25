package reforco.ex007;

import java.util.ArrayList;

public class Departamento {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    Departamento(String nome, ArrayList<Funcionario> funcionarios) {
        setNome(nome);
        setFuncionarios(funcionarios);
        if (funcionarios != null) {
            for(Funcionario funcionario: funcionarios) {
                funcionario.setDepartamento(this);
            }
        } else {
            setFuncionarios(new ArrayList<Funcionario>());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            System.out.println("entrou aqui");
            funcionario.setDepartamento(this);
            funcionarios.add(funcionario);
        }
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
