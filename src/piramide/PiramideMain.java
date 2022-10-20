package piramide;

public class PiramideMain {

    public static void main(String[] args) {
        Piramide c1 = new Piramide();

        c1.setArestaBase(13.89);
        c1.setAltura(41.87);
        c1.setOption(2);//opção 3

        System.out.println(c1);

        Piramide c2 = new Piramide();

        c2.setArestaBase(3.56);
        c2.setAltura(23.18);
        c2.setOption(0);//opção 1

        System.out.println(c2);

    }
}
