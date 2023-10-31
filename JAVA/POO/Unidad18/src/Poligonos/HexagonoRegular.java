package Poligonos;

public class HexagonoRegular extends Hexagono{

    private int lado;

    public HexagonoRegular(int lado) throws IllegalLadoSize{
        super();
        if(lado < 1){
            throw new IllegalLadoSize();
        }
        this.lado = lado;
    }

    @Override
    public int getPerimetro() {
        return this.lado * this.getNumLados();
    }

    public int getApotema(){

        float hipotenusa = this.lado;
        float cateto1 = this.lado / 2f;
        double cateto2 = Math.sqrt(Math.pow(hipotenusa,2) + (Math.pow(cateto1, 2)));
        return (int)cateto2;

    }

    @Override
    public int getArea() {
        return (this.getPerimetro() * this.getApotema()) / 2;
    }

    @Override
    public String toString() {
        return "HexagonoRegular{" +
                "lados=" + this.getNumLados() +
                ", lado=" + lado +
                '}';
    }
}
