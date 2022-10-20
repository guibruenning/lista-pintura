package cone;

public class MainCone {
    public static void main(String[] args) {
        Cone c1 = new Cone();

        c1.setRadius(6);
        c1.setHeight(8);
        c1.setOption(0);//opção 1

        System.out.println(c1);

        Cone c2 = new Cone();

        c2.setRadius(3.5);
        c2.setHeight(9);
        c2.setOption(1);//opção 2

        System.out.println(c2);

    }
}
