package cubo;

public class CubeMain {

        public static void main(String[] args) {
            Cube c1 = new Cube();

            c1.setLateral(4.0);
            c1.setRendimento(2.0);
            c1.setOption(0);//option 1

            System.out.println(c1);

            System.out.println();

            Cube c2 = new Cube();

            c2.setLateral(13.56);
            c2.setRendimento(1.5);
            c2.setOption(2);//option 3

            System.out.println(c2);


        }
}
