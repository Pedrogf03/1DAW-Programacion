package Figuras;

public class Rectangulo {

    //Atributos
    private float base;
    private float altura;

    //Constructor
    public Rectangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    //Métodos

    //Getter y Setter de altura
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
        if(this.altura < 0) {
            this.altura = 0;
        }
    }
    //Getter y Setter de base
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
        if(this.base < 0) {
            this.base = 0;
        }
    }

    public float perimetro() {
        return (this.base * 2.0f) + (this.altura * 2.0f);
    }
    public float area() {
        return this.base * this.altura;
    }

    //toString
    @Override
    public String toString() {
        return "Figuras.Rectangulo{base="+ base +", altura=" + altura +"}";
    }

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(3.0f, 4.0f);

        System.out.println(r);
        System.out.println("La base de r es "+ r.getBase());
        System.out.println("La altura de r es "+ r.getAltura());
        System.out.println("El perímetro de r es "+ r.perimetro());
        System.out.println("El área de r es "+ r.area());
    }

}
