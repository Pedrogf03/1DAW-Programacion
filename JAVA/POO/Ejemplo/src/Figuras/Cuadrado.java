package Figuras;

public class Cuadrado {

    //Atributos
    private int lado;

    //Constructor
    public Cuadrado(int lado){
        if(lado < 0){
            throw new IllegalArgumentException();
        }
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        if(lado < 0){
            throw new IllegalArgumentException();
        }
        this.lado = lado;
    }

    public int area(){
        return this.lado * this.lado;
    }

    public int perimetro(){
        return this.lado * 4;
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(-5);
        System.out.println(c);
    }

}
