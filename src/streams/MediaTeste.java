package streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media();
        Media m2 = new Media();
        m1.adicionar(8.3).adicionar(6.7);
        m2.adicionar(7.9).adicionar(6.6);

        System.out.println(m1.getMedia());
        System.out.println(m2.getMedia());

        System.out.println(Media.combinar(m1, m2).getMedia());
    }
}
