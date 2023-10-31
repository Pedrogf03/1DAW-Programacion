package Guerreros;

public class Main {

    public static void main(String[] args) {

        Guerrero g = new Guerrero("Pedro", true);
        Guerrero h = new Guerrero("Rocío", false);

        System.out.println(g);
        System.out.println(h);

        g.atacar(h);

        System.out.println(g);
        System.out.println(h);

    }

}
