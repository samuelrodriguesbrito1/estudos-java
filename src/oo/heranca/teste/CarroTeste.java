package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    static void main() {

        Ferrari carro = new Ferrari(300);

        carro.acelerar();
        System.out.println(carro);
        carro.acelerar();

        carro.ligarTurbo();
        System.out.println(carro);

        carro.acelerar();

        carro.ligarArCondicionado();
        carro.desligarTurbo();

        carro.acelerar();

        System.out.println(carro);
    }
}
