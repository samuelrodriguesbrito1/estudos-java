package reforco.ex008;

import java.util.ArrayList;

public class Aluno {

    String nome;
    ArrayList<Curso> cursos;

    Aluno(String nome) {
        this.nome = nome;
        cursos = new ArrayList<Curso>();
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }
}
