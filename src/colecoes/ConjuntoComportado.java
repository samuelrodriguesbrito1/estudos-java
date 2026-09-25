package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    static void main() {

        Set<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

    }
}
