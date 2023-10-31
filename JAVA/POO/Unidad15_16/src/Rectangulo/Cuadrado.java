package Rectangulo;

public class Cuadrado extends Rectangulo{

    public Cuadrado(int lado){
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado1 +
                '}';
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(5);

        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.perimetro());
    }

}
