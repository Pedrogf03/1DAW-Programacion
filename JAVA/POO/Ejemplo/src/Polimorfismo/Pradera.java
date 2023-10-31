package Polimorfismo;

public class Pradera {

    public static void main(String[] args) {

        Vaca v = new Vaca();
        Perro p = new Perro();
        Gato g = new Gato();

        System.out.println(v.ruido());
        System.out.println(v.pisar(p));
        System.out.println(p.pisar(g));
        System.out.println(g.pisar(v));
        System.out.println(v.pisarDoble(p, g));

        Animal[] a1 = {v, g, p};

        Animal.hacerRuido(a1);

    }

}
