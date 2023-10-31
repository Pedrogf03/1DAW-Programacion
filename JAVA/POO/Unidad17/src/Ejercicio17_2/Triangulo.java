package Ejercicio17_2;

import java.util.Scanner;

public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;
    private String tipo;

    public Triangulo(int lado1, int lado2, int lado3) throws InvalidTriangleException{
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        if(lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado3 + lado1 < lado2){
            throw new InvalidTriangleException();
        } else {
            if(lado1 == lado2 && lado2 == lado3){
                tipo = "Equilátero";
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                tipo = "Escaleno";
            } else {
                tipo = "Isósceles";
            }
        }
    }


    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo t = null;
        boolean fallo;

        do{
            System.out.println("Lado 1: ");
            int lado1 = Integer.parseInt(sc.nextLine());
            System.out.println("Lado 2: ");
            int lado2 = Integer.parseInt(sc.nextLine());
            System.out.println("Lado 3: ");
            int lado3 = Integer.parseInt(sc.nextLine());


            try{
                t = new Triangulo(lado1, lado2, lado3);
                fallo = false;
            } catch (InvalidTriangleException e){
                System.out.println("No se puede crear un triangulo con esos lados.");
                fallo = true;
            }
        } while (fallo);

        System.out.println(t);

    }

}
