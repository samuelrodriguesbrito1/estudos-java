package reforco.ex008;

public class Teste {

    public static void matricular(Aluno aluno, Curso curso) {
        aluno.addCurso(curso);
        curso.addAluno(aluno);
    }

    static void main() {
        Aluno aluno = new Aluno("Samuel");
        Curso curso = new Curso("Análise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Psicologia");
        Curso curso3 = new Curso("Biologia");

        matricular(aluno, curso);
        matricular(aluno, curso2);
        matricular(aluno, curso3);


        for(Curso c1: aluno.cursos) {
            System.out.println(c1.nome);
        }

        for(Aluno a1: curso.alunos) {
            System.out.println(a1.nome);
        }
    }
}
