package Rectangulo;

public class Rectangulo {

    int lado1;
    int lado2;

    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        if(this.lado1 < 0){
            this.lado1 = 1;
        }
        this.lado2 = lado2;
        if(this.lado2 < 0){
            this.lado2 = 1;
        }
    }

    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado) {
        this.lado1 = lado;
        if(this.lado1 < 0){
            this.lado1 = 1;
        }
    }

    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado) {
        this.lado2 = lado;
        if(this.lado2 < 0){
            this.lado2 = 1;
        }
    }

    public int area(){
        return this.lado1 * this.lado2;
    }

    public int perimetro(){
        return (this.lado1 * 2) + (this.lado2 * 2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(5, 10);

        System.out.println(r);
        System.out.println(r.area());
        System.out.println(r.perimetro());

    }

}
