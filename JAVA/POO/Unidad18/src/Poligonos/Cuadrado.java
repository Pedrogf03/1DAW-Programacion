package Poligonos;

public class Cuadrado extends Poligono{

    private int lado;

    public Cuadrado(int lado) throws IllegalLadoSize{
        super(4);
        if(lado < 1){
            throw new IllegalLadoSize();
        }
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) throws IllegalLadoSize{
        if(lado < 1) {
            throw new IllegalLadoSize();
        }
        this.lado = lado;
    }

    @Override
    public int getPerimetro(){
        return this.lado * 4;
    }

    @Override
    public int getArea(){
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lados=" + this.getNumLados() +
                ", lado=" + lado +
                '}';
    }
}
