package Poligonos;

import static Poligonos.Poligono.sumaAreas;

public class Main {

    public static void main(String[] args) {

        Cuadrado c = null;
        Rectangulo r = null;
        HexagonoRegular h = null;

        try{
            c = new Cuadrado(20);
            r = new Rectangulo(6, 4);
            h = new HexagonoRegular(6);

            System.out.println(c);
            System.out.println("Perimetro: "+ c.getPerimetro());
            System.out.println("Área: "+ c.getArea());

            System.out.println(r);
            System.out.println("Perimetro: "+ r.getPerimetro());
            System.out.println("Área: "+ r.getArea());

            System.out.println(h);
            System.out.println("Perimetro: "+ h.getPerimetro());
            System.out.println("Área: "+ h.getArea());

            Poligono[] arrayF = {c, r, h};

            System.out.println("Suma de las áreas: "+ sumaAreas(arrayF));
        } catch (IllegalLadoSize e){
            e.printStackTrace();
        }

    }

}
