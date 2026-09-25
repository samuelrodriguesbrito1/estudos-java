package reforco.ex008;

import java.util.ArrayList;

public class Curso {

    String nome;
    ArrayList<Aluno> alunos;

    Curso(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
