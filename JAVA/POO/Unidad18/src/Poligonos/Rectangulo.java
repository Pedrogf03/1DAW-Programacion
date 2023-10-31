package Poligonos;

public class Rectangulo extends Poligono{

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) throws IllegalLadoSize{
        super(4);
        if(base < 1 || altura < 1){
            throw new IllegalLadoSize();
        }
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) throws IllegalLadoSize{
        if(base < 1){
            throw new IllegalLadoSize();
        }
        this.base = base;
    }

    public int getAltura() throws IllegalLadoSize{
        if(altura < 1){
            throw new IllegalLadoSize();
        }
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getPerimetro(){
        return (this.base * 2) + (this.altura * 2);
    }

    @Override
    public int getArea(){
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Rectángulo{" +
                "lados=" + this.getNumLados() +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
