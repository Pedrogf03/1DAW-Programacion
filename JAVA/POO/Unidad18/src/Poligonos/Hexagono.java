package Poligonos;

public abstract class Hexagono extends Poligono{

    public Hexagono(){
        super(6);
    }

    @Override
    public abstract int getPerimetro();

    @Override
    public abstract int getArea();

}
