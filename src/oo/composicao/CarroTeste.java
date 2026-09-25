package oo.composicao;

public class CarroTeste {

    static void main() {

        Carro c1 = new Carro();
        c1.ligar();
        System.out.println(c1.estaLigado());
        System.out.println(c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.freiar();
        c1.freiar();
        c1.freiar();
        c1.freiar();

//        Faltou encapsulamento!!!
//        c1.motor.fatorInjecao = -30;
        System.out.println(c1.motor.giros());
    }
}
