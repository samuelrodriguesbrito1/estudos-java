package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    static void main() {

        Queue<String> fila = new LinkedList<>();

        // offer e add -> adicionam elementos na fila
        // a diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek e element -> obter próximo elemento
        // a diferença é o comportamento quando a fila está vazia
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // retorna exceção

        // fila.size()
        // fila.clear()
        // fila.isEmpty()
        // fila.constains()

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // retorna exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
