package oo.composicao.desafio;

public class Main {

    static void main(String[] args) {

        Cliente c1 = new Cliente("Samuel");

        Produto prod001 = new Produto("Colher", 4.99);
        Produto prod002 = new Produto("Garfo", 4.99);
        Produto prod003 = new Produto("Prato", 10.99);

        Item i01 = new Item(10, prod001);
        Item i02 = new Item(7, prod002);
        Item i03 = new Item(3, prod003);

        Compra compra1 = new Compra();
        compra1.adicionarItem(i01);
        compra1.adicionarItem(i02);
        compra1.adicionarItem(i03);

        Compra compra2 = new Compra();
        compra2.adicionarItem(i01);

        c1.adicionarCompra(compra1);
        c1.adicionarCompra(compra2);

        System.out.println(c1.obterValorTotalCompra());
    }
}
