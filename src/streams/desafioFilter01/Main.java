package streams.desafioFilter01;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Consumer<Pessoa> imprimirPessoa = pessoa -> {
            System.out.println("==============================");
            System.out.println("Nome : " + pessoa.getNome());
            System.out.println("Função : " + pessoa.getFuncao());
            System.out.println("Sexo : " + pessoa.getSexo());
            System.out.println("Data de Nascimento : " + pessoa.getDataNascimento());
            System.out.println("===============================\n");
        };

        Predicate<Pessoa> homens = pessoa -> pessoa.getSexo() == 'M';
        Predicate<Pessoa> depoisDe2000 = pessoa -> pessoa.getDataNascimento().isAfter(LocalDate.of(2000, 1, 1));

        Pessoa p1 = new Pessoa("Samuel", "Programador", 'M', LocalDate.of(2007, 5, 3));
        Pessoa p2 = new Pessoa("Vitor", "Administrador", 'M', LocalDate.of(2006, 2, 23));
        Pessoa p3 = new Pessoa("Marcos", "Operador de Logística", 'M', LocalDate.of(1982, 7, 23));
        Pessoa p4 = new Pessoa("Tamar", "Manicure", 'F', LocalDate.of(1982, 1, 23));

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4);

        pessoas.stream().filter(homens).filter(depoisDe2000).forEach(imprimirPessoa);

    }
}
