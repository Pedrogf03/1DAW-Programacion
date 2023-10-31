package Poligonos;

public abstract class Poligono {

    private int numLados;

    public Poligono(int numLados){
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }
    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract int getPerimetro();
    public abstract int getArea();

    static int sumaAreas(Poligono[] figuras){
        int suma = 0;
        for(Poligono p:figuras){
            suma+=p.getArea();
        }
        return suma;
    }

}
