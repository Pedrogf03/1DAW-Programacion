package Dado;

public class LanzaDados {

    public static void main(String[] args) {

        Dado c1 = new Dado();
        Dado c2 = new Dado(4);
        Dado c3 = new Dado(8, 12);
        Dado c4 = new Dado(12, 24);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("Lanzando dados...");
        c1.roll();
        c2.roll();
        c3.roll();
        c4.roll();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }

}
