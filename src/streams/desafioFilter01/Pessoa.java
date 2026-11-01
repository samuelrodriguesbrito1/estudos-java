package streams.desafioFilter01;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    private String nome;
    private String funcao;
    private char sexo;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String funcao, char sexo, LocalDate dataNascimento) {
        setNome(nome);
        setFuncao(funcao);
        setSexo(sexo);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("Argumento inválido, deve ser M ou F.");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (!dataNascimento.isAfter(LocalDate.now())) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new IllegalArgumentException("Data inválida, data posterior ao dia atual.");
        }
    }
}
